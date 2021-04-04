package com.example.projectA.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectA.model.BoardDTO;


@Service
public class BoardService{

	@Autowired
	public BoardRepository boardRepository;
	
	public BoardDTO registerBoard(BoardDTO params) {
		boardRepository.save(params);
		return params;
	}

}
