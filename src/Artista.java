public class Artista {
//    Atributos
    private int id;
    private String nome;
    private int dataDeNascimento;
    private String premiacoes;
    private String genero;
    private String bio;

//    Construtor
    public Artista(int id, String nome, int dataDeNascimento, String premiacoes, String genero, String bio){
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.premiacoes = premiacoes;
        this.genero = genero;
        this.bio = bio;
    }

    //    Setters e Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(String premiacoes) {
        this.premiacoes = premiacoes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

}
