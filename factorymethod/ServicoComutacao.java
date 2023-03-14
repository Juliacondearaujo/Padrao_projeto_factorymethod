package padroescriacao_exercicios.factorymethod;

import padroescriacao_exercicios.factorymethod.IServico;

public class ServicoComutacao implements IServico {

    public String executar() {
        return "Comutacao efetivada";
    }

    public String cancelar() {
        return "Comutacao cancelada";
    }
}
