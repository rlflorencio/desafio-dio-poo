package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso (String titulo, String descricao, int cargaHoraria) {
        super.titulo = titulo;
        super.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public Curso () {

    }

    public double calcularXp() {
        return XP_PADRAO;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
