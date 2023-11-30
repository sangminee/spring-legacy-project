package net.developia.spring03.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import net.developia.spring03.domain.BoardVO;

public interface BoardMapper {
	public List<BoardVO> getList();
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);

	public BoardVO read(Long bno);

	public int delete(long bno);

	public int update(BoardVO board);
}