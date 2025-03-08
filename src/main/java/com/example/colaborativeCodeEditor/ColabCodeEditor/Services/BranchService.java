package com.example.colaborativeCodeEditor.ColabCodeEditor.Services;


import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.Branch;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.File;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.Project;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.User;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.Repositories.BranchRepository;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.Repositories.FileRepository;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.Repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class BranchService {

    private final BranchRepository branchRepository;
    private final ProjectRepository projectRepository;
    private final FileRepository fileRepository;

    @Autowired
    public BranchService(BranchRepository branchRepository, ProjectRepository projectRepository, FileRepository fileRepository) {
        this.branchRepository = branchRepository;
        this.projectRepository = projectRepository;
        this.fileRepository = fileRepository;
    }


    public Branch createBranch(Project project, String branchName, User createdBy) {
        Project branchProject = new Project();
        branchProject.setName(branchName);
        branchProject.setLanguage(project.getLanguage());
        branchProject.setCreatedAt(LocalDateTime.now());
        branchProject.setLastModifiedAt(LocalDateTime.now());
        branchProject.setOwner(createdBy);
        branchProject = projectRepository.save(branchProject);

        File branchFile  = new File();
        branchFile.setName(branchName);
        branchFile.setCreatedAt(LocalDateTime.now());
        branchFile.setUpdatedAt(LocalDateTime.now());
        branchFile.setContent(project.getFile().getContent());
        branchFile.setProject(branchProject);
        branchFile = fileRepository.save(branchFile);
        branchProject.setFile(branchFile);
        branchProject = projectRepository.save(branchProject);

        Branch branch = new Branch();
        branch.setMainProject(project);
        branch.setBranchProject(branchProject);
        branch.setName(branchName);
        branch.setCreatedBy(createdBy);
        branch.setCreatedAt(LocalDateTime.now());
        branch.setUpdatedAt(LocalDateTime.now());
        return branchRepository.save(branch);
    }


}