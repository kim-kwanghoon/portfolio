package example.hoon.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import example.hoon.model.BoardDto;
import example.hoon.model.BoardFileDto;
import example.hoon.model.BoardListModel;
import example.hoon.model.CommentDto;

@Service
public class BoardService {

	@Autowired
	BoardDao bdDao;

	public List<BoardDto> getListAdd() {
		return bdDao.getListAdd();
	}

	public void writeInsert(BoardDto boardDto) {
		bdDao.writeInsert(boardDto);
	}

	public int maxBon() {
		return bdDao.maxBon();
	}

	// 복수
	public void fileUp(MultipartFile[] file, HttpServletRequest request) {
		for (MultipartFile fileList : file) {

			String or = fileList.getOriginalFilename();
			UUID uuid = UUID.randomUUID();
			String ch = uuid + "_" + fileList.getOriginalFilename();
			int si = (int) fileList.getSize();

			String SAVE_PATH = request.getSession().getServletContext().getRealPath("/resources/");
			System.out.println(SAVE_PATH);
			String saveFileName = SAVE_PATH + ch;

			try {
				fileList.transferTo(new File(saveFileName));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			BoardFileDto boardFileDto = new BoardFileDto();
			boardFileDto.setBno(maxBon());
			boardFileDto.setFileOr(or);
			boardFileDto.setFileCh(ch);
			boardFileDto.setFileSi(si);

			bdDao.fileInforInsert(boardFileDto);
		}
	}

	public List<BoardDto> getViewPage(int bno) {
		return bdDao.getViewPage(bno);
	}

	public int contentViewPage_comment_insert(CommentDto commentDto) {
		return bdDao.contentViewPage_comment_insert(commentDto);
	}

	public List<CommentDto> contentViewPage_comment_list(int bno) {
		return bdDao.contentViewPage_comment_list(bno);
	}

	public CommentDto contentViewPage_comment_add(int commentNo) {
		return bdDao.contentViewPage_comment_add(commentNo);
	}

	public BoardListModel list(int pageNum, int per) {
		int count = bdDao.count();
		if (count == 0) {
			return new BoardListModel();
		}

		int start = (pageNum - 1) * per;
		List<BoardDto> list = bdDao.getList(start, per);

		Paging p = new Paging().paging(pageNum, count, per);

		return new BoardListModel(list, pageNum, p.totalPageCount, start, p, count);
	}

}
//단일
//public void fileUp(MultipartFile file, HttpServletRequest request) { 		
//	String or = file.getOriginalFilename(); 
//	UUID uuid = UUID.randomUUID();
//	String ch = uuid + "_" + file.getOriginalFilename();
//	int si = (int) file.getSize();
//	
//	String SAVE_PATH = request.getSession().getServletContext().getRealPath("/resources/img/");
//	String saveFileName = SAVE_PATH + ch;
//	
//	try {
//		file.transferTo(new File(saveFileName));
//      } catch (IllegalStateException e) {
//          e.printStackTrace();
//      } catch (IOException e) {
//          e.printStackTrace();
//      }
//	
//	BoardFileDto boardFileDto = new BoardFileDto();
//	boardFileDto.setBno(maxBon());
//	boardFileDto.setFileOr(or);
//	boardFileDto.setFileCh(ch);
//	boardFileDto.setFileSi(si);	
//	
//	bdDao.fileInforInsert(boardFileDto);
//}
