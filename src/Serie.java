
public class Serie extends Midia{
//    Atributos
    private int temporadas;
    private String[] elenco;

//    Construtor
    public Serie(int id, String titulo, String descricao, String genero, double duracao, int ano, int temporadas, String[] elenco) {
        super(id, titulo, descricao, genero, duracao, ano);
        this.temporadas = temporadas;
        this.elenco = elenco;
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
}
