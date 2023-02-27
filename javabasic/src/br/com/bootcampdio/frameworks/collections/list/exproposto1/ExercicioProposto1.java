package br.com.bootcampdio.frameworks.collections.list.exproposto1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExercicioProposto1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Double> temperatura = new ArrayList<Double>(); // cria o objeto ArrayList

    for (int i = 1; i <= 6; i++) {

      System.out.println("Digite uma temperatura: ");
      double temp = scan.nextDouble(); // atribui valores a lista
      temperatura.add(temp);
    }

    System.out.println(temperatura);

    Iterator<Double> iterator = temperatura.iterator(); // itera os elementos da lista e os soma
    double soma = 0;
    while (iterator.hasNext()) {
      double next = iterator.next();
      soma += next;

    }

    double mediaTemperaturasSemenstral = soma / temperatura.size();

    System.out.println("A temperatura media e: " + mediaTemperaturasSemenstral); // calcula a temperatura media

    Iterator<Double> iterator2 = temperatura.iterator(); // cria outro objeto para iterar a lista

    while (iterator2.hasNext()) { // percorre a lista e faz a comparacao da temperatura
      Double next = iterator2.next();
      if (next < mediaTemperaturasSemenstral) {
        iterator2.remove();

      }
    }

    System.out.println("As temperaturas que estao acima da media sao: ");

    for (Double temp : temperatura) {
      if (temp > mediaTemperaturasSemenstral) {
        int index = temperatura.indexOf(temp);
        switch (index) {
          case 0:
            System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
            break;
          case 1:
            System.out.println((index + 1) + " - FEVEREIRO: " + temp + " oC");
            break;
          case 2:
            System.out.println((index + 1) + " - MARÇO: " + temp + " oC");
            break;
          case 3:
            System.out.println((index + 1) + " - ABRIL: " + temp + " oC");
            break;
          case 4:
            System.out.println((index + 1) + " - MAIO: " + temp + " oC");
            break;
          case 5:
            System.out.println((index + 1) + " - JUNHO: " + temp + " oC");
            break;
          default:
            break;

        }

      }

    }

  }
}
