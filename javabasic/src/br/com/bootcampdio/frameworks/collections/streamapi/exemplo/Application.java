package br.com.bootcampdio.frameworks.collections.streamapi.exemplo;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {
        List<Pessoa> pessoas = getPessoas();
        
        //Filter -> filtrar informacoes
        List<Pessoa> vinteCincoMais = pessoas.stream()
                    .filter(pessoa -> pessoa.getIdade() > 25)
                    .collect(Collectors.toList());

        // vinteCincoMais.forEach(Pessoa::exibe); // Method Reference

        // Sort -> Ordenacao
        List<Pessoa> ordenadoPorIdade = pessoas.stream()
                    .sorted(Comparator.comparing(Pessoa::getIdade)
                    .thenComparing(Pessoa::getGenero)
                    .thenComparing(Pessoa::getNome)
                    ).collect(Collectors.toList());


                   ordenadoPorIdade.forEach(Pessoa :: exibe);

        // All match 
        boolean allMatch = pessoas.stream()
            .allMatch(pessoa -> pessoa.getIdade() > 15);  
          //  System.out.println(allMatch);     

        // Any match
        boolean anyMatch = pessoas.stream()
        .anyMatch(pessoa -> pessoa.getIdade() > 60);
            

        // None match 
        boolean noneMatch = pessoas.stream()
        .anyMatch(pessoa -> pessoa.getIdade() > 15);
         //   System.out.println(noneMatch);

         Optional<Pessoa> max = pessoas.stream()
                .max(Comparator.comparing(Pessoa::getIdade));
            if(max.isPresent()){
                System.out.println(max.get());

            };


            Optional<Pessoa> min = pessoas.stream()
                .min(Comparator.comparing(Pessoa::getIdade));
            if(min.isPresent()){
               // System.out.println(min.get());

            };
                
                
    }
    
    public static List<Pessoa> getPessoas() {
        return List.of(
        new Pessoa("Jose", 30, Genero.MASCULINO),
        new Pessoa("Maria", 28, Genero.FEMININO),
        new Pessoa("Gloria Maria", 23, Genero.FEMININO),
        new Pessoa("Rodolfo", 17, Genero.MASCULINO),
        new Pessoa("Manuel", 45, Genero.MASCULINO),
        new Pessoa("Maricleide", 36, Genero.FEMININO),
        new Pessoa("Julia", 23, Genero.FEMININO),
        new Pessoa("Joao", 23, Genero.MASCULINO),
        new Pessoa("Cleiton", 51, Genero.MASCULINO),
        new Pessoa("Elena", 42, Genero.FEMININO),
        new Pessoa("Klaus", 19, Genero.MASCULINO),
        new Pessoa("Damon", 23, Genero.MASCULINO),
        new Pessoa("Leia", 62, Genero.FEMININO),
        new Pessoa("Rey", 24, Genero.MASCULINO)
        );
        
        
        
        
        
        
        
    
    
    
    
    }

}
