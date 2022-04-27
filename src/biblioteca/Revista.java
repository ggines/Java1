package biblioteca;

public class Revista extends Fitxa {

    private short any, nro;

    public Revista(String referencia, String titol, short any, short nro){
        super(referencia, titol);
        this.setAny(any);
        this.setNro(nro);
    }

    public void setAny(short any){
        this.any = any;
    }

    public short getAny(){
        return this.any;
    }

    public void setNro(short nro){
        this.nro = nro;
    }

    public short getNro(){
        return this.nro;
    }

    public String visualitzar(){
        return "Referència: " + getReferencia() + " |Títol: " + getTitol() + " |Any: " + getAny() + " |Número de revista: " + getNro();
    }

    public String toString(){
        return "La referència és: " + getReferencia();
    }
}
