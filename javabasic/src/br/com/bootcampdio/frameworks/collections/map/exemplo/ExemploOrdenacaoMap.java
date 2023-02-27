package br.com.bootcampdio.frameworks.collections.map.exemplo;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

import javax.print.attribute.HashAttributeSet;

import br.com.bootcampdio.frameworks.collections.map.exemplo.comparator.ComparatorNome;
import br.com.bootcampdio.frameworks.collections.map.exemplo.comparator.ComparatorPagina;
import br.com.bootcampdio.frameworks.collections.set.exproposto2.comparator.CompareName;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

public class ExemploOrdenacaoMap {
  public static void main(String[] args) {

    System.out.println("--\tOrdem aleatória\t--");
    Map<String, Livro> meusLivros = new HashMap<>() {
      {

        put("Hawking, Stephen", new Livro(256, "Uma Breve História do Tempo"));
        put("Duhigg, Charles", new Livro(408, "O Poder do Hábito"));
        put("Harari, Yuval Noah", new Livro(432, "21 Lições Para o Século 21"));

      }
    };
    for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
      System.out.println(livro.getKey() + " - " + livro.getValue().getNomeLivro());

    }

    System.out.println("--\tOrdem insercao\t--");
    Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {
      {

        put("Harari, Yuval Noah", new Livro(432, "21 Lições Para o Século 21"));
        put("Hawking, Stephen", new Livro(256, "Uma Breve História do Tempo"));
        put("Duhigg, Charles", new Livro(408, "O Poder do Hábito"));

      }
    };

    for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
      System.out.println(livro.getKey() + " - " + livro.getValue().getNomeLivro());

    }

    System.out.println("--\tOrdem alfabetica dos livros\t--");
    Map<String,Livro> meusLivros2 = new TreeMap<>(meusLivros1);

    for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
      System.out.println(livro.getKey() + " - " + livro.getValue().getNomeLivro());

    }

    System.out.println("--\tOrdem alfabetica nome dos livros\t--");
    Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
    meusLivros3.addAll(meusLivros1.entrySet());

    for (Map.Entry<String, Livro> livro : meusLivros3) {
      System.out.println(livro.getKey() + " - " + livro.getValue().getNomeLivro());

    }

    System.out.println("--\tOrdem pelo numero de pagina\t--");
    Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
    meusLivros4.addAll(meusLivros1.entrySet());

    
    for (Map.Entry<String, Livro> livro : meusLivros4) {
      System.out.println(livro.getKey() + " - " + livro.getValue().getNomeLivro());

    }




  }
}
