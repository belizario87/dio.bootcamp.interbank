package br.com.bootcampdio.javacore.interfaces;

public class Calculadora implements OperacaoMat {

public void somar(){}

@Override
public void somar(int operando1, int operando2) {
  System.out.println("Soma = " + (operando1 + operando2));
  
}

@Override
public void subtrair(int operando1, int operando2) {
  System.out.println("Subtracao = " + (operando1 - operando2));
  
}

@Override
public void multiplicar(int operando1, int operando2) {
  System.out.println("Multiplicacao = " + (operando1 * operando2));
  
}

@Override
public void dividir(int operando1, int operando2) {
  System.out.println("Divisao = " + (operando1 / operando2));
  
}


  
}
