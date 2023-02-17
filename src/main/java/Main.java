import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setCargaHoraria(10);
        curso.setDescricao("TESTE");
        curso.setTitulo("TGESTE CURSO");

        mentoria.setDescricao("TESTE");
        mentoria.setTitulo("TESTE MENTORIA");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
        System.out.println(curso);
    }
}