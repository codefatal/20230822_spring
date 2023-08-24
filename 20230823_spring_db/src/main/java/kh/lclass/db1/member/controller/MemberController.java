package kh.lclass.db1.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kh.lclass.db1.member.model.service.MemberService;
import kh.lclass.db1.member.model.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/member/list")
	public String memberList(Model model) {
		List<MemberVO> volist = memberService.selectList();
		model.addAttribute("memberList", volist);
		return "member/list";
	}
	
	@GetMapping("/member/get")
	public String memberGet(Model model) {
		return "member/get";
	}
}
