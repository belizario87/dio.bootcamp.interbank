package br.com.bootcampdio.javacore.modificadoresacesso.outropacote;

import br.com.bootcampdio.javacore.modificadoresacesso.Classe1;
import br.com.bootcampdio.javacore.modificadoresacesso.Classe2;

public class Classe4 {

  Classe1 classe1; //associa a Classe4 a Classe1
  
  void metodo() {
    System.out.println(classe1.atributo3); //Tem acesso apenas ao atributo 3 pq ele e public, e a classe esta fora do pacote.
    classe1.metodo3(); //Tem acesso apenas ao metodo 3 pq ele e public, e a classe esta fora do pacote.
    
  }

  public static void main(String[] args) {
    
  }

}

  
