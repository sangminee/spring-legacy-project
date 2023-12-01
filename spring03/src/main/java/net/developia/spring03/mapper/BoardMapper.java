package net.developia.spring03.mapper;

import java.util.List;

import net.developia.spring03.domain.BoardVO;
import net.developia.spring03.domain.Criteria;

public interface BoardMapper {
	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);

	public BoardVO read(Long bno);

	public int delete(long bno);

	public int update(BoardVO board);
}