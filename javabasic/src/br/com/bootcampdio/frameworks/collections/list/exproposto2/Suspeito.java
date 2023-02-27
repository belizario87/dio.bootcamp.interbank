package br.com.bootcampdio.frameworks.collections.list.exproposto2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa
 * sobre um crime. As perguntas são:
 * 1. "Telefonou para a vítima?"
 * 2. "Esteve no local do crime?"
 * 3. "Mora perto da vítima?"
 * 4. "Devia para a vítima?"
 * 5. "Já trabalhou com a vítima?"
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada
 * como "Suspeita", entre 3 e 4 como
 * "Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como
 * "Inocente".
 * 
 * entrada -> As respostas das perguntas
 * saida -> Classificacao do suspeito
 * como fazer -> Criar uma lista
 */

public class Suspeito {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      List<String> perguntasSuspeito = new ArrayList<String>(Arrays.asList( // Cria e instancia a lista
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"));

      for (int i = 1; i <= 5; i++) { // Laco de repeticao para inserir dados da respostas e colocar esses dados na
                                     // lista

         System.out.println("Responda a pergunta " + i + " com Sim ou Nao :");

         String respostas = scan.next();
         perguntasSuspeito.add(respostas);

      }

      int respostasSim = Collections.frequency(perguntasSuspeito, "Sim");

      if (respostasSim < 3) {
         System.out.println("Suspeito");

      } else if (respostasSim >= 3 && respostasSim < 5) {
         System.out.println("Cumplice");

      } else {
         System.out.println("Assassino");

      }

   }

}

// if(perguntasSuspeito.equals("Sim")){
// respostasSim++;
// }

// if ( respostasSim >= 2){
// System.out.println("Suspeito");

// } else if (respostasSim <= 4 && respostasSim < 5){
// System.out.println("Cumplice");

// } else {
// System.out.println("Assassino");

// }
