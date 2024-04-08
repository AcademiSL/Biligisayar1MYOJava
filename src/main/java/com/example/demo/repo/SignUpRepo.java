package com.example.demo.repo;

import com.example.demo.model.SignUpModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepo extends JpaRepository<SignUpModel, Integer> {
}
