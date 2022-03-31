package com.company;
import java.util.Scanner;

public class Main {

    private static final String MSG = "Introdueix el nom: ";
    private static final String MSG2 = "Introdueix el model de cotxe: ";
    private static final String MSG3 = "Introdueix el color del cotxe: ";
    private static final String MSG4 = "Introdueix el preu del cotxe: ";
    private static final String MSG5 = "Introdueix la raça de gat: ";
    private static final String MSG6 = "Introdueix el color del gat: ";
    private static final String MSG7 = "Introdueix el pes del gat: ";
    private static final String MSG8 = "Introdueix el color del la cadira: ";
    private static final String MSG9 = "Introdueix el tipus de cadira: ";
    private static final String MSG10 = "Introdueix l'alçada del quadrat: ";
    private static final String MSG11 = "Introdueix l'amplada del quadrat: ";

    public static void main(String[] args) {
	   Person alumne = new Person(); //alumne és una instància de la classe Person
       Scanner sc = new Scanner(System.in);
       System.out.println(MSG);
       alumne.setName(sc.next());

       Car cotxe = new Car(); //cotxe és una instància de la classe Car
       System.out.println(MSG2);
       cotxe.setModel(sc.next());
       System.out.println(MSG3);
       cotxe.setColor(sc.next());
       System.out.println(MSG4);
       cotxe.setPrice(sc.nextFloat());

       Cat animal = new Cat();
       System.out.println(MSG5);
       animal.setBreed(sc.next());
       System.out.println(MSG6);
       animal.setColor(sc.next());
       System.out.println(MSG7);
       animal.setWeight(sc.nextFloat());

       Chair cadira = new Chair();
       System.out.println(MSG8);
       cadira.setColor(sc.next());
       System.out.println(MSG9);
       cadira.setTipus(sc.next());

       Square quadrat = new Square();
       System.out.println(MSG10);
       quadrat.setHeight(sc.nextFloat());
       System.out.println(MSG11);
       quadrat.setWidth(sc.nextFloat());

       System.out.println(alumne.getName());
       System.out.println("Model del cotxe: "+cotxe.getModel());
       System.out.println("Color del cotxe: "+cotxe.getColor());
       System.out.println("Preu del cotxe: "+cotxe.getPrice()+" €");
       System.out.println("Raça del gat: "+animal.getBreed());
       System.out.println("Color del gat: "+animal.getColor());
       System.out.println("Pes del gat: "+animal.getWeight());
       System.out.println("Color de la cadira: "+cadira.getColor());
       System.out.println("Tipus de cadira: "+cadira.getTipus());
       System.out.println("Alçada del quadrat: "+quadrat.getHeight());
       System.out.println("Amplada del quadrat: "+quadrat.getWidth());
    }
}
