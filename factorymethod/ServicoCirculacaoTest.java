package padroescriacao_exercicio.factorymethod;

import org.junit.jupiter.api.Test;

import padroescriacao_exercicios.factorymethod.IServico;
import padroescriacao_exercicios.factorymethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoCirculacaoTest {

    @Test
    void deveExecutarCirculacao() {
        IServico servico = ServicoFactory.obterServico("Circulacao");
        assertEquals("Circulacao efetivada", servico.executar());
    }

    @Test
    void deveCancelarCicurlacao() {
        IServico servico = ServicoFactory.obterServico("Circulacao");
        assertEquals("Circulacao cancelada", servico.cancelar());
    }
}
