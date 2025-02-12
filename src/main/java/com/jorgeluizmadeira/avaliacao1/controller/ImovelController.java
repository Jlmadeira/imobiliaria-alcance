package com.jorgeluizmadeira.avaliacao1.controller;

import com.jorgeluizmadeira.avaliacao1.model.Imovel;
import com.jorgeluizmadeira.avaliacao1.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @GetMapping("/disponiveis")
    public List<Imovel> getImoveisDisponiveis() {
        return imovelService.getImoveisDisponivel();
    }

    @PostMapping
    public ResponseEntity<Imovel> cadastrarImovel(@RequestBody Imovel imovel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(imovelService.cadastrarImovel(imovel));
    }

}
