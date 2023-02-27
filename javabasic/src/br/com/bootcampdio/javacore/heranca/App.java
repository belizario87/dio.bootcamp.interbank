package br.com.bootcampdio.javacore.heranca;

public class App {
  public static void main(String[] args) {
    Veiculo moto = new Veiculo(650, 2020, "LQT 2546", "Kawasaki Z", 20);
    Veiculo carro = new Veiculo(1.0, 1991, "MNG 7631", "Palio", 40);
    Veiculo caminhao = new Veiculo(4.0, 2022, "JHP 1129", "Mercedes Benz", 80);



  
  
    moto.imprimirVeiculo();
    moto.completarTanque(4.30);
    moto.ligar();
    System.out.println("------------------");
    carro.imprimirVeiculo();
    carro.completarTanque(5.10);
    caminhao.ligar();
    System.out.println("------------------");
    caminhao.imprimirVeiculo();
    caminhao.completarTanque(6.0);
    caminhao.ligar();
    
    
  }
}


    
    
   

