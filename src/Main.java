import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int gt=1;
        int tong=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        n= scanner.nextInt();
        for (int i=1;i<=n;i++){
            gt=gt*i;
            tong= tong+gt;
        }
        System.out.println("tong la: "+tong);
    }
}