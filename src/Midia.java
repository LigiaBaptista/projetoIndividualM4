
public abstract class Midia {
//    Atributos
    private int id;
    private String titulo;
    private String descricao;
    private String genero;
    private int ano;

//   Construtor
    public Midia(int id, String titulo, String descricao, String genero, int ano){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.genero = genero;
        this.ano = ano;
    }

    //    Setters e Getters
    public int getId() {
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(){
        this.descricao = descricao;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
