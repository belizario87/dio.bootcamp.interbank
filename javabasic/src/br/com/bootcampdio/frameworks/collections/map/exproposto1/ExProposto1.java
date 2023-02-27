package br.com.bootcampdio.frameworks.collections.map.exproposto1;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 ----
 a) Crie um dicionario e relaciona os estados e suas populacoes;
 b) Substitua a populacao do estado do RN por 3.534.165;
 c) Confira se o estado PB esta no dicionario, caso nao adicione: PB - 4.039.277;
 d) Exiba a populacao do PE;
 f) Exiba todos os estados e populacoes na ordem que foram informados;
 g) Exiba os estados e populacoes em ordem alfabetica;
 h) Exiba os estado com a menor populacao e sua quantidade;
 i) Exiba os estado com a maior populacao e sua quantidadel
 j) Exiba oa soma da populacao desses estados;
 l) Exiba a media da populacao deste dicionario de estados;
 m) Remova os estados com a populacao menor que 4.000.000;
 n) Apague o dicionario de estados;
 o) Confira se o dicionario esta vazio;
 
 */

public class ExProposto1 implements Comparable<Integer> {
    public static void main(String[] args) {

        System.out.println("a) Crie um dicionario e relaciona os estados e suas populacoes");
        Map<String, Integer> estadosNordeste = new HashMap<>();
        {
            {
                estadosNordeste.put("PE", 9616621);
                estadosNordeste.put("AL", 3351543);
                estadosNordeste.put("CN", 9187103);
                estadosNordeste.put("RN", 3534265);
            }
        }

        for (Map.Entry<String, Integer> estadoNordeste : estadosNordeste.entrySet()) {
            System.out.println(estadoNordeste.getKey() + " - " + estadoNordeste.getValue());

        }

        System.out.println("b) Substitua a populacao do estado do RN por 3.534.165;");
        estadosNordeste.put("RN", 3534165);

        for (Map.Entry<String, Integer> estadoNordeste : estadosNordeste.entrySet()) {
            System.out.println(estadoNordeste.getKey() + " - " + estadoNordeste.getValue());

        }

        // System.out.println("c) Confira se o estado PB esta no dicionario, caso nao
        // adicione: PB - 4.039.277: "
        // + estadosNordeste.containsKey("PB"));
        // if (!estadosNordeste.containsKey("PB")) {
        // estadosNordeste.put("PB", 4039277);

        // }

        // for (Map.Entry<String, Integer> estadoNordeste : estadosNordeste.entrySet())
        // {
        // System.out.println(estadoNordeste.getKey() + " - " +
        // estadoNordeste.getValue());

        // }

        System.out.println("d) Exiba a populacao do PE: " + estadosNordeste.get("PE"));
        System.out.println("f) Exiba todos os estados e populacoes na ordem que foram informados;");
        Map<String, Integer> estadosNordeste1 = new LinkedHashMap<>() {
            {

                putAll(estadosNordeste);

            }
        };

        for (Map.Entry<String, Integer> estadoNordeste : estadosNordeste1.entrySet()) {
            System.out.println(estadoNordeste.getKey() + " - " + estadoNordeste.getValue());

        }
        System.out.println("g) Exiba os estados e populacoes em ordem alfabetica: ");
        Map<String, Integer> estadosNordeste2 = new TreeMap<>(estadosNordeste1);

        for (Map.Entry<String, Integer> estadoNordeste : estadosNordeste2.entrySet()) {
            System.out.println(estadoNordeste.getKey() + " - " + estadoNordeste.getValue());

        }

        Collection<Integer> Populacao = estadosNordeste.values();
        String menorPopulacao = " ";
        String maiorPopulacao = " ";

        for (Map.Entry<String, Integer> entry : estadosNordeste.entrySet()) {

            if (entry.getValue().equals(Collections.min(Populacao))) {
                menorPopulacao = entry.getKey();
            }

            if (entry.getValue().equals(Collections.max(Populacao))) {
                maiorPopulacao = entry.getKey();
            }

        }
        System.out.println("h) Exiba os estado com a menor populacao e sua quantidade: " + menorPopulacao + " - "
                + Collections.min(Populacao));

        System.out.println("i) Exiba os estado com a menor populacao e sua quantidade: " + maiorPopulacao + " - "
                + Collections.max(Populacao));

        int soma = 0;
        soma = Collections.min(Populacao) + Collections.max(Populacao);
        System.out.println("j) Exiba oa soma da populacao desses estados: " + soma);

        Iterator<Integer> iterator = estadosNordeste.values().iterator();

        int somaTodosEstados = 0;
        while (iterator.hasNext()) {
            int next = iterator.next();
            somaTodosEstados += next;
        }
        System.out.println("l) Exiba a media da populacao deste dicionario de estados: "
                + somaTodosEstados / estadosNordeste.size());

        System.out.println("m) Remova os estados com a populacao menor que 4.000.000: ");

        Iterator<Integer> iterator2 = estadosNordeste.values().iterator();

        while (iterator2.hasNext()) {
            int next = iterator2.next();
            if (next <= 4000000) {
                iterator2.remove();
            }
        }

        for(Map.Entry<String, Integer> entry : estadosNordeste.entrySet()){

            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("n) Apague o dicionario de estados: ");
        estadosNordeste.clear();
        System.out.println(estadosNordeste);

        System.out.print("o) Confira se o dicionario esta vazio: ");
        if(estadosNordeste.isEmpty()){
            System.out.println("Sim, esta vazio");
        } else {
            System.out.println("Nao esta vazio");
        }




    }

    @Override
    public int compareTo(Integer estado) {

        return estado.intValue();
    }

}
