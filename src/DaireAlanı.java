import java.util.Scanner;

public class DaireAlanı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz: " );
        int r=input.nextInt();
        System.out.println("Merkez açısını giriniz: ");
        double a=input.nextDouble();
        double Alan=(Math.PI * (r*r) * a) /360;
        System.out.println("Daire diliminin alanı: "+Alan);
    }
}
