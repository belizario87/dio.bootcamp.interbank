package subsistema1.cep;

import singleton.SingletonEager;

import java.lang.constant.Constable;

public class CepApi {
    private static CepApi instancia = new CepApi();

    public CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instancia;
    }
    
    public String recuperarCidade(String cep){
        return "Araraquara";
        
    }

    public String recuperarEstado(String estrado){
        return "Sp";

    }



}
