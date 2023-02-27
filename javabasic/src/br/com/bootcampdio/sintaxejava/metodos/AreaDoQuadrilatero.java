package br.com.bootcampdio.sintaxejava.metodos;
/*
Desenvolva uma aplicacao que calcule usando sobrecarga de metodo a area dos 3 quadrilateros:
quadrado, retangulo e trapezio 
 */
public class AreaDoQuadrilatero {
    

    public static void calcularArea(){
        double l1 = 25;
        double l2 = 10;
        double areaRetangulo = l1 * l2;
        System.out.println("A area do retangulo e: " + areaRetangulo);
    }

    public static double calcularArea(double lado1){

      return lado1 * lado1;
    }

     public static double calcularArea(double baseMaior, double baseMenor, double altura){

      return (baseMaior + baseMenor) * altura / 2;
    }
  
  public static void main(String[] args) {
    calcularArea();
    System.out.println("A area do quadrado e: " + calcularArea(10));
    System.out.println("A area do trapezio e: " + calcularArea(5, 8, 4)); 
  }
}


  
  


