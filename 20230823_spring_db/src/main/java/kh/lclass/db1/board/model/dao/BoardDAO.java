package kh.lclass.db1.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kh.lclass.db1.board.model.vo.BoardVO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class BoardDAO {
	
	private final SqlSession sqlSession;
	
	public List<BoardVO> selectList() {
		return sqlSession.selectList("board.selectList"); 
	}
	public BoardVO selectOne(int bno) {
		return sqlSession.selectOne("board.selectOne", bno); 
	}
	public int insert(BoardVO vo) {
		return sqlSession.insert("board.insert", vo); 
	}
	public int insertReply(BoardVO vo) {
		return sqlSession.insert("board.insertReply", vo); 
	}	
	public int update(BoardVO vo) {
		return sqlSession.update("board.update", vo); 
	}
	public int delete(int bno) {
		return sqlSession.delete("board.delete", bno); 
	}
}
