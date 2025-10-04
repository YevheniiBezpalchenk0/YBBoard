package com.yb.board.Repositories;

import com.yb.board.Data.Entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    public Optional<Project> findByName(String name);
}
