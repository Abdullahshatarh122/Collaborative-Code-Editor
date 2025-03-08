package com.example.colaborativeCodeEditor.ColabCodeEditor.Model.Repositories;

import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.Commit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommitRepository extends JpaRepository<Commit, Long> {

}

