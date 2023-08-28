package kh.lclass.db1.board.model.vo;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class AttachFileVO {
	private int bno;
	private String filepath;
	private String fileno;
	
	public AttachFileVO() {
	}
	public AttachFileVO(String filepath) {
		this.filepath = filepath;
	}
}
