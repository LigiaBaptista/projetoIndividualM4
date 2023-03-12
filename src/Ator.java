
public class Ator extends Artista{
//Atributos
    private String formacao;
//    Construtor
    public Ator(int id, String nome, int dataDeNascimento, String premiacoes, String genero, String bio, String formacao) {
        super(id, nome, dataDeNascimento, premiacoes, genero, bio);
        this.formacao = formacao;
    }

    //    Setters e Getters
    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
