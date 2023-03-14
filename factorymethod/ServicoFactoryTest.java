package padroescriacao_exercicio.factorymethod;

import org.junit.jupiter.api.Test;
import padroescriacao_exercicios.factorymethod.IServico;
import padroescriacao_exercicios.factorymethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Cadastro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarSucessoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Orientacao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}
