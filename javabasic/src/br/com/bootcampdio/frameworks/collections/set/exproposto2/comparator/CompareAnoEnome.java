package br.com.bootcampdio.frameworks.collections.set.exproposto2.comparator;

import java.util.Comparator;

import br.com.bootcampdio.frameworks.collections.set.exproposto2.LinguagemFavorita;

public class CompareAnoEnome implements Comparator <LinguagemFavorita> {

  @Override
  public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
    int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao()); //inserindo a comparacao atraves do metodo compare dos 2 inteiros.
    if(anoDeCriacao != 0){ // comparando se ano de criacao e igual a ano de criacao

      return anoDeCriacao;
    }

    
    return lf1.getNome().compareTo(lf1.getNome()); // comparando os nomes, caso a comparacao nao seja por ano de criacao ira retornar por nome
  }


  
}
