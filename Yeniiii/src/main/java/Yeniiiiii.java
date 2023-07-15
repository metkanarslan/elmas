import java.util.Scanner;
public class Yeniiiiii {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int n=inp.nextInt();
        int a=(n+1)/2;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println("");

        }
        int satirSay=n-a;
        for(int c=1; c<=satirSay; c++){
            for(int k=1; k<=c; k++){
                System.out.print(" ");
            }for(int h=1; h<=n-2; h++){
                System.out.print("*");
            }n-=2;
            System.out.println("");
        }



    }

}
