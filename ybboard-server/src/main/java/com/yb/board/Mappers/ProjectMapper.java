package com.yb.board.Mappers;

import com.yb.board.Data.DTO.ProjectDTO;
import com.yb.board.Data.Entities.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { BoardMapper.class })
public interface ProjectMapper {
    ProjectDTO toDTO(Project project);
    Project toEntity(ProjectDTO projectDTO);
}
