package br.com.bootcampdio.sintaxejava.operadores;

public class OperadoresLogicos {
    
    public static void main(String[] args) {
    boolean a = false;
    boolean b = true;
    boolean c = false;
    boolean d = true;
    boolean f = true;

    System.out.println(!a); //Negando a com operador NOT
    System.out.println(!a == c); // a == c (true) mas o NOT torna false
    
    System.out.println(a || b); // a OU b --> true pq apenas uma precisa ser true
    System.err.println( a && b); // a E b --> false pq as duas precisam ser true
    System.out.println(b && d && f); // b E d E f --> true porque todas sao true

      
    }
  
}


/**
As principais linguagens de programação utilizam 3 operadores lógicos:
&& que representa a conjunção lógica 'e'.
|| que representa a disjunção lógica 'ou'.
! que representa a negação lógica 'não'.
and. para a conjunção lógica 'e'.
or. para a disjunção lógica 'ou'.
not. para a negação lógica 'não'.
 */
