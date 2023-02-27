package br.com.bootcampdio.javacore.classes;

/**

* Em síntese, a classe é um conjunto de objetos com características em comum. E é justamente a 
classe quem define o comportamento do objeto. E o comportamento,
por sua vez, é definido por métodos (ação) e atributos (características).

* Sendo assim, todos os conceitos da POO (igualmente importantes) são baseados nesses dois iniciais, 
que são objetos e classes.

* Depois que uma classe é definida podem ser criados diferentes objetos que utilizam a classe. 
Como por exemplo a definição da classe Empresa, que tem os atributos 
nome, endereço, CNPJ, data de fundação, faturamento, e também o método imprimir, 
que apenas mostra os dados da empresa.

 */
public class Classes {
    String cor;                 //definindo atributos de classe
    String modelo;
    


 
  public Classes(String cor, String modelo) { //definindo constructor
    this.cor = cor;
    this.modelo = modelo;
    
  }

public String getCor() {      //definindo gueters and seters
      return cor;
    }

    public void setCor(String cor) {
      this.cor = cor;
    }

    public String getModelo() {
      return modelo;
    }

    public void setModelo(String modelo) {
      this.modelo = modelo;
    }

 



static void completarTanque(double valorGasolina, int capacidadeTanque) {

double valorApagar = valorGasolina * capacidadeTanque;
System.out.printf("O valor para completar o tanque e R$ %.2f", valorApagar);

}

public static void main(String[] args) {
  completarTanque(5.50, 40);
}
  
}


/**
Crie um metodo que calcule o valor total para enxer o tanque de gasolina, entre como parametro o valor da 
gasolina.Faca tambem duas sobrecargas do construtor.

 */