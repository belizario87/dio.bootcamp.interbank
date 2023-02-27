package br.com.bootcampdio.frameworks.collections.set.exproposto1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ArcoIris {
  public static void main(String[] args) {
    System.out.println("-- Crie uma conjunto contendo as cores do arco-íris: --");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        
        System.out.println(coresArcoIris);


    System.err.println("-- Exiba todas as cores uma abaixo da outra:");
      for(String cores : coresArcoIris){
          System.out.println(cores);
      }
  
    System.err.println("-- A quantidade de cores que o arco iris tem:");
    System.out.println(coresArcoIris.size());

    System.out.println("-- Exiba as cores em ordem alfabetica:");
    
    Set<String> coresArcoIris1 = new TreeSet<>(coresArcoIris);
    System.out.println(coresArcoIris1);

    System.out.println("-- Exiba as cores na ordem inversa da que foi informada: ");
    Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));

    List<String> coresArcoIris4 = new ArrayList<>(coresArcoIris3);
    Collections.reverse(coresArcoIris4);
    System.out.println(coresArcoIris4);

    System.out.println("-- Confira se a cor azul esta no arco iris: " + coresArcoIris.contains("azul"));
      
    System.out.println("-- Exiba todas as cores que começam com a letra V: ");
      for (String cor : coresArcoIris4) {
        if(cor.startsWith("v")){
            System.out.println(cor);
        }
        
      }
    
    
    
    System.out.println("-- Remova todas as cores que não começam com a letra V: ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")){
                    iterator2.remove();
            } 
        }
        System.out.println(coresArcoIris);

    System.out.println("-- Limpe o conjunto ");  
    coresArcoIris.clear();
    System.out.println(coresArcoIris);


    System.out.println("Confira se o conjunto esta vazio: " + coresArcoIris.isEmpty());

    
         
          
  }          
            

}

    



