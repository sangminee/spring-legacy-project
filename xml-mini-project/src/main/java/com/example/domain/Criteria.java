package com.example.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {

	private int pageNum;
	private int amout;
	
	public Criteria() {
		this(1,10);
	}
	
	public Criteria(int pageNum, int amout) {
		this.pageNum = pageNum;
		this.amout = amout;
	}
}
