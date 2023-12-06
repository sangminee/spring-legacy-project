package net.developia.spring06.mapper;

import net.developia.spring06.domain.MemberVO;

public interface MemberMapper {
	public MemberVO read(String userid);
}
