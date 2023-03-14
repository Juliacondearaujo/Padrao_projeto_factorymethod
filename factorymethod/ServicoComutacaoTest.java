package padroescriacao_exercicio.factorymethod;

import org.junit.jupiter.api.Test;
import padroescriacao_exercicios.factorymethod.IServico;
import padroescriacao_exercicios.factorymethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoComutacaoTest {

    @Test
    void deveExecutarComutacao() {
        IServico servico = ServicoFactory.obterServico("Comutacao");
        assertEquals("Comutacao efetivada", servico.executar());
    }

    @Test
    void deveCancelarComutacao() {
        IServico servico = ServicoFactory.obterServico("Comutacao");
        assertEquals("Comutacao cancelada", servico.cancelar());
    }
}
