package kh.lclass.db1.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kh.lclass.db1.member.model.service.MemberService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@SessionAttributes({"loginID"})
public class MemberController {
	
	private final MemberService memberService;
	
	@GetMapping("/login")
	public String login() {
		return "/member/login";
	}
	
	@PostMapping("/login")
	public String loginDo(Model model, RedirectAttributes redirectAttr, String username, String password) {
		String result = memberService.login(username);
		System.out.println(password);
		String viewPage = "";
		if(password == null) {
			System.out.println("아이디가 존재하지 않습니다.");
			redirectAttr.addFlashAttribute("msg", "아이디가 존재하지 않습니다.");
			viewPage = "redirect:/login";
		} else if(password.equals(result)) {
			System.out.println("로그인 성공");
			model.addAttribute("loginID", username);
			redirectAttr.addFlashAttribute("msg", "로그인에 성공했습니다.");
			viewPage = "redirect:/board/list";
		} else {
			System.out.println("로그인 실패");
			redirectAttr.addFlashAttribute("msg", "로그인에 실패했습니다. 아이디와 패스워드를 다시 확인해주세요.");			
			viewPage = "redirect:/login";
		}
		return viewPage;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session, RedirectAttributes redirectAttr) {
		session.removeAttribute("mid");
		redirectAttr.addFlashAttribute("msg", "로그아웃에 성공했습니다.");
		return "/board/list";
	}
}
