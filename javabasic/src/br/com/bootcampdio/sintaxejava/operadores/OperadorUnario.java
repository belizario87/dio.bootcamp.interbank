package br.com.bootcampdio.sintaxejava.operadores;

public class OperadorUnario {
    
    public static void main(String[] args) {
      int numero = 5;
      boolean variavel = false;
      
      numero = - numero; // para que o valor do operador unario funcione precisa ser declarado na variavel
      
      System.out.println(numero);

      numero = + numero; // le como um operador aritimetico para converter em positivo multiplica-se por -1
      numero = numero * -1;
      
      System.out.println(numero); 

      numero++; // E a mesma coisa que numero = numero + 1
      System.out.println(numero);

      System.out.println(++ numero); // para imprimir o incremento direto na chamada precisa primeiro colocar o incremento antes da variavel
      
      numero--; // E a mesma coisa que numero = numero -1 
      System.out.println(numero); 

      System.err.println(!variavel); // variavel inicializada como false se torna true com o valor de negacao (!)


    }
}
/*
Sao usados junto com os operadores aritmeticos
Servem para incrementar e decrementar
Servem tambem para mudar valores aritimeticos e booleanos

Sao eles -> (+) , (-), (++), (--), (!)
 */
