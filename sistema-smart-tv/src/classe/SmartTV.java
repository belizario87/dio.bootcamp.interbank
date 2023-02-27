package classe;
/*
Criar um exemplo de uma aplicacao para uma smart tv 
Que ela tenha as caracteristicas: ligada (boolean), canal (int) e volume (int)
A TV podera ligar e desligar e assim mudar o estado ligada
A TV aumentara e diminuira o volume sempre em +1 ou -1
A TV podera mudar de acanal de 1 em 1 ou definindo o numero correspondente 
*/


public class SmartTV{ 
  boolean estaLigada = false;
  int canal = 1;
  int volume = 1;
    
    
    public void ligadaOuDesligada (){
      String estado = estaLigada == true ? "A TV esta ligada" : "A TV esta desligada"; 
      System.out.println(estado);
    }

    public void ligarTV(){
      this.estaLigada = true;
      System.out.println("A TV foi ligada");
    }

    public void desligarTV(){
      this.estaLigada = false;
      System.out.println("A TV foi desligada");
    }

    public void aumentarVolume(){
        if( volume > 0 && estaLigada == true){
          this.volume = volume;
          System.out.println("Volume: " + this.volume);
          this.volume++;
          System.out.println("Voce mudou o volume para: " + this.volume);
      } else {
          System.out.println("Esse volume e invalido ou a TV nao esta ligada");
      }    
    }

    public void diminuirVolume(){
        if( volume > 0 && estaLigada == true){
          this.volume = volume;
          System.out.println("Volume: " + this.volume);
          this.volume--;
          System.out.println("Voce mudou o volume para: " + this.volume);
      } else {
          System.out.println("Esse volume e invalido ou a TV nao esta ligada");
      }    
    }    

    public void inserirCanal(int canal){
        if( canal > 0 && estaLigada == true){
          this.canal = canal;
          System.out.println("Voce mudou para o canal: " + this.canal);
      } else {
          System.out.println("Esse canal e invalido ou a TV nao esta ligada");
      }  
    } 
          

    public void incrementarCanal(){
        if( canal >= 0 && estaLigada == true ){
          System.out.println("Canal: " + this.canal);
          this.canal++;
          System.out.println("Voce mudou para o canal: " + this.canal);
      } else {
          System.out.println("Esse canal e invalido ou a TV nao esta ligada");
      }  
    }

    public void decrementarCanal(){
        if(canal >= 0 && estaLigada == true) {
          System.out.println("Canal: " + this.canal);
          this.canal--;
          System.out.println("Voce mudou para o canal: " + this.canal);
      } else {
          System.out.println("Esse canal e invalido ou a TV nao esta ligada");
      }
       
    }

}
  








