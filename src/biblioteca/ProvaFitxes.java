package biblioteca;
import java.util.Scanner;
import static biblioteca.Constantes.*;

public class ProvaFitxes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String referencia, titol, autor;
        short nrePags, any, nro;

        System.out.print(MSG0);
        System.out.print(MSG1);
        referencia = sc.next();
        System.out.print(MSG2);
        titol = sc.next();
        System.out.print(MSG3);
        autor = sc.next();
        System.out.print(MSG4);
        nrePags= sc.nextShort();
        Obra Obra1 = new Obra(referencia, titol, autor, nrePags);
        System.out.println(Obra1.visualitzar());
        System.out.println(Obra1.toString());
        System.out.println(MSG00);
        System.out.print(MSG1);
        referencia = sc.next();
        System.out.print(MSG2);
        titol = sc.next();
        System.out.print(MSG5);
        any = sc.nextShort();
        System.out.print(MSG6);
        nro = sc.nextShort();
        Revista Revista1 = new Revista(referencia, titol, any, nro);
        System.out.println(Revista1.visualitzar());
        System.out.println(Revista1.toString());
        System.out.println(MSG000);
        System.out.print(MSG1);
        referencia = sc.next();
        System.out.print(MSG2);
        titol = sc.next();
        System.out.print(MSG3);
        autor = sc.next();
        System.out.print(MSG6);
        nro = sc.nextShort();
        Volum Volum1 = new Volum(referencia, titol, autor, nrePags, nro);
        System.out.println((Volum1.visualitzar()));
        System.out.println(Volum1.toString());
    }
}
