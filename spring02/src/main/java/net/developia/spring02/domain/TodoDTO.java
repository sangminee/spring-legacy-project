package net.developia.spring02.domain;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO {
	private String title;
	@DateTimeFormat(pattern= "yyyy/MM/dd")
	private Data dueDate;
}
