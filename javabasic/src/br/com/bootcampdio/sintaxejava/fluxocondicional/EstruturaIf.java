package br.com.bootcampdio.sintaxejava.fluxocondicional;

/* 
As estruturas condicionais dizem se o bloco de codigo sera executado ou nao, baseado
na condicao da expressao, caso a condicao seja verdadeira (true) o bloco de codigo e 
executado, caso contrario (false) ele ira executar outro bloco de codigo ou encerrara.
Estruturas condicionais mais usadas sao o if e else e o switch case.
*/

public class EstruturaIf {
  public static void main(String[] args) {
    double nota1 = 8;
    double nota2 = 8.4;
    double media;

    media = nota1 + nota2 / 2;

        if (media < 4) {
          System.out.println("O aluno foi reprovado");
      } else if (media < 7 ) {
          System.out.println("O aluno esta de recuperacao"); 
      } else {
          System.out.println("O aluno foi aprovado");
      }
  }      
}
