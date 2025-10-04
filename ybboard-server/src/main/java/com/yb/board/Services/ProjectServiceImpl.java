package com.yb.board.Services;

import com.yb.board.Data.DTO.ProjectDTO;
import com.yb.board.Data.Entities.Project;
import com.yb.board.Repositories.ProjectRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;



    @Override
    public ProjectDTO create(ProjectDTO projectDTO) {
        Project project = projectRepository.save(projectDTO.toEntity());
        return project.toDTO();
    }

    @Override
    public List<ProjectDTO> getAll() {
        return projectRepository.findAll().stream()
                .map(Project::toDTO)
                .toList();
    }

    @Override
    public ProjectDTO getById(Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Project with id: " + id + " not found"))
                .toDTO();
    }

    @Override
    public ProjectDTO getByName(String name) {
        return projectRepository.findByName(name)
                .orElseThrow(() -> new EntityNotFoundException("Project with name: " + name + " not found"))
                .toDTO();
    }

    @Override
    public ProjectDTO update(ProjectDTO projectDTO) {
        return projectRepository.save(projectDTO.toEntity()).toDTO();
    }

    @Override
    public void delete(Long id) {
        projectRepository.deleteById(id);
    }
}
