import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setCargaHoraria(10);
        curso.setDescricao("TESTE");
        curso.setTitulo("TESTE CURSO");

        mentoria.setDescricao("TESTE");
        mentoria.setTitulo("TESTE MENTORIA");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
        System.out.println(curso);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev frodo = new Dev();
        frodo.setNome("Frodo");
        frodo.inscreverBootcamp(bootcamp);
        System.out.println(frodo.getConteudosInscritos());
        frodo.progredir();
        frodo.progredir();
        System.out.println(frodo.getConteudosConcluidos());
        System.out.println("XP: " + frodo.calcularTotalXp());

        Dev rafael = new Dev();
        rafael.setNome("Rafael");
        rafael.inscreverBootcamp(bootcamp);
        System.out.println(rafael.getConteudosInscritos());
        rafael.progredir();
        System.out.println(rafael.getConteudosConcluidos());
        System.out.println("XP: " + rafael.calcularTotalXp());

    }
}