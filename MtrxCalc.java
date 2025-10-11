
import java.util.Scanner;
class Calc{
    static void Add(){
       System.out.println("enter matrix size: ");
       Scanner Z=new Scanner(System.in);
       int n=Z.nextInt();
       int[][] a=new int[n][n];
       int[][] b=new int[n][n];
       int[][] c=new int[n][n];
       
       System.out.println("Enter elements of first matrix:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                a[i][j] =Z.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                b[i][j] =Z.nextInt();
            }
        }
        for (int i=0;i<n; i++) {
            for (int j=0;j<n;j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Result:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
               System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        } 
         Z.close();
    }
     static void subst(){
       System.out.println("enter matrix size: ");
       Scanner Z=new Scanner(System.in);
       int n=Z.nextInt();
       int[][] a=new int[n][n];
       int[][] b=new int[n][n];
       int[][] c=new int[n][n];
       
       System.out.println("Enter elements of first matrix:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                a[i][j] =Z.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                b[i][j] =Z.nextInt();
            }
        }
        for (int i=0;i<n; i++) {
            for (int j=0;j<n;j++) {
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("Result:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
               System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        } 
         Z.close();
    }
     static void trans(){
       System.out.println("enter matrix size: ");
       Scanner Z=new Scanner(System.in);
       int n=Z.nextInt();
       int[][] a=new int[n][n];
       int[][] c=new int[n][n];
       
       System.out.println("Enter elements of first matrix:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                a[i][j] =Z.nextInt();
            }
        }
        for (int i=0;i<n; i++) {
            for (int j=0;j<n;j++) {
                c[i][j]=a[j][i];
            }
        }
        System.out.println("Result:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
               System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        } 
         Z.close();
    }
    static void Multi(){
       System.out.println("enter matrix size: ");
       Scanner Z=new Scanner(System.in);
       int n=Z.nextInt();
       int[][] a=new int[n][n];
       int[][] b=new int[n][n];
       int[][] c=new int[n][n];
       
       System.out.println("Enter elements of first matrix:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                a[i][j] =Z.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                b[i][j] =Z.nextInt();
            }
        }
        for (int i=0;i<n; i++) {
            for (int j=0;j<n;j++) {
                c[i][j]=0;
                for (int k=0;k<n;k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Result:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
               System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }
       Z.close();
    }
}
class MtrxCalc {
    public static void main(String[] args) {
         Scanner O=new Scanner(System.in); 
        int o;
      do{
         System.out.println("Matrix operation:");
          System.out.println("1.Addition:");
          System.out.println("2.Substraction:");
           System.out.println("3.Multiplication:");
            System.out.println("4.Transpose:");
             System.out.println("0.exit:");
         System.out.print("enter your choice:"); 
            o=O.nextInt();
            if(o==0){
            System.out.println("exiting from program");
            break;
          }
        
         switch (o) {
            case 1:
                Calc.Add();
                break;
            case 2:
                Calc.subst();
                break;
            case 3:
                Calc.Multi();
                break;
            case 4:
                Calc.trans();
                break;
         
            default:
             System.out.println("invalid choice");
                break;
          }
        }
        while(o!=0); 
    }
}
