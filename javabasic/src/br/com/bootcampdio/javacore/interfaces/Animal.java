package br.com.bootcampdio.javacore.interfaces;



public class Animal implements SerVivo {
 boolean vivo = false;
 
  public void comer(){}
  public void mover(int massa){}
  public void info(){
    System.out.printf(" Vivo: %s%n", this.vivo ? "Sim" : "Nao");
  }

    public Animal(){
      
    }
}
