package com.example.projectA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.projectA.model.BoardDTO;
import com.example.projectA.service.BoardRepository;
import com.example.projectA.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("board")
public class BoardRestController {
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	BoardRepository boardRepository;
	
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ModelAndView openBoardWrite() {
		ModelAndView modelAndView = new ModelAndView("board/write");
		modelAndView.addObject("board", new BoardDTO());
//		if(idx==null) {
//			model.addAttribute("board",new BoardDTO());
//		}else {
//			BoardDTO board = boardService.getBoardDetail(idx);
//			if(board == null) {
//				return "redirect:/board/list.do";
//			}
//			model.addAttribute("board", board);
//		}
		
		return modelAndView;
	}
	
	@PostMapping
	public ModelAndView registerBoard(final BoardDTO params) {
		ModelAndView modelAndView = new ModelAndView("redirect:/board");
		boardService.registerBoard(params);
		return modelAndView;		
	}
	
	
}
