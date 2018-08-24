package com.cos.service;

import java.util.List;

import com.cos.domain.SBoardVO;

public interface SBoardService {
	public SBoardVO contentView(String bid);
	public List<SBoardVO> list();
}
