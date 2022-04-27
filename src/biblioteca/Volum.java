package biblioteca;

public class Volum extends Obra {
    private short nro;

    public Volum(String referencia, String titol, String autor, short nrePags, short nro){
        super(referencia, titol, autor, nrePags);
        this.setNro(nro);
    }

    public void setNro(short nro){
        this.nro = nro;
    }

    public short getNro(){
        return this.nro;
    }

    public String visualitzar(){
        return "Referència: " + getReferencia() + " |Títol: " + getTitol() + " |Autor: " + getAutor() + " |Num. Pags: " + getNrePags() + " |Número de volum: " + getNro();
    }

    public String toString(){
        return "La referència és: " + getReferencia();
    }
}
