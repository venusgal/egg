
package Entidades;


public class mesSecreto {
    String mes []= new String[12];
    String mesSe;
 
    public mesSecreto() {
    }

    public mesSecreto(String mesSe) {
        this.mesSe = mesSe;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSe() {
        return mesSe;
    }

    public void setMesSe(String mesSe) {
        this.mesSe = mesSe;
    }
    
}
