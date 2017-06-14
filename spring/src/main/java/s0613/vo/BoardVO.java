package s0613.vo;

import java.util.Date;

public class BoardVO {

	private int bno;
	private String title;
	private String content;
	private String wrtier;
	private Date regdate;
	private int viewcnt;

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWrtier() {
		return wrtier;
	}

	public void setWrtier(String wrtier) {
		this.wrtier = wrtier;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getViewcnt() {
		return viewcnt;
	}

	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", wrtier=" + wrtier + ", regdate="
				+ regdate + ", viewcnt=" + viewcnt + "]";
	}

	public BoardVO(int bno, String title, String content, String wrtier, Date regdate, int viewcnt) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.wrtier = wrtier;
		this.regdate = regdate;
		this.viewcnt = viewcnt;
	}

}
