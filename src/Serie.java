
public class Serie extends Midia{
//    Atributos
    private int temporadas;
    private String[] elenco;

    private double duracao;

//    Construtor
    public Serie(int id, String titulo, String descricao, String genero, double duracao, int ano, int temporadas, String[] elenco) {
        super(id, titulo, descricao, genero, ano);
        this.temporadas = temporadas;
        this.elenco = elenco;
        this.duracao = duracao;
    }

//Setter e Getters
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
