package com.example.mapper;

import java.util.List;

import com.example.domain.BoardVO;
import com.example.domain.Criteria;

public interface BoardMapper {
	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);

	public BoardVO read(Long bno);

	public int delete(long bno);

	public int update(BoardVO board);
}