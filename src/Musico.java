
public class Musico extends Artista{

//    Atributo

    private String atuacao;

//   Construtor
    public Musico(int id, String nome, int dataDeNascimento, String premiacoes, String genero, String bio, String atuacao) {
        super(id, nome, dataDeNascimento, premiacoes, genero, bio);
        this.atuacao = atuacao;
    }

    //    Setters e Getters
    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
}
