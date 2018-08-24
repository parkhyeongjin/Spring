package com.cos.persistence;

import java.util.List;

import com.cos.domain.SBoardVO;

public interface SBoardDAO {
	public SBoardVO view(String bid);
	public void uphit(String bid);
	public List<SBoardVO> list();
}
