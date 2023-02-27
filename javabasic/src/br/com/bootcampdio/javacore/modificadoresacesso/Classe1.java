package br.com.bootcampdio.javacore.modificadoresacesso;

public class Classe1 {
  private String atributo1 = "Sou atributo 1"; // aparece so dentro da classe
  protected String atributo2 = "Sou atributo 2"; //aparece so dentro da classe, subclasse e pacote
  public String atributo3 = "Sou atributo 3"; // aparece em todos os lugares

  private void metodo1(){
  
    System.out.println("Eu sou o metodo 1");
  
  }

  protected void metodo2(){

    System.out.println("Eu sou o metodo 2");

  }

  public void metodo3(){
    
    System.out.println("Eu sou o metodo 3");
  
  }
}
