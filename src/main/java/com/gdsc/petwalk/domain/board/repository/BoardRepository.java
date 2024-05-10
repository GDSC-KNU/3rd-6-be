package com.gdsc.petwalk.domain.board.repository;

import com.gdsc.petwalk.domain.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findByWriterId(Long writerId);

    List<Board> findByTitleContaining(String keyword);
}
