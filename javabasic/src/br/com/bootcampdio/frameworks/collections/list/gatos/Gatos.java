package br.com.bootcampdio.frameworks.collections.list.gatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

public class Gatos implements Comparable<Gatos> {
  String nome;
  int idade;
  String cor;

  Gatos(String nome, int idade, String cor){ //Construtor do objeto Gatos
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
  
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  @Override
  public String toString() {
    return "{Nome: " + nome + ", Idade: " + idade + ", Cor: " + cor + "}";
  }

   @Override
  public int compareTo(Gatos gatos) {
    
    return this.getNome().compareToIgnoreCase(gatos.getNome());
  }





  public static void main(String[] args) {
    
    
    List<Gatos> listGatos = new ArrayList<Gatos>(){{ //Criacao da List que vai instanciar objetos
          add(new Gatos("Jon", 18, "Preto")); // Instanciando os objetos ja dentro da list e adicionando 
          add(new Gatos("Simba", 6, "Tigrado"));
          add(new Gatos("Jon", 12, "amarelo"));
      }
    };
      
    System.out.println("------ Ordem de Inserção ------");
        System.out.println(listGatos);
    
    System.out.println("------ Ordem Aleatoria ------");   
      Collections.shuffle(listGatos);
      System.out.println(listGatos); 

    System.out.println("------ Ordem Natural ------(nome)"); 
    Collections.sort(listGatos);
    System.out.println(listGatos);
  
    System.out.println("------ Ordem Natural ------(idade)"); 
    Collections.sort(listGatos, new ComparatorIdade());
    System.out.println(listGatos);

  
  }


 
}












  

  





