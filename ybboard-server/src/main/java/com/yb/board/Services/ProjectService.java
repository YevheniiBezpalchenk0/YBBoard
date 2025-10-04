package com.yb.board.Services;

import com.yb.board.Data.DTO.ProjectDTO;

import java.util.List;
import java.util.Optional;

public interface ProjectService {
    public ProjectDTO create(ProjectDTO projectDTO);
    public List<ProjectDTO> getAll();
    public ProjectDTO getById(Long id);
    public ProjectDTO getByName(String name);
    public ProjectDTO update(ProjectDTO projectDTO);
    public void delete(Long id);
}
