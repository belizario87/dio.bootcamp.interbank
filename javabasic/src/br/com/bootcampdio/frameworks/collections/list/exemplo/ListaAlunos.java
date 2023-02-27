package br.com.bootcampdio.frameworks.collections.list.exemplo;
/*
Queremos manter uma lista de nomes de alunos de uma escola que oferece cursos de Informática básica. 
Essa lista será percorrida na ordem em que os elementos são inseridos. 
Além disso, queremos poder acessar um nome de aluno aleatoriamente.

 */
import java.util.*;
public class ListaAlunos {


  /**
   * @param args
   */
  public static void main(String[] args) {
      List<String> lista = new ArrayList<String>(); //criando um objeto arraylist
      lista.add("Joao Carlos"); //instanciando esse objeto
      lista.add("Maria da Silva");
      lista.add("Rafael Francisco");

      int[] lista1 = new int[]{2, 3, 6}; //instanciando um array de 3 posicoes
      


      System.out.println("Chamando a list implementada por ArrayList " + lista);
      System.out.printf("Chamando o Array sem implementar ArrayList %d, %d, %d%n " , lista1[0] ,  lista1[1] , lista1[2]);
  }


  
}


//Na lista voce consegue adicionar mais posicoes, nos arrrays voce precisaria criar outro array. 