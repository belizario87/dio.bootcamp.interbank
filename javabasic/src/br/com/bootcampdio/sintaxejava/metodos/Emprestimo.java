package br.com.bootcampdio.sintaxejava.metodos;

import java.util.Scanner;

/*
3. Calcule o valor final de um emprestimo, a partir do valor solicitado. Taxas e parcelas influenciam. 
Defina arbitrariamente, as faixas que influenciam nos valores.

 */

public class Emprestimo {

Scanner inputValores = new Scanner(System.in);

  static double valor;
  static double parcelaFinanciamento;
  static double valorTotal = 0;

  public static void calcularEmprestimo(){
    
    
    valorTotal = valor + getTaxaParcelas();

    System.out.printf("Para o emprestimo no valor de %.2f voce pagara ao final R$: %.2f%n ", valor , valorTotal);
    
    calcularParcela();
    
  }
  

  public static double getTaxaParcelas(){
    
    double valorTotalTaxa = 0;
      if( parcelaFinanciamento == 2 ) {
        valorTotalTaxa = (valor * 3) / 100;
        
     } 
      else if (parcelaFinanciamento > 3 && parcelaFinanciamento < 8) {
        valorTotalTaxa = (valor * 4.5) / 100;
     } else {
        valorTotalTaxa = (valor * 6) / 100;
     }
      return valorTotalTaxa;
  }

   public static void calcularParcela(){
    double valorParcela = 0;
    valorParcela = valorTotal / parcelaFinanciamento; 
    System.out.println("O valor da parcela sera de R$: " + valorParcela);
  
  }   

  public static void main(String[] args) {
    Scanner inputValores = new Scanner(System.in);
    System.out.println("Digite o valor do emprestimo: ");
    valor = inputValores.nextDouble();
    System.out.println("Digite o valor das parcelas: ");
    parcelaFinanciamento = inputValores.nextDouble();
    
    
    calcularEmprestimo();
    
  }

}
    
    



     
     


   
    
  






// Juros de 2 a 4 parcelas = 4%
// Juros de 4 a 8 parcelas =  6 %
// Juros de 8 a 12 parcelas = 8 %



