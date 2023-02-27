package br.com.bootcampdio.sintaxejava.operadores;

public class OperadorTernario {
  public static void main(String[] args) {
     int a = 5;
     int b = 6;
    
   String resultado = a < b ? "Veradeiro" : "Falso";
   System.out.println(resultado);

  }
  

}
/*
O operador ternario funciona como um if, como uma condicao.
Estrutura -> <Expressao condicional> ? <caso seja true> : <caso seja false>
 */
