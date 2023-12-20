import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kg,vki;
        Scanner ind= new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (metre cinsinde) giriniz: ");
        boy= ind.nextDouble();
        Scanner ind2= new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = ind2.nextDouble();


        vki= (kg/(boy*boy));
        System.out.println("Vücut kütle indeksiniz: " + vki);


    }
}