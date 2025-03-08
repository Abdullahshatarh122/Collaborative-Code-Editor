package com.example.colaborativeCodeEditor.ColabCodeEditor.Model.Repositories;


import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.File;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface FileRepository extends JpaRepository<File, Long> {
    File findByProject(Project project);

    File findByProjectId(Long projectId);
}

