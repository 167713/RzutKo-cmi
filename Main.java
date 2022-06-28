import java.util.Scanner;
import java.util.*;
class Main {
  public static void main(String[] args) {
    int opcja;
    Scanner s = new Scanner(System.in);
    while(true){
      System.out.println("Liczba ścian kości: ");
      System.out.println("1: 4 ściany");
      System.out.println("2: 6 ścian");
      System.out.println("3: 12 ścian");
      System.out.println("4: 20 ścian");
      opcja=s.nextInt();
        switch(opcja){
        case 1:
             System.out.println("");
        cztery(); break;
        case 2:
             System.out.println("");
        szesc(); break;
        case 3:
             System.out.println("");
        dwan(); break;
        case 4:
             System.out.println("");
        dwad(); break;
        default: System.out.println("Brak opcji"); break;
    }
  }
}
  
public static int RNumer(int min, int max) {
    Random num = new Random();
    return num.nextInt(max - min + 1) + min;
}
  
public static void cztery() {
      Scanner st = new Scanner(System.in);
      System.out.println("Podaj ilosc kości: ");
      int ilosc, i=1, r=1;
      ilosc=st.nextInt();
    while(ilosc>=i){
        System.out.print("Rzut "+r+": ");
        System.out.println(RNumer(1, 4));
        ilosc--; r++;
      }
  System.out.println("");
  }
  
public static void szesc() {
      Scanner st = new Scanner(System.in);
      System.out.println("Podaj ilosc kości: ");
      int ilosc, i=1, r=1;
      ilosc=st.nextInt();
      while(ilosc>=i){
        System.out.print("Rzut "+r+": ");
        System.out.println(RNumer(1, 6));
        ilosc--; r++;
      }
  System.out.println("");
  }

  public static void dwan() {
      Scanner st = new Scanner(System.in);
      System.out.println("Podaj ilosc kości: ");
      int ilosc, i=1, r=1;
      ilosc=st.nextInt();
      while(ilosc>=i){
        System.out.print("Rzut "+r+": ");
        System.out.println(RNumer(1, 12));
        ilosc--; r++;
      }
  System.out.println("");
  }

  public static void dwad() {
      Scanner st = new Scanner(System.in);
      System.out.println("Podaj ilosc kości: ");
      int ilosc, i=1, r=1;
      ilosc=st.nextInt();
      while(ilosc>=i){
        System.out.print("Rzut "+r+": ");
        System.out.println(RNumer(1, 20));
        ilosc--; r++;
      }
  System.out.println("");
  }
}