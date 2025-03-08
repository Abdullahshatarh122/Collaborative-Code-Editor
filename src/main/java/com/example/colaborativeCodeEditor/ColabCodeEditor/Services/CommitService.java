package com.example.colaborativeCodeEditor.ColabCodeEditor.Services;


import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.Commit;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.Project;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.Repositories.CommitRepository;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.Repositories.ProjectRepository;
import org.springframework.stereotype.*;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CommitService {

    private final ProjectRepository projectRepository;
    private final CommitRepository commitRepository;
    private final ProjectService projectService;

    public CommitService(ProjectRepository projectRepository, CommitRepository commitRepository, ProjectService projectService) {
        this.projectRepository = projectRepository;
        this.commitRepository = commitRepository;
        this.projectService = projectService;
    }


    public Commit createCommit(Project project) {
        Commit commit = new Commit();
        commit.setProject(project);
        commit.setAuthor(project.getOwner());
        commit.setCommitedAt(LocalDateTime.now());
        return commitRepository.save(commit);
    }

    public boolean commitProjectChanges(Long projectId, String code) {
        Optional<Project> optionalProject = projectRepository.findById(projectId);
        if (optionalProject.isPresent()) {
            Project project = optionalProject.get();
            project = projectService.updateCode(project, code);
            return createCommit(project) != null;

        }
        return false;
    }

}