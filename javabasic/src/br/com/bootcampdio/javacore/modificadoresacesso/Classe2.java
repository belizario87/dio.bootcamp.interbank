package br.com.bootcampdio.javacore.modificadoresacesso;

public class Classe2 extends Classe1 {  // classe 2 herda classe 1
  
      //Atributos proprios

    void metodo(){
    //so tem acesso aos atributos 2 e 3 pq sao protected e public
    //so tem acesso aos metodos 2 e 3 pq sao protected e public
    
    System.out.printf("%s, %s%n" , atributo3, atributo2);
    
    
    }

    public static void main(String[] args) { 
      
      Classe2 teste1 = new Classe2();
      teste1.metodo();
      teste1.metodo2();
      teste1.metodo3();
    
    }

}
