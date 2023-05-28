package com.vanderson.vssystembackend.repository;


import com.vanderson.vssystembackend.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
