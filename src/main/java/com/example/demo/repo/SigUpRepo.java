package com.example.demo.repo;
import com.example.demo.model.SignUpmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SigUpRepo  extends JpaRepository<SignUpmodel, Long> {
}