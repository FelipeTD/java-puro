package sistema.cep;

import tortora.gof.singleton.SingletonEager;

public class CEPAPI {

    private static CEPAPI instancia = new CEPAPI();

    private CEPAPI() {
        super();
    }

    public static CEPAPI getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "BH";
    }

    public String recuperarEstado(String cep) {
        return "Minas Gerais";
    }

}
