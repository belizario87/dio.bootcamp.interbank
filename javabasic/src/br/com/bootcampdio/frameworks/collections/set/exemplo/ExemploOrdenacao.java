package br.com.bootcampdio.frameworks.collections.set.exemplo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/
public class ExemploOrdenacao {

    public static void main(String[] args) {
      
      System.out.println("--\tOrdem aleatória\t--");
      Set<Series> minhasSeries = new HashSet<>(){{
      
        add(new Series("got", "fantasia", 60));
        add(new Series("dark", "drama", 60));
        add(new Series("that '70s show", "comédia", 25));
      
      }};

      for(Series serie : minhasSeries){
      
          System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
      
      }

      System.out.println("--\tOrdem insercao\t--");
      Set<Series> minhasSeries1 = new LinkedHashSet<>(){{

        add(new Series("got", "fantasia", 60));
        add(new Series("dark", "drama", 60));
        add(new Series("that '70s show", "comédia", 25));
      
      }};

      for(Series serie : minhasSeries1){
      
          System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
      
      }

      System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
      Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
      

      for(Series serie : minhasSeries2){
      
          System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
      
      }

       System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Series> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        
        
        for(Series serie : minhasSeries3){
      
          System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
      
      }
  
  }


    

}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Series>{

    @Override
    public int compare(Series s1, Series s2) {
      int nome = s1.getNome().compareTo(s2.getNome());
      if(nome != 0) return nome;
      
      int genero = s1.getGenero().compareTo(s2.getGenero());
      if(nome != 0) return genero;
      
      return  Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }

}


