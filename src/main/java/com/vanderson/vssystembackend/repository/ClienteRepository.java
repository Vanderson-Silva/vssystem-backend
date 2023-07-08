package com.vanderson.vssystembackend.repository;

import com.vanderson.vssystembackend.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.TypedQuery;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {


}
