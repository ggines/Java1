package biblioteca;

public class Obra extends Fitxa {

    private String autor;
    private short nrePags;

    public Obra(String referencia, String titol, String autor, short nrePags){
        super(referencia, titol);
        this.setAutor(autor);
        this.setNrePags(nrePags);
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setNrePags(short nrePags){
        this.nrePags = nrePags;
    }

    public int getNrePags(){
        return this.nrePags;
    }

    public String visualitzar(){
        return "Referència: " + getReferencia() + " |Títol: " + getTitol() + " |Autor: " + getAutor() + " |Num. Pags: " + getNrePags();
    }

    public String toString(){
        return "La referència és " + getReferencia();
    }
}
