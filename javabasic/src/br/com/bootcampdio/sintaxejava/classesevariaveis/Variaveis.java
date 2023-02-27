package br.com.bootcampdio.sintaxejava.classesevariaveis;


public class Variaveis {
    String nome = "Leonardo";
    int idade = 35;
    boolean simOuNao = true;
    double altura = 1.80;
    int estadosDoBrasil = 27; // Nao pode ser alterada
  
    public static void main(String[] args) {
        //metodo principal da aplicacao, sem ele o programa nao funciona
        //usado para instanciar objetos
    }
}

/**
 * Variaveis:
 * 1. Precisam ter um tipo, nome bem definido, atribuicao (Em alguns casos nao)
 * 2. Comecam com letra minuscula em notacao camelCase
 * 3. Ocupam um lugar na memoria e sao volateis(podem ser alteradas)
 * 4. Para que as variaveis nao possam ser alteradas precisa usar a palavra-chave *final*
 * 5. Nao podem comecar com numeros ou caracteres especiais, apenas com $ ou _
 * 6. Quando queremos usar uma constante para que o valor da variavel nao seja alterado usamos
 * a palavra reservada final e com o nome da variavel toda em maiscula.
 * 7. Tipos primitivos em Java -> byte, short, long, int, char, float, double, boolean
 */