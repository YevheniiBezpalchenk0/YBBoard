package com.yb.board.Controllers;


import com.yb.board.Data.DTO.ProjectDTO;
import com.yb.board.Data.Entities.Project;
import com.yb.board.Services.ProjectService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.hibernate.mapping.Any;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/api/project")
@AllArgsConstructor
public class ProjectController {

    final private ProjectService projectService;

    @PostMapping()
    public ResponseEntity<ProjectDTO> Create(@Valid @RequestBody ProjectDTO project) {
        return ResponseEntity.ok(projectService.create(project));
    }

    @GetMapping()
    public ResponseEntity<List<ProjectDTO>> GetAll(){
        return ResponseEntity.ok(projectService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectDTO> GetById(@PathVariable Long id){
        return ResponseEntity.ok(projectService.getById(id));
    }


    @GetMapping("/name/{name}")
    public ResponseEntity<ProjectDTO> GetByName(@PathVariable String name){
        return ResponseEntity.ok(projectService.getByName(name));
    }

    @PutMapping()
    public ResponseEntity<ProjectDTO> Update(@RequestBody ProjectDTO projectDTO){

        return ResponseEntity.ok(projectService.update(projectDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> Delete(@PathVariable Long id){
        projectService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
