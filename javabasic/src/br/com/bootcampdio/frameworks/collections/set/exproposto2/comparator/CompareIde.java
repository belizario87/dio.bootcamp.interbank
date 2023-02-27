package br.com.bootcampdio.frameworks.collections.set.exproposto2.comparator;

import java.util.Comparator;

import br.com.bootcampdio.frameworks.collections.set.exproposto2.LinguagemFavorita;

public class CompareIde implements Comparator<LinguagemFavorita> {

  @Override
  public int compare(LinguagemFavorita ide1, LinguagemFavorita ide2) {
    
    return ide1.getIde().compareTo(ide2.getIde());
  }

 




}