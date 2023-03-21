import java.util.Scanner;
public class Reto_1 {
    public static void main(String[] args) {       
       int NumN=0,prom=0,prom2;
        Scanner lect =new Scanner (System.in);         
        System.out.println("Por favor ingrese la cantidad de notas que quiere registrar");
        NumN=lect.nextInt(); 
        int [] Not = new int[NumN];
        for( int i=0; i<NumN;i++ ){
        System.out.println("Por favor ingrese la "+ i +" nota");
        Not[i]=lect.nextInt();
        System.out.println("la nota ingresada fue: "+Not[i]);          
        prom+=Not[i];
        }
        prom2=prom/NumN;
        System.out.println("su promedio es de: "+ prom2); 
        if(prom2<30){
            System.out.println("Reprobaste"); 
        } 
        else{
            if(prom2<40){
                System.out.println("Pasaste raspando"); 
            }
            else{
                if(prom2>=40){
                    System.out.println("Aprobaste con buen resultado"); 
                }
            }
        }
        lect.close();
    }
    
}