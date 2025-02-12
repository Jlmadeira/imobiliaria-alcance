package com.jorgeluizmadeira.avaliacao1;

import com.jorgeluizmadeira.avaliacao1.model.Imovel;
import com.jorgeluizmadeira.avaliacao1.repository.ImovelRepository;
import com.jorgeluizmadeira.avaliacao1.service.ImovelService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class Avaliacao1ApplicationTests {

    private ImovelRepository imovelRepository;
    private ImovelService imovelService;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCadastrarImovel() {
        Imovel imovel = new Imovel();
        imovel.setTipoImovel("Apartamento");
        imovel.setEndereco("Rua XYZ");

        when(imovelRepository.save(imovel)).thenReturn(imovel);
        Imovel result = imovelService.cadastrarImovel(imovel);
        assertEquals(imovel, result);
    }

    @Test
    public void testGetImoveisDisponiveis() {
        List<Imovel> imoveis = Arrays.asList(new Imovel(), new Imovel());
        when(imovelRepository.findByStatus("Disponível")).thenReturn(imoveis);

        List<Imovel> result = imovelService.getImoveisDisponivel();
        assertEquals(2, result.size());
    }



}
