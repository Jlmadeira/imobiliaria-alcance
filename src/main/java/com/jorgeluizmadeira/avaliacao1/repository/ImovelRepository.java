package com.jorgeluizmadeira.avaliacao1.repository;

import com.jorgeluizmadeira.avaliacao1.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long> {

    List<Imovel> findByStatus(String status);
}
