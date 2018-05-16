package kr.co.hta.board.web.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.hta.board.service.BookService;
import kr.co.hta.board.vo.Book;
import kr.co.hta.board.vo.Criteria;

@Controller
@RequestMapping("/ajax")
public class AjaxController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("/search.do")
	public @ResponseBody Map<String, Object> search(Criteria c) {
		Map<String, Object> map = new HashMap<>();
		
		List<Book> books = bookService.searchBooks(c);
		if (books.isEmpty()) {
			map.put("success", false);
		} else {
			map.put("success", true);
			map.put("items", books);
		}
		
		return map;
	}
}
