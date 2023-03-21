import java.util.Scanner;
public class Reto_3 {
    public static void main(String[] args) {        
        Scanner lect=new Scanner(System.in);

        
         int[][] Cod=new int[4][4];  
         int[][] Pre=new int[4][4];                    
         String[][] NomP=new String[4][4];
      for(int k=0;k<4;k++)
        {
            for(int h=0;h<4;h++)
            {
            System.out.println("Digite el codigo del producto");
            Cod[k][h]=lect.nextInt(); 
            System.out.println("Digite el nombre del producto");
            NomP[k][h]=lect.next();  
            System.out.println("Digite el precio del producto");
            Pre[k][h]=lect.nextInt();         

            }
        }
        System.out.println(" ");
        for (int i = 0; i < 4; i++) {
          for (int j = 0; j < 4; j++) {
              System.out.print(Cod[i][j] + "\t");
          }
          System.out.println("");
          
          for (int j = 0; j < 4; j++) {
              System.out.print(NomP[i][j] + "\t");
          }
          System.out.println("");
          for (int j = 0; j < 4; j++) {
            System.out.print(Pre[i][j] + "\t");
          }
          System.out.println(" ");
        }
    lect.close();

    }
    
}
