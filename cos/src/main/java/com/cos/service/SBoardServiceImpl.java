package com.cos.service;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cos.domain.SBoardVO;
import com.cos.persistence.SBoardDAOImpl;

@Service
public class SBoardServiceImpl implements SBoardService{

	@Inject
	private SBoardDAOImpl dao;
	
	@Override
	public SBoardVO contentView(String bid) {
		dao.uphit(bid);
		return dao.view(bid);
	}

	@Override
	public List<SBoardVO> list() {
		return dao.list();
	}	
}
