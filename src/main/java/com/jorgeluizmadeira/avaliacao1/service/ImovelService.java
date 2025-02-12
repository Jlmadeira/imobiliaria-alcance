package com.jorgeluizmadeira.avaliacao1.service;

import com.jorgeluizmadeira.avaliacao1.model.Imovel;
import com.jorgeluizmadeira.avaliacao1.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    public List<Imovel> getImoveisDisponivel() {
        return imovelRepository.findByStatus("Disponível");
    }

    public Imovel cadastrarImovel(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

}
