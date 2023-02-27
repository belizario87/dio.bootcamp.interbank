package br.com.bootcampdio.sintaxejava.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class ExercicioArrays1 {
  public static void main(String[] args) {
    
    int vetor[] = {2, -4, 17, 65, 3};
    System.out.print("Vetor: ");

      for(int i = vetor.length - 1 ; i >= 0 ; i--){
        System.out.print(vetor[i] + " ");
      }
  }
}

