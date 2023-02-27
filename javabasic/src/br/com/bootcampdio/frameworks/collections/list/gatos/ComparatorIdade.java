package br.com.bootcampdio.frameworks.collections.list.gatos;

import java.util.Comparator;



public class ComparatorIdade implements Comparator<Gatos> {

  @Override
  public int compare(Gatos g1, Gatos g2) {
    
    return Integer.compare(g1.getIdade(), g2.getIdade());
  }


  
}
