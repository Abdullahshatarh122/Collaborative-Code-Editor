package com.example.colaborativeCodeEditor.ColabCodeEditor.Model.Repositories;


import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.Branch;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface BranchRepository extends JpaRepository<Branch, Long> {
    List<Branch> findByMainProject(Project project);

    Optional<Branch> findByMainProjectAndName(Project project, String name);

    Optional<Object> findByBranchProject(Project project);
}

