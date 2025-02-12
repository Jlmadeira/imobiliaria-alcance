package com.jorgeluizmadeira.avaliacao1.controller;

import com.jorgeluizmadeira.avaliacao1.model.UserCredentials;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recibo")
public class ReciboController {

    public ResponseEntity<String> emitirRecibo(@RequestBody UserCredentials credentials) {
        if ("usuario".equals(credentials.getUsuario()) && "senha".equals(credentials.getSenha())) {
            return ResponseEntity.ok("Recibo gerado com sucesso!");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais Invalidas");
    }

}
