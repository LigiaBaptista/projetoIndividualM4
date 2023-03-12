import java.util.ArrayList;
import java.util.Collections;
public class Playlist {
//    Atributos
    private String nome;
    private ArrayList<Midia> listaMidia;
    private int indiceMidiaAtual;

    public Playlist(String nome){
        this.nome = nome;
        listaMidia = new ArrayList<Midia>();
        indiceMidiaAtual = 0;
    }
//    Setters e Getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Midia> getListaMidia() {
        return listaMidia;
    }

    public void setListaMidia(ArrayList<Midia> listaMidia) {
        this.listaMidia = listaMidia;
    }

    public Midia getIndiceMidiaAtual() {
        return listaMidia.get(indiceMidiaAtual);
    }

    public void setIndiceMidiaAtual(int indiceMidiaAtual) {
        this.indiceMidiaAtual = indiceMidiaAtual;
    }

//    Outros Métodos
    public void adicionar_midia(Midia midia){
        listaMidia.add(midia);
    }

    public void remover_midia(Midia midia){
        listaMidia.remove(midia);
    }

    public void prox_midia(){
        if(indiceMidiaAtual < listaMidia.size() - 1){
            indiceMidiaAtual++;
        } else {
            indiceMidiaAtual = 0;
        }
    }

    public void voltar_midia(){
        if (indiceMidiaAtual > 0){
            indiceMidiaAtual--;
        } else {
            indiceMidiaAtual = listaMidia.size() - 1;
        }
    }

    public void misturar_midias(){
        Collections.shuffle(listaMidia);
        indiceMidiaAtual = 0;
    }
}



