import java.util.ArrayList;
public class Filme extends Midia{
//   Atributos
    private String tipo;
    private String diretor;
    private String[] atores;

//   Construtor
    public Filme(int id, String titulo, String descricao, String genero, int duracao, int ano, String tipo, String diretor, String[] atores) {
        super(id, titulo, descricao, genero, duracao, ano);
        this.tipo = tipo;
        this.diretor = diretor;
        this.atores = atores;
    }

    //    Setters e Getters
    public String getTipo() {
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
}
