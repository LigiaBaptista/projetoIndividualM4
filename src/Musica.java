public class Musica extends Midia {
//    Atributos
    private String[] artista;
    private int nota;

//   Construtor
    public Musica(int id, String titulo, String descricao, String genero, int duracao, int ano, String[] artista, int nota) {
        super(id, titulo, descricao, genero, duracao, ano);
        this.artista = artista;
        this.nota = nota;
    }

    //    Setters e Getters
    public String[] getArtista() {
        return artista;
    }

    public void setArtista(String[] artista) {
        this.artista = artista;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
