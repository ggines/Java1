package biblioteca;

abstract public class Fitxa {
    private String referencia, titol;

    public Fitxa(String referencia, String titol){
        this.setReferencia(referencia);
        this.setTitol(titol);
    }

    public String getReferencia(){
        return this.referencia;
    }

    public void setReferencia(String referencia){
        this.referencia = referencia;
    }

    public String getTitol(){
        return this.titol;
    }

    public void setTitol(String titol){
        this.titol = titol;
    }

    public abstract String visualitzar();
    public abstract String toString();
}
