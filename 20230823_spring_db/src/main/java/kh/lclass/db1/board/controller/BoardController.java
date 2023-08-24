package kh.lclass.db1.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.lclass.db1.board.model.service.BoardService;
import kh.lclass.db1.board.model.vo.BoardVO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/board")
@Controller
public class BoardController {
	private final BoardService boardService;
	
	@GetMapping("/list")
	public String boardList(Model model) {
		model.addAttribute("boardList", boardService.selectList());
		return "board/list";
	}
	
	@GetMapping("/get")
	public String boardGet(Model model, int bno) {
		model.addAttribute("boardvo", boardService.selectOne(bno));
		return "board/get";
	}
	
	@GetMapping("/insert")
	public String boardInsert() {
		return "board/insert";
	}
	
	@PostMapping("/insert")
	public String insertDo(BoardVO vo) {
		boardService.insert(vo);
		return "redirect:/board/list";
	}
	
	@GetMapping("/insertReply")
	public String boardInsertReply() {
		return "board/insert";
	}
	
	@PostMapping("/insertReply")
	public String insertReplyDo(BoardVO vo) {
		boardService.insertReply(vo);
		return "redirect:/board/list";
	}
}
