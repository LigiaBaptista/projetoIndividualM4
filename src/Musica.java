public class Musica extends Midia {
//    Atributos
    private String[] artista;
    private int nota;

    private double duracao;

//   Construtor
    public Musica(int id, String titulo, String descricao, String genero, int duracao, int ano, String[] artista, int nota) {
        super(id, titulo, descricao, genero, ano);
        this.artista = artista;
        this.nota = nota;
        this.duracao = duracao;
    }

    //    Setters e Getters
    public String[] getArtista() {
        return artista;
    }

    public void setArtista(String[] artista) {
        this.artista = artista;
    }

    public int getNota() {
        if (nota >= 4) {
            System.out.println("Música Muito Boa");
        } else if (nota > 2 && nota < 4) {
            System.out.println("Música Boa");
        }
        else {
            System.out.println("Música de Qualidade Duvidosa");
        }
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
