package com.yb.board.Services;

import com.yb.board.Data.DTO.ProjectDTO;
import com.yb.board.Data.Entities.Project;
import com.yb.board.Mappers.ProjectMapper;
import com.yb.board.Repositories.ProjectRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;



    @Override
    public ProjectDTO create(ProjectDTO projectDTO) {
        Project project = projectRepository.save(projectMapper.toEntity(projectDTO));
        return projectMapper.toDTO(project);
    }

    @Override
    public List<ProjectDTO> getAll() {
        return projectRepository.findAll().stream()
                .map(projectMapper::toDTO)
                .toList();
    }

    @Override
    public ProjectDTO getById(Long id) {
        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Project with id: " + id + " not found"));
        return projectMapper.toDTO(project);
    }

    @Override
    public ProjectDTO getByName(String name) {
        Project project = projectRepository.findByName(name)
                .orElseThrow(() -> new EntityNotFoundException("Project with name: " + name + " not found"));
        return projectMapper.toDTO(project);
    }

    @Override
    public ProjectDTO update(ProjectDTO projectDTO) {
        Project project = projectRepository.save(projectMapper.toEntity(projectDTO));
        return projectMapper.toDTO(project);
    }

    @Override
    public void delete(Long id) {
        projectRepository.deleteById(id);
    }
}
