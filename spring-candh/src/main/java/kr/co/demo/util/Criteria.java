package kr.co.demo.util;

import org.springframework.web.util.UriComponentsBuilder;

public class Criteria {
	
	
	private int pageNum;
	private int amount;
	private int offset;
	private String type;
	private String keyword;
	
	public Criteria() {
		// TODO Auto-generated constructor stub
		this(1, 10);
	}

	public Criteria(int pageNum, int amount) {
		// TODO Auto-generated constructor stub
		this.pageNum = pageNum;
		this.amount = amount;
		this.offset = (pageNum - 1) * amount;
	}
	
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
		setOffset();
	}
	
	public void setOffset() {
		this.offset = (this.pageNum - 1) * this.amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
		setOffset();
	}
	
	public String[] getTypeArr() {
		return type == null ? new String[] {}:type.split("");
	}
	
	public String getListLink() {
		UriComponentsBuilder builder = UriComponentsBuilder.fromPath("")
				.queryParam("page", this.pageNum)
				.queryParam("amount", this.amount)
				.queryParam("type", this.type)
				.queryParam("keyword", this.keyword);
		return builder.toUriString();
				
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getPageNum() {
		return pageNum;
	}

	public int getAmount() {
		return amount;
	}
	
	
}
