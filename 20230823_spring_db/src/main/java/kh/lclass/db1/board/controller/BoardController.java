package kh.lclass.db1.board.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kh.lclass.db1.board.model.service.BoardService;
import kh.lclass.db1.board.model.vo.BoardVO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/board")
@Controller
@SessionAttributes({"loginID"})
public class BoardController {
	private final BoardService boardService;
	
	@GetMapping("/list")
	public ModelAndView boardList(ModelAndView mv) throws Exception {
		mv.addObject("boardList", boardService.selectList());
		mv.setViewName("board/list");
		return mv;
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
	public String insertDo(RedirectAttributes redirectAttr, BoardVO vo) {
		int result;
		String viewPage = "";
		
		vo.setMid("kh1");
		
		try {			
			result = boardService.insert(vo);
			if(result == 1) {
				redirectAttr.addFlashAttribute("msg", "글 등록이 성공했습니다.");
				viewPage = "redirect:/board/list";
			} else {
				redirectAttr.addFlashAttribute("msg", "글 등록이 실패했습니다. 다시 입력하고 등록해주세요.");
				viewPage = "redirect:/board/insert";
			}
		} catch(Exception e) {
			e.printStackTrace();
			redirectAttr.addFlashAttribute("msg", "예기치 못한 상황으로 글 등록에 실패했습니다. 다시 시도해주세요.");
			viewPage = "redirect:/board/list";
		}
//		return "redirect:/board/list";
		return viewPage;
	}
	
	@GetMapping("/insertReply")
	public String boardInsertReply(Model model, int bno) {
		model.addAttribute("bno", bno);
		return "board/insertReply";
	}
	
	@PostMapping("/insertReply")
	public String insertReplyDo(BoardVO vo) {
		vo.setMid("kh1");
		boardService.insertReply(vo);
		return "redirect:/board/list";
	}
	
//	@ExceptionHandler // 공통 오류 처리
//	public void e() {
//		
//	}
}
