package br.com.bootcampdio.frameworks.collections.set.exproposto2.comparator;

import java.util.Comparator;

import br.com.bootcampdio.frameworks.collections.set.exproposto2.LinguagemFavorita;

public class CompareAnoEide implements Comparator<LinguagemFavorita>{

  @Override
  public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {

    int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
    if(anoDeCriacao != 0 ){
      return anoDeCriacao;
    }
    
    return lf1.getIde().compareTo(lf2.getIde());
  }


  
}
