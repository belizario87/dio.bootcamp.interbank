package br.com.bootcampdio.sintaxejava.fluxorepeticao;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class ExercicioLoop1 {
    public static void main(String[] args) {
      String nome;
      int idade;

      Scanner scan = new Scanner(System.in);

   

    while(true) 
      {
    
        System.out.println("Insira o nome: ");
        nome = scan.next();

        if(nome.equals("0") ) break;

        System.out.println("Insira a idade:");
        idade = scan.nextInt();

        
    
      }
    

    }


  
}
