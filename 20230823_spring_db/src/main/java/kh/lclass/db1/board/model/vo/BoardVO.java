package kh.lclass.db1.board.model.vo;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class BoardVO {
//	BNO	NUMBER
//	BTITLE	VARCHAR2(300 BYTE)
//	BCONTENT	VARCHAR2(4000 BYTE)
//	BWRITE_DATE	TIMESTAMP(6)
//	MID	VARCHAR2(20 BYTE)
//	BREF	NUMBER
//	BRE_LEVEL	NUMBER
//	BRE_STEP	NUMBER
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriteDate;
	private String mid;
	private int bref;
	private int breLevel;
	private int breStep;
	
	// 1:n 관계
	private List<AttachFileVO> attachFileList;
	
}
