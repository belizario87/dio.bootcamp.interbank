package br.com.bootcampdio.frameworks.collections.set.exproposto2.comparator;

import java.util.Comparator;

import br.com.bootcampdio.frameworks.collections.set.exproposto2.LinguagemFavorita;

public class CompareName implements Comparator<LinguagemFavorita> {

  @Override
  public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
    
    return lf1.getNome().compareTo(lf2.getNome());
  }


  
}
