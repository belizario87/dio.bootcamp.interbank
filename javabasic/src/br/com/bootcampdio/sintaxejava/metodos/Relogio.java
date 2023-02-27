package br.com.bootcampdio.sintaxejava.metodos;
// 2. A partir da hra do dia, informe a hora do dia adequada: Bom dia, boa tarde ou boa noite.
public class Relogio {
     /**
     * @param hora
     */
    public static void mensagemRelogio( int hora){
          if (hora <= 12 ) {
              System.out.println("Bom dia !");
          } else if (hora > 12 && hora <= 18 ){ 
              System.out.println("Boa tarde");
          } else if ( hora > 18){
              System.out.println("Boa noitche");
          }
           
    }
            
            
            

      
  
  
  public static void main(String[] args) {
    mensagemRelogio(23);

  }

  
}
