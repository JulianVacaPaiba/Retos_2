import java.util.Scanner;
public class Reto_4 {
    public static void main(String[] args) {
        Scanner lect=new Scanner(System.in);
        int n,m;
        System.out.println("Por favor digite la cantidad de filas para el concentrece");
        n= lect.nextInt(); 
        System.out.println("Por favor digite la cantidad de columnas para el concentrece");
        m= lect.nextInt();       
         int[][] Con=new int[n][m];                 
      for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            System.out.println("Ingrese el primer valor para el concentrese");
            Con[i][j]=lect.nextInt();
            
            }
        }
        for (int i=0; i<n ; i++) {
            for (int j=0 ; j<m ; j++) {

                System.out.print(Con[i][j]+"\t");

            }
            System.out.println("");
            
        }
    lect.close();

    }
    
}
