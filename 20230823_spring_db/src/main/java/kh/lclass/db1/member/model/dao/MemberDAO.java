package kh.lclass.db1.member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.lclass.db1.member.model.vo.MemberVO;

@Repository
public class MemberDAO {
	
	// Autowired 사용 시 Spring에서 이미 만들어진 빈객체를 가져다 사용.
	// 따라서 = null 또는 new SqlSession() 생성을 하지 않아야 함.
	@Autowired
	private SqlSession sqlSession;
	
	public List<MemberVO> selectList() {
		return sqlSession.selectList("member.selectList");
	}
	public MemberVO selectOne(String pk) {
		return sqlSession.selectOne("member.selectOne", pk);
	}
	public int insert(MemberVO vo) {
		return sqlSession.insert("member.insert", vo);
	}
	public int update(MemberVO vo) {
		return sqlSession.update("member.update", vo);
	}
	public int delete(String pk) {
		return sqlSession.delete("member.delete", pk);
	}
}
