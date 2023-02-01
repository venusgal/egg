    /*
    * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
    * and open the template in the editor.
 */
package Entidades;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Windows 10 Pro
 */
public class Cadena {

    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    public String frase;
    public int lon;

    public Cadena() {
    }

    public Cadena(String frase, int lon) {
        this.frase = frase;
        this.lon = lon;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public void MostrarVocales(String frase, int lon) {
        int con = 0;

        for (int i = 0; i < lon; i++) {
            if (frase.substring(i, i + 1).equals("a") || frase.substring(i, i + 1).equals("e") || frase.substring(i, i + 1).equals("i") || frase.substring(i, i + 1).equals("o") || frase.substring(i, i + 1).equals("u")) {
                con++;
            }
        }
        System.out.println("Hay " + con + " vocales");
    }

    public void Invertirfrase(String frase, int lon) {

        System.out.print("la frase invertida es:");
        for (int i = lon - 1; i >= 0; i--) {
            System.out.print(frase.substring(i, i + 1));
        }
        System.out.println("");
    }

    public void vecesRepetido(String frase, int lon) {
        int con = 0;
        System.out.println("Ingrese el caracter que desea encontrar");
        String carac = sc.next();
        if (carac.length() > 1) {
            System.out.println("solo se puede ingresar un caracter");
        } else {
            for (int i = 0; i < lon; i++) {
                if (frase.substring(i, i + 1).equals(carac)) {
                    con++;
                }
            }

        }
        System.out.println("El caracter " + carac + " se repite " + con + " veces");
    }

    public void CompararLongitudes(String frase, int lon) {

        String nfrase;
        System.out.println("Ingrese una nueva frase para compararla con la anterior");
        nfrase = sc.next();
        if (lon == nfrase.length()) {
            System.out.println("Las frases tienen la misma longitud");
        } else if (lon < nfrase.length()) {
            System.out.println("La primera frase es menor a la segunda");
        } else {
            System.out.println("La primera frase es mayor a la segunda");
        }
    }

    public void UnirFrases(String frase) {

        String nfrase;
        System.out.println("Ingrese una nueva frase para unirla a la anterior");
        nfrase = sc.next();
        nfrase = frase.concat(" " + nfrase);
        System.out.println(nfrase);
    }

    public void reemplazar(String frase, int lon) {
        int con = 0;
        String frase2;
        System.out.println("Ingrese el caracter que desea reemplazar por la letra 'a'");
       char carac = sc.next().charAt(0);
        
               frase2=frase.replace('a', carac);
            
        
        System.out.println(frase2);
    }
    public void contiene(String frase, int lon){
        System.out.println("Ingrese el caracter que desea comprobar");
    String carac = sc.next();
    boolean c;
    c=frase.contains(carac);
        System.out.println(c);
}

}
