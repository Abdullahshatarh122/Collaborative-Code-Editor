package com.example.colaborativeCodeEditor.ColabCodeEditor.Services;

import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.File;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.Project;
import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.Repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class FileService {

    private final FileRepository fileRepository;

    @Autowired
    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }


    public String getJavaClassName(String fileName) {
        return fileName.substring(0, 1).toUpperCase() + fileName.substring(1);
    }

    public void createFile(Project project) {
        File file = new File();
        file.setProject(project);
        file.setName(project.getName());
        if (project.getLanguage().equals("java")) {
            String mainClassName = getJavaClassName(project.getName());
            String newJavaFileContent =
                    "\n" +
                    "public class " + mainClassName +" {\n" +
                    "\n" +
                    "\tpublic static void main(String[] args) {\n" +
                    "\n" +
                    "\t}\n" +
                    "\n" +
                    "}";
            file.setContent(newJavaFileContent);
        }
        else {
        file.setContent("");
        }
        file.setCreatedAt(LocalDateTime.now());
        file.setUpdatedAt(LocalDateTime.now());

        fileRepository.save(file);
    }

    public File getFilesByProjectId(long projectId) {

        return fileRepository.findByProjectId(projectId);
    }

}
