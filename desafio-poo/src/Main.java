import br.com.dio.desafio.dominio.*;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
       Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("descricao java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("descricao js");
        curso1.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricacao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp Java");
        bootcamp. getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamilla = new Dev();
        devCamilla.setNome("Camilla");
        devCamilla.inscreverBootcamp(bootcamp);

         Dev devJoao = new Dev();
         devJoao.setNome("Joao");
         devJoao.inscreverBootcamp(bootcamp);


         System.out.println("Conteudos Inscritos Camila: ");
         for(Conteudo conteudo : devCamilla.getConteudosInscritos()){

           System.out.println(conteudo.getTitulo() + " - " + conteudo.getDescricao());

         }
         devCamilla.progredir();
         System.out.println("Conteudos Concluidos Camila: ");
         for(Conteudo conteudo : devCamilla.getConteudosConcluidos()){
          System.out.println(conteudo.getTitulo() + " - " + conteudo.getDescricao());

         }
         System.out.println("Conteudos Inscritos atualizado: ");
         for(Conteudo conteudo : devCamilla.getConteudosInscritos()){

          System.out.println(conteudo.getTitulo() + " - " + conteudo.getDescricao());

         }

           System.out.println("Exp atual: " + devCamilla.calcularTotalXp());

           System.out.println("####################################");

         System.out.println("Conteudos Inscritos Joao: ");
          for(Conteudo conteudo : devJoao.getConteudosInscritos()){

           System.out.println(conteudo.getTitulo() + " - " + conteudo.getDescricao());

          }
          devJoao.progredir();
          devJoao.progredir();

          System.out.println("Conteudos Concluidos Joao: ");
          for(Conteudo conteudo : devJoao.getConteudosConcluidos()){
           System.out.println(conteudo.getTitulo() + " - " + conteudo.getDescricao());

          }
          System.out.println("Conteudos Inscritos atualizado: ");
          for(Conteudo conteudo : devJoao.getConteudosInscritos()){

           System.out.println(conteudo.getTitulo() + " - " + conteudo.getDescricao());

          }

     System.out.println("Exp atual: " + devJoao.calcularTotalXp());
























    }

}
