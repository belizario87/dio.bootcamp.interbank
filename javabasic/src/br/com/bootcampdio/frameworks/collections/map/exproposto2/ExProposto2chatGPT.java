package br.com.bootcampdio.frameworks.collections.map.exproposto2;

import java.util.Random;

public class ExProposto2chatGPT {



    
    
    public static void main(String[] args) {
    
    
    
    Random random = new Random();
    int[] results = new int[6];
    int roll;
    
    for (int i = 0; i < 100; i++) {
      roll = random.nextInt(6) + 1;
      results[roll - 1]++;
    }
    
    for (int i = 0; i < 6; i++) {
      System.out.println("Valor " + (i + 1) + " foi conseguido " + results[i] + " vezes");
    }
  }
}
