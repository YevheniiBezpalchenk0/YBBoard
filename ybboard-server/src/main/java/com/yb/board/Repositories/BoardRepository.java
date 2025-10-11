package com.yb.board.Repositories;

import com.yb.board.Data.Entities.Board;
import com.yb.board.Data.Entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    public Board findByProject(Project project);
}
