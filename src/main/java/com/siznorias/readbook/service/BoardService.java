package com.siznorias.readbook.service;

import com.siznorias.readbook.dto.BoardDto;
import com.siznorias.readbook.entity.Board;
import com.siznorias.readbook.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<BoardDto> getBoardList(int memberSeq){
        return boardRepository.findBoardByMemberSeq(memberSeq)
                .stream().map(BoardDto::new).collect(Collectors.toList());
    }

    public Board saveBoard(BoardDto boardDto) {
        return boardRepository.save(boardDto.toEntity());
    }
}
