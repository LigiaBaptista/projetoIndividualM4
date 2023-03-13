import java.util.ArrayList;
public class Filme extends Midia{
//   Atributos
    private String tipo;
    private String diretor;
    private String[] atores;

    private Double duracao;

//   Construtor
    public Filme(int id, String titulo, String descricao, String genero, double duracao, int ano, String tipo, String diretor, String[] atores) {
        super(id, titulo, descricao, genero, ano);
        this.tipo = tipo;
        this.diretor = diretor;
        this.atores = atores;
        this.duracao = duracao;
    }

    //    Setters e Getters
    public String getTipo() {
        if (duracao >= 90) {
            System.out.println("Longa Metragem");
        }
        else {
            System.out.println("Curta Metragem");
        }
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String[] getActors() {
        return atores;
    }

    public void setActors(String[] atores) {
        this.atores = atores;
    }

    public String[] getAtores() {
        return atores;
    }

    public void setAtores(String[] atores) {
        this.atores = atores;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }
}
