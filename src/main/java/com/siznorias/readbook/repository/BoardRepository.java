package com.siznorias.readbook.repository;

import com.siznorias.readbook.dto.BoardDto;
import com.siznorias.readbook.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findBoardByMemberSeq(int memberSeq);
}