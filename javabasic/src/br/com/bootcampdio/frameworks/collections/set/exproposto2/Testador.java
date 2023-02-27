package br.com.bootcampdio.frameworks.collections.set.exproposto2;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.bootcampdio.frameworks.collections.set.exproposto2.comparator.CompareAnoEide;
import br.com.bootcampdio.frameworks.collections.set.exproposto2.comparator.CompareAnoEnome;
import br.com.bootcampdio.frameworks.collections.set.exproposto2.comparator.CompareIde;
import br.com.bootcampdio.frameworks.collections.set.exproposto2.comparator.CompareName;

public class Testador {

  public static void main(String[] args) {

    Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();

    linguagens.add(new LinguagemFavorita("TypeScript", 1995, "IntelliJ"));
    linguagens.add(new LinguagemFavorita("Java", 1988, "Netbeans"));
    linguagens.add(new LinguagemFavorita("Kotlin", 2000, "AndroidStudio"));

    System.out.println("Imprima por ordem de insercao");

    for (LinguagemFavorita linguagemFavorita : linguagens) {
      System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - "
          + linguagemFavorita.getIde());
    }

    System.out.println("--------------------");
    System.out.println("Imprima pela ordem natural (nome)");
    Set<LinguagemFavorita> linguagens1 = new TreeSet<LinguagemFavorita>(new CompareName());
    linguagens1.addAll(linguagens);

    for (LinguagemFavorita linguagemFavorita : linguagens1) {
      System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - "
          + linguagemFavorita.getIde());
    }

    System.out.println("--------------------");
    System.out.println("Imprima pela ordem natural (IDE)");
    Set<LinguagemFavorita> linguagens2 = new TreeSet<>(new CompareIde());
    linguagens2.addAll(linguagens);
    Iterator<LinguagemFavorita> iterator = linguagens2.iterator();

    for (LinguagemFavorita linguagemFavorita : linguagens2) {
      System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - "
          + linguagemFavorita.getIde());
    }

    System.out.println("--------------------");
    System.out.println("Imprima pelo ano de criacao e nome");

    Set<LinguagemFavorita> linguagens3 = new TreeSet<LinguagemFavorita>(new CompareAnoEnome());
    linguagens3.addAll(linguagens);

    for (LinguagemFavorita linguagemFavorita : linguagens3) {
      System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - "
          + linguagemFavorita.getIde());

    }

    System.out.println("--------------------");
    System.out.println("Imprima pelo ano de criacao e IDE");
    Set<LinguagemFavorita> linguagens4 = new TreeSet<LinguagemFavorita>(new CompareAnoEide());
    linguagens4.addAll(linguagens);

    for (LinguagemFavorita linguagemFavorita : linguagens4) {
      
      System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - "
          + linguagemFavorita.getIde());

    }

  }

}
