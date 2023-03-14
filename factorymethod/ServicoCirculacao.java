package padroescriacao_exercicios.factorymethod;

import padroescriacao_exercicios.factorymethod.IServico;

public class ServicoCirculacao implements IServico {
    public String executar() {
        return "Circulacao efetivada";
    }

    public String cancelar() {
        return "Circulacao cancelada";
    }
}
