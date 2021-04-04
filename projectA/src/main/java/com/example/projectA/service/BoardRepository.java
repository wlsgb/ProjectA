package com.example.projectA.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectA.model.BoardDTO;

@Repository
public interface BoardRepository 
	extends JpaRepository<BoardDTO, Long>{
	
//	public BoardDTO registerBoard(BoardDTO params);
	
//	public BoardDTO getBoardDetail(Long idx);
//	
//	public boolean deleteBoard(Long idx);
//	
//	public List<BoardDTO> getBoardList();
}
