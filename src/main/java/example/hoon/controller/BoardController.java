package example.hoon.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import example.hoon.model.BoardDto;
import example.hoon.model.BoardListModel;
import example.hoon.model.CommentDto;
import example.hoon.service.BoardService;



@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	BoardService service;

	@RequestMapping(value = "/list2.com", method = RequestMethod.GET)
	public ModelAndView getList() {
		ModelAndView mav = new ModelAndView();
		List<BoardDto> list = service.getListAdd();
		mav.addObject("getlist", list);
		mav.setViewName("board/list");
		return mav;
	}
	
	//페이징 처리 
	@RequestMapping(value = "/list.com", method = RequestMethod.GET)
	public String getList2(@RequestParam(value = "p", defaultValue = "1") int pageNum,
			@RequestParam(value = "per", defaultValue = "10") int per, Model m) {
		// System.out.println("per::"+per);
		BoardListModel list = service.list(pageNum, per);
		m.addAttribute("list", list);
		int number = list.getCount() - (pageNum - 1) * per;
		m.addAttribute("number", number);
		return "board/list";
	}
	
	

	@RequestMapping(value = "/write.com", method = RequestMethod.GET)
	public String write() {
		return "board/write";
	}

	@RequestMapping(value = "/writeInsert.com", method = RequestMethod.POST)
	public String writeInsert(BoardDto boardDto, @RequestParam MultipartFile[] file, HttpServletRequest request) {
		service.writeInsert(boardDto);
		if (file != null) {
			service.fileUp(file, request);
		}
		return "redirect:list.com";
	}

	@RequestMapping(value = "/contentView.com", method = RequestMethod.GET)
	public ModelAndView contentView(int bno,CommentDto commentDto) {
		ModelAndView mav = new ModelAndView();
		List<BoardDto> list = service.getViewPage(bno);
		List<CommentDto> list_comment = service.contentViewPage_comment_list(commentDto.getBno());
		mav.addObject("contentViewPage", list);
		mav.addObject("contentViewPageComment", list_comment);
		mav.setViewName("board/viewPage");
		return mav;
	}

	@RequestMapping(value = "/contentViewPage_comment.com", method = RequestMethod.POST)
	@ResponseBody
	public String contentViewPage_comment_insert_select(CommentDto commentDto) {
		service.contentViewPage_comment_insert(commentDto);
		int commentNo = commentDto.getCommentNo();
		CommentDto list_comment = service.contentViewPage_comment_add(commentNo);
		Gson json = new Gson();
		return json.toJson(list_comment); 
	}
	
//	@RequestMapping(value = "/contentViewPage_comment.com")
//	public void contentViewPage_comment_insert_select(CommentDto commentDto, HttpServletResponse response)throws IOException {
//		service.contentViewPage_comment_insert(commentDto);
//		int commentNo = commentDto.getCommentNo();
//		CommentDto list_comment_select = service.contentViewPage_comment_add(commentNo);
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
//		Gson json = new Gson();
//		out.print(json.toJson(list_comment_select));
//	}
	
	

}
