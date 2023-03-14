package padroescriacao_exercicios.factorymethod;

public class ServicoFactory {

    public static padroescriacao_exercicios.factorymethod.IServico obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao_exercicios.factorymethod.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof padroescriacao_exercicios.factorymethod.IServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IServico) objeto;
    }
}

