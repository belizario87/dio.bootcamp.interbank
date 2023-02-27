package br.com.bootcampdio.javacore.modificadoresacesso;

public class Classe3 {
   
   Classe1 classe1;  // Classe 3 associa com Classe1;

    void metodo() {
      
      //atributos 2 e 3 
      System.out.println(classe1.atributo2);
      System.out.println(classe1.atributo3);
      //meotodos 2 e 3
      classe1.metodo2();
      classe1.metodo3();
      
    }

    

    public static void main(String[] args) {
      Classe1 teste2 = new Classe1(); //instancia objeto do tipo Classe1
      
      

      System.out.printf("%s, %s%n", teste2.atributo2, teste2.atributo3); //imprime atributo 2 e 3 do tipo Classe1 pq eles sao protected e public
      teste2.metodo2(); //chama metodo 2 e 3 pq eles sao protected e private                       
      teste2.metodo3();

    
    }
}

      

      
      

      
      
      

