package br.com.bootcampdio.sintaxejava.metodos;
/**
 * METODOS:
 * 1. Os metodos sao partes de codigo que desempenham alguma funcao, podem ou nao retornar os dados.
 * 2. Possuem modificador de acesso (public, private e protected)
 * 3. Possuem um tipo de retorno, nome objetivo no infinitivo e parametros(s) 
 * --------
 * Quando criamos metodos devemos nos perguntar:
 * Qual a proposta principal do metodo ?
 * Qual o tipo de retorno esperado apos executar o metodo?
 * Quais os parametros serao necessarios para execucao do metodo ?
 * O metodo possui risco de apresentar alguma excecao ?
 * Qual a visibilidade do metodo ? Em toda aplicacao, ou nos mesmos pacotes, atraves de heranca ou na mesma classe
 *
 */

public class Metodos1 {
  public static String nomeCompleto(String primeiroNome, String segundoNome){ //Declarando o metodo com 2 parametros do tipo String
    return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome); // Concatenando as duas Strings
  }
  public static int somarDoisNumeros(int numeroUm, int numeroDois){
    return numeroUm + numeroDois;
  }
  public static void main(String[] args) {
    String primeiroNome;
    String segundoNome;
    int numeroUm;
    int numeroDois;
    
    System.out.println(nomeCompleto("Leonardo", "Belizario"));
    System.out.println(somarDoisNumeros(456, 1258));
  }
}


