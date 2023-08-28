package kh.lclass.db1.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kh.lclass.db1.member.model.dao.MemberDAO;
import kh.lclass.db1.member.model.vo.MemberVO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberService {
	
	private final MemberDAO memberDAO;
	
	public List<MemberVO> selectList() {
		return memberDAO.selectList(); 
	}
	public MemberVO selectOne(String pk) {
		return memberDAO.selectOne(pk);
	}
	public int insert(MemberVO vo) {
		return memberDAO.insert(vo);
	}
	
	public int update(MemberVO vo) {
		return memberDAO.update(vo);
	}
	public int delete(String pk) {
		return memberDAO.delete(pk);
	}
	
	public String login(String mid) {
		return memberDAO.login(mid);
	}
}
