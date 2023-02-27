package br.com.bootcampdio.sintaxejava.operadores;

public class OperadoresRelacionais {



public static void main(String[] args) {
  int numeroUm = 10;
  int numeroDois = 24;
  int numeroTres = 35;
  int numeroQuatro = 35;
  
  System.out.println(numeroUm > numeroDois); // false pq numero1 e menor que numero2
  System.out.println(numeroUm < numeroDois); // true pq numero 1 e menor que numero2
  System.out.println(numeroTres == numeroQuatro); // true pq numero3 e igual a numero4
  System.out.println(numeroTres >= numeroQuatro); // true pq numero3 e igual a numero4
  System.out.println(numeroTres != numeroQuatro); // false pq numero3 e igual a numero4 
}
  
}

/* 
Operadores relacionais servem para fazer comparacoes e retornam um valor true ou false
Os operadores relacionais sao:
> Maior que 
< Menor que
>= Maior ou igual que 
<= Menor ou igual que
== Igual
!= Diferente



*/
