package com.example.crud.repo;

import com.example.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepo extends JpaRepository<User, Integer> {
}
