package br.com.bootcampdio.javacore.heranca;

public class Veiculo {   //ATRIBUTOS DE INSTANCIA DA CLASSE VEICULO
  double motor;
  int anoDoVeiculo;
  String placa;
  String modelo;
  static int capacidadeTanque;
  

  public Veiculo(double motor, int anoDoVeiculo, String placa, String modelo, int capacidadeTanque) {
    this.motor = motor;
    this.anoDoVeiculo = anoDoVeiculo;
    this.placa = placa;
    this.modelo = modelo;
    this.capacidadeTanque = capacidadeTanque;  //METODO CONSTRUTOR DA CLASSE
  

  

  
  }public double getMotor() {  // GETERS AND SETERS
    return motor;
  }

  public void setMotor(double motor) {
    this.motor = motor;
  }

  public int getAnoDoVeiculo() {
    return anoDoVeiculo;
  }

  public void setAnoDoVeiculo(int anoDoVeiculo) {
    this.anoDoVeiculo = anoDoVeiculo;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
 
  void imprimirVeiculo(){    //METODO PARA IMPRIMIR VEICULO

  System.out.println("Motor: " + this.motor);
  System.out.println("Ano do veiculo: " + this.anoDoVeiculo);
  System.out.println("Placa: " + this.placa);
  System.out.println("Modelo: " + this.modelo);
  System.out.println("Capacidade do tanque: " + this.capacidadeTanque);
  
  }    
  
  
  
  static void completarTanque(double valorGasolina) {  //METODO PARA CALCULAR O VALOR DO TANQUE CHEIO * PRECO LITRO GASOLINA
      
      double valorApagar = valorGasolina * capacidadeTanque;
      System.out.printf("O valor para completar o tanque e R$ %.2f%n", valorApagar);

  }

  void ligar(){ // METODO PARA LIGAR O VEICULO.
    System.out.println("Seu veiculo foi ligado !");
  }

}
