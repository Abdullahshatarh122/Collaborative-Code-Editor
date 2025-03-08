package com.example.colaborativeCodeEditor.ColabCodeEditor.Model.Repositories;

import com.example.colaborativeCodeEditor.ColabCodeEditor.Model.DAO.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    int getUserByName(String name);

}


