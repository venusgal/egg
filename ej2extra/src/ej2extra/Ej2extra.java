
package ej2extra;


public class Ej2extra {

    
    public static void main(String[] args) {
        int a=3;
        int b=7;
        int c=9;
        int d=1;
        int aux=a+b+d;
        System.out.println("a=["+a+"]"+" b=["+b+"]"+" c=["+c+"]"+" d=["+d+"]");
        a=d;
         d=aux-b-a;
        b=c;
        c=aux-a-d;
        
        System.out.println("a=["+a+"]"+" b=["+b+"]"+" c=["+c+"]"+" d=["+d+"]");
                
    }
    
}
