package net.developia.spring03.service;

import java.util.List;

import net.developia.spring03.domain.Criteria;
import net.developia.spring03.domain.ReplyVO;

public interface ReplyService {
	public int register(ReplyVO vo);

	public ReplyVO get(Long rno);

	public int modify(ReplyVO vo);

	public int remove(Long rno);

	public List<ReplyVO> getList(Criteria cri, Long bno);
}
