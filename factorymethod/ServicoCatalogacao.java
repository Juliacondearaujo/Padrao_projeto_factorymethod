package padroescriacao_exercicios.factorymethod;

import padroescriacao_exercicios.factorymethod.IServico;

public class ServicoCatalogacao implements IServico {

    public String executar() {
            return "Catalogacao efetivada";
    }

    public String cancelar() {
        return "Catalogacao cancelada";
    }
}
