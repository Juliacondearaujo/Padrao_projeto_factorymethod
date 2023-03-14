package padroescriacao_exercicio.factorymethod;

import org.junit.jupiter.api.Test;
import padroescriacao_exercicios.factorymethod.IServico;
import padroescriacao_exercicios.factorymethod.ServicoFactory;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoCatalogacaoTest {

    @Test
    void deveExecutarCatalogacao() {
        IServico servico = ServicoFactory.obterServico("Catalogacao");
        assertEquals("Catalogacao efetivada", servico.executar());
    }

    @Test
    void deveCancelarCatalocacao() {
        IServico servico = ServicoFactory.obterServico("Catalogacao");
        assertEquals("Catalogacao cancelada", servico.cancelar());
    }
}
