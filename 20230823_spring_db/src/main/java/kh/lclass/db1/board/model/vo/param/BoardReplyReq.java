package kh.lclass.db1.board.model.vo.param;

import java.util.List;

import kh.lclass.db1.board.model.vo.AttachFileVO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class BoardReplyReq {
	private String btitle;
	private String bcontent;
	private String mid;
	private int bnoForBref;
	
	// 1:n 관계
	private List<AttachFileVO> attachFileList;
}
