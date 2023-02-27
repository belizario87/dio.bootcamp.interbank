package br.com.bootcampdio.frameworks.collections.map.exemplo;
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExemploMap {

  public static void main(String[] args) {
    Map<String, Double> carrosPopulares1 = new HashMap<>() {
      {
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);

      }
    };
    System.out.println(carrosPopulares1);

    System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
    carrosPopulares1.put("gol", 15.2); // como o hashmap nao permite elementos repetidos e so substituir usando o put
    System.out.println(carrosPopulares1);

    System.out.println("Confira se o modelo tucson está no dicionário: ");
    System.out.println(carrosPopulares1.containsKey("tucson")); // retorna um boolean se o elemento estiver contido
                                                                   // no mapa

    System.out.println("Exiba o consumo do uno: "); // busca na chave referente
    System.out.println(carrosPopulares1.get("uno"));

    System.out.println("Exiba os modelos: ");
    Set<String> modelos = carrosPopulares1.keySet(); // retorna um set
    System.out.println(modelos);

    System.out.println("Exiba os consumos dos carros: ");
    Collection<Double> consumo = carrosPopulares1.values(); // Cria collection do tipo double e retorna os valores.
    System.out.println(consumo);

    System.out.println("Exiba o modelo mais economico de consumo: ");
    Set<Entry<String, Double>> entries = carrosPopulares1.entrySet();
    for (Entry<String, Double> entry : entries) {

      if (entry.getValue().equals(Collections.max(carrosPopulares1.values()))) {
        System.out.println("O carro mais e ficiente: " + entry.getKey() + " - " + entry.getValue());
      }
    }

    System.out.println("Exiba o modelo menos economico de consumo:");
    Set<Entry<String, Double>> entries1 = carrosPopulares1.entrySet();
    for (Entry<String, Double> entry1 : entries1) {
      if (entry1.getValue().equals(Collections.min(carrosPopulares1.values()))) {

        System.out.println("O carro menos eficiente: " + entry1.getKey() + " - " + entry1.getValue());

      }

    }

    Iterator<Double> iterator = carrosPopulares1.values().iterator(); //itarator para iterar sobre os valores do map
    double soma = 0d;
    while (iterator.hasNext()) {

      soma += iterator.next();

    }
    System.out.println("Exiba a soma dos consumos: " + soma);

    System.out.println("Exiba a média dos consumos deste dicionário de carros: " + soma / carrosPopulares1.size());

    System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
    Iterator<Double> iterator1 = carrosPopulares1.values().iterator(); //para iterar sobre os valores

    while(iterator1.hasNext()){
    
        if (iterator1.next().equals(15.6)) {
          
          iterator1.remove();

        }
    
    }
    
    System.out.println(carrosPopulares1);


    System.out.println("Exiba todos os carros na ordem em que foram informados: ");
     Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{  //usando linkedhashmap para imprimir por ordem de insercao
     
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);
     
     }};
     System.out.println(carrosPopulares2);
     
    System.out.println("Exiba todos os carros ordenados pelo modelo");
    Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2); // Usando o treemap para ordernar pela chave
    System.out.println(carrosPopulares3.toString());

    System.out.println("Apague o dicionario dos carros populares");

    carrosPopulares1.clear();
    System.out.println(carrosPopulares1);

    System.out.println("Mostre que o dicionario esta vazio: " + carrosPopulares1.isEmpty());



  }
}
    
      
    

      
      


  
