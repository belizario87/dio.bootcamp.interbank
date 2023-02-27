package br.com.bootcampdio.frameworks.collections.list.exemplo;

import java.util.*;

public class ExemploLista {

  public static void main(String[] args) {
  // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

  //      List notas = new ArrayList(); //antes do java 5
  //      ArrayList<Double> notas = new ArrayList<>();
  //      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
          
      

      System.out.println("Crie uma lista e add 7 notas:");
          List <Double> notas = new ArrayList <>(Arrays.asList(2.1, 5.2, 5.6, 9.1, 1.4, 7.8, 80.1));
            System.out.println(notas);

      System.out.println("Exiba a posicao da nota 1.4: " + notas.indexOf(1.4));

      System.out.println("Adicione a nota por 8 na posicao 4: ");
          notas.add(4, 8.0);
            System.out.println(notas);


      System.out.println("Substitua a nota 9.1 pela nota 6.0: ");
          notas.set(3, 6d);
            System.out.println(notas);

      System.out.println("Substitua a nota 5.2 pela nota 0.0: ");
          notas.set(1, 0d);
            System.out.println(notas);


      System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));

      System.out.println("Exiba todas as notas na ordem em que foram informadas ");

          for (Double nota : notas) {
            System.out.println(nota);
          }
          
      System.out.println("Exiba todas a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

      System.out.println("Exiba a menor nota: " + Collections.min(notas));

      System.out.println("Exiba a maior nota: " + Collections.max(notas));

      System.out.println("Exiba a soma dos valores: ");
      Iterator<Double> iterator = notas.iterator();

      Double soma = 0d;

      while(iterator.hasNext()){
        Double next = iterator.next();
        soma += next;
      }

      System.out.println(soma);


      System.out.println("Exiba a media das notas: " + (soma)/notas.size());

      System.out.println("Remova a nota 0: ");
          notas.remove(1);
          System.out.println(notas);

      System.out.println("Remova a nota da posicao 0: ");
          notas.remove(0);
          System.out.println(notas);


      System.out.println("Remova as notas menores do que 7 e exiba a lista");
            Iterator<Double> iterator1 = notas.iterator();
            
            while(iterator1.hasNext()){
                
                if(iterator1.next() > 7){
                  iterator1.remove();
                }
            }
            System.out.println(notas);
  
      System.out.println("Apague toda a lista:");
      notas.clear();
      System.out.println(notas);

      System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());
  }
}
  
            
      
              
      

             

      
            
             
               
      



    






