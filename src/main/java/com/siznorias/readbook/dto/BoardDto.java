package com.siznorias.readbook.dto;

import com.siznorias.readbook.entity.Board;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
public class BoardDto {
    int seq;
    int memberSeq;
    String contents;

    public BoardDto(Board board){
        BeanUtils.copyProperties(board, this);
    }
    public Board toEntity(){
        Board board = new Board();
        BeanUtils.copyProperties(this, board);
        return board;
    }

}
