package br.com.bootcampdio.frameworks.collections.map.exemplo.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import br.com.bootcampdio.frameworks.collections.map.exemplo.Livro;

public class ComparatorNome implements Comparator <Map.Entry<String, Livro>> {

 

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        
        return l1.getValue().getNomeLivro().compareTo(l2.getValue().getNomeLivro());
    }

}
