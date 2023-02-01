
package Service;

import Entidades.NIF;
import java.util.Locale;
import java.util.Scanner;


public class NIFService {
     Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ITALY);
    NIF n=new NIF();
    public void crearNif(){
        System.out.println("Ingrese su DNI");
        n.setDNI(sc.nextLong());
        char vec[]= new char[23];
        vec[0]='T';
        vec[1]='R';
        vec[2]='W'; 
        vec[3]='A';
        vec[4]='G';
        vec[5]='M';
        vec[6]='Y';
        vec[7]='F';
        vec[8]='P';
        vec[9]='D';
        vec[10]='X';
        vec[11]='B';
        vec[12]='N';
        vec[13]='J';
        vec[14]='Z';
        vec[15]='S';
        vec[16]='Q';
        vec[17]='V';
        vec[18]='H';
        vec[19]='L';
        vec[20]='C';
        vec[21]='K';
        vec[22]='E';
       char p= vec[(int)n.getDNI()%23];       
        n.setNif(p);        
    }
    public void mostrar(){
        crearNif();
       
        System.out.println("su NIF es: "+ n.getDNI()+"-"+n.getNif());
    }
}
