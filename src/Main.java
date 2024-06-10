import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("desafio poo");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("desafio poo de js");
        curso2.setCargaHoraria(7);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("vai ter desafio de poo");
        mentoria1.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Trilha de backend em java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devDebora = new Dev();
        devDebora.setNome("Debora");
        devDebora.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos- Debora" + devDebora.getConteudosInscritos());
        devDebora.progredir();
        devDebora.progredir();
        System.out.println("Conteúdos Inscritos- Debora" + devDebora.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos- Debora" + devDebora.getConteudosConcluidos());
        System.out.println("XP: " + devDebora.calcularTotalXp());

        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        Dev devCristina = new Dev();
        devCristina.setNome("Cristina");
        devCristina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos- Cristina" + devCristina.getConteudosInscritos());
        devCristina.progredir();
        System.out.println("Conteúdos Inscritos- Cristina" + devCristina.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos- Cristina" + devCristina.getConteudosConcluidos());
        System.out.println("XP: " + devCristina.calcularTotalXp());
    }
}