package com.yb.board.Data.DTO;

import com.yb.board.Data.Entities.Project;
import com.yb.board.Data.Enums.PROJECT_TYPE;
import jakarta.validation.constraints.NotBlank;

public record ProjectDTO(
        Long id,
        @NotBlank(message = "Project name is required")
        String name,
        PROJECT_TYPE projectType
) {
}
