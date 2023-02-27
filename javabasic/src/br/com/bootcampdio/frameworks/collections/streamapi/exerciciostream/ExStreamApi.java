package br.com.bootcampdio.frameworks.collections.streamapi.exerciciostream;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExStreamApi {
    public static void main(String[] args) {
        List<String> numerosAleatorios = new ArrayList<>(Arrays.asList("1", "0", "4", "8", "2", "3", "9", "9", "6", "5"));

//        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        numerosAleatorios.stream()
//                .forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set:");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set:");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())

                .forEach(System.out::println);
        
        System.out.println("Transforme uma lista de string em uma lista de inteiros");
        
        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
        
        .map(t -> Integer.parseInt(t))
        .collect(Collectors.toList());
        System.out.println(numerosAleatorios1);

        
        
        
        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
        numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter(i -> i % 2 == 0 && i > 2)
        .collect(Collectors.toList())
        .forEach(System.out::println);



        System.out.println("Mostre a media dos numeros: ");
        
       numerosAleatorios.stream()
        .mapToInt(Integer::parseInt)
        .average()
        .ifPresent(System.out::println);
        
        
        System.out.println("Remova os valores impares: ");
        numerosAleatorios1.removeIf(i -> i % 2 != 0);
        System.out.println(numerosAleatorios1);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");

        numerosAleatorios.stream()
        .skip(3)
        .forEach(System.out::println);
        
        System.out.println("Retirando os números repetidos da lista, quantos números ficam?");
        long countNumerosUnicos = numerosAleatorios.stream()
        .distinct()
        .count();
        System.out.println(countNumerosUnicos);


    }


}