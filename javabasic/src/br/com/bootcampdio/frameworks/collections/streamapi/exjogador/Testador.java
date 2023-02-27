package br.com.bootcampdio.frameworks.collections.streamapi.exjogador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sound.midi.Soundbank;

public class Testador {

    public static void main(String[] args) {
        
        List<Jogador> jogadores = new ArrayList<>() {{
            add(new Jogador("Marcos", "Atacante", 25, "Fla", 15));
            add(new Jogador("Rafael", "Zagueiro", 29, "Flu", 8));
            add(new Jogador("Carlos", "Meio campo", 18, "Fla", 6));
            add(new Jogador("Joao", "L.Direito", 23, "Bangu", 0));
            add(new Jogador("Jose", "L.Esquerdo", 30, "Fla", 1));
            add(new Jogador("Gustavo", "Meio Campo", 35, "Vasco", 3));
            add(new Jogador("Marcelo", "Zagueiro", 17, "Fla", 4));
            add(new Jogador("Marcos Vaz", "Atacante", 25, "Vasco", 3));

        }};

        jogadores.forEach(System.out::println);
        System.out.println("Imprimir os jogadores do dicionario maiores que 18 anos");
        jogadores.stream()
        .filter(j -> j.getIdade()  >= 18)
        
        .forEach(System.out::println);

        jogadores.forEach(System.out::println);
        System.out.println("Imprimir os jogadores do dicionario menores que 18 anos");
        jogadores.stream()
        .filter(j -> j.getIdade()  < 18)
        
        .forEach(System.out::println);

        System.out.println("Imprimir apenas os jogadores que jogam na zaga");
        jogadores.stream()
        .filter(j -> j.getPosicao().equals("Zagueiro"))
        .collect(Collectors.toList())
        .forEach(System.out::println);
        
        System.out.println("Calcule a media de idade de todos os jogadores que sao atacantes");
        Double media = jogadores.stream()
        .filter(j -> j.getPosicao().equals("Atacante"))
        .mapToInt(i -> i.getIdade())
        .average()
        .getAsDouble();
        System.out.println(media);

        System.out.println("Quantos jogadores jogam no Fla: ");
        long jogadoresFla = jogadores.stream()
        .filter(j -> j.getTimeAtual()
        .equals("Fla"))
        .count();
        System.out.println(jogadoresFla);

        
        Optional<Jogador> artilheiro = jogadores.stream()
        .max(Comparator.comparing(Jogador::getGolsMarcados));
        System.out.println("Imprima o artilheiro do campeonato: " + artilheiro.get());

        
        boolean acimaDos30 = jogadores.stream()
            .anyMatch(j -> j.getIdade() > 30);
            System.out.println("Diga se existe algum jogador acima de 30 anos no dicionario : " + acimaDos30);
            
    }
}
            

        
        


    

    

