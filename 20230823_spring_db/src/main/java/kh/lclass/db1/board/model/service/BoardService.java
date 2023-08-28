package kh.lclass.db1.board.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kh.lclass.db1.board.model.dao.BoardDAO;
import kh.lclass.db1.board.model.vo.BoardVO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardService {
	private final BoardDAO boardDAO;
	
	public List<BoardVO> selectList() {
		return boardDAO.selectList();
	}
	public BoardVO selectOne(int bno) {
		return boardDAO.selectOne(bno);
	}
	public int insert(BoardVO vo) {
		return boardDAO.insert(vo);
	}
	@Transactional
	public int insertReply(BoardVO vo) {
		boardDAO.update(vo);
		return boardDAO.insertReply(vo);
	}
	public int update(BoardVO vo) {
		return boardDAO.update(vo);
	}
	public int delete(int bno) {
		return boardDAO.delete(bno);
	}
}
