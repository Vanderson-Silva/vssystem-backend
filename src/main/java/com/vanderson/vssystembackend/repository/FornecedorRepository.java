package com.vanderson.vssystembackend.repository;

import com.vanderson.vssystembackend.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Cliente,Long> {
}
