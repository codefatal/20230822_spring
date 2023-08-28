package kh.lclass.db1.member.model.vo;

import java.util.List;

import kh.lclass.db1.board.model.vo.BoardVO;
import lombok.Data;

@Data
public class BoardMembersVO {
	private BoardVO board;
	private List<MemberVO> memberList;
}
