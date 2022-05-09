package com.siznorias.readbook.controller;

import com.siznorias.readbook.dto.BoardDto;
import com.siznorias.readbook.entity.Board;
import com.siznorias.readbook.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }


    @GetMapping("/boardList")
    public List<BoardDto> getMyBoardList(int memberSeq){
        return boardService.getBoardList(memberSeq);
    }

    @PostMapping ("/board")
    public Board saveMyBoard(BoardDto boardDto){
        return boardService.saveBoard(boardDto);
    }
}
