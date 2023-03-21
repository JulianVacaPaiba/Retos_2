import java.util.Scanner;
public class Reto_2 {
    public static void main(String[] args) {        
        int NumC=0;
        Scanner lect =new Scanner (System.in);        
        System.out.println("Por favor ingrese la cantidad de competidores");
        NumC=lect.nextInt();       
        float [] Tie = new float[NumC];
        String [] Nom = new String [NumC];
        for( int i=0; i<NumC;i++ ){
        System.out.println("Por favor ingrese el nombre del competidor");
        Nom[i]=lect.next();
        System.out.println("Por favor ingrese el tiempo que completo el competidor");
        Tie[i]=lect.nextFloat();
        }
        for( int j=0; j<NumC;j++ ) {
            System.out.println("El competidor "+Nom[j]+ " tuvo un tiempo de: "+Tie[j]+" Segundos");
        }
        lect.close();

    }
    
}