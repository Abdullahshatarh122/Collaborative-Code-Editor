package com.example.colaborativeCodeEditor.ColabCodeEditor.Model.Repositories;


import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.Project;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface ProjectRepository extends JpaRepository<Project, Long> {


    List<Project> findByOwner(Optional<User> owner);

    List<Project> findByOwnerEmail(String email);


}

