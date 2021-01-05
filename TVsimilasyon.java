package Lahiyeler;

import java.util.Scanner;

public class TVsimilasyon {

    static Scanner axtar = new Scanner(System.in);
    static Televizor tv;
    public static void main(String[] args) {


        menuGoster();
        boolean cixis = false;
        while(cixis == false){
            System.out.println("Seciminiz : (Menyuyu gormekucun 8 basin)");
            int secim = axtar.nextInt();
            switch (secim){
                case 1:
                    tvKanallariDuzelt();
                    break;

                case 2:
                    tvAc();
                    break;
                case 8 :
                    menuGoster();;
                    break;
                case 0:
                    System.out.println("Sistemden cixilir");
                    cixis = true;
                    break;
                    default:
                    System.out.println("0 ile 8 arasi bir reqem secin ");
                    break;
            }
        }
    }

    private static Televizor tvAc() {
        if(tv != null) {
            tv = tvAc();
        }
        else{
            System.out.println("Evvel TV girin ve kanallari duzeldin");
        }

        return null;
    }

    private static void tvKanallariDuzelt() {


      if(tv == null){
          axtar.nextLine();
          System.out.println("TV markasina girin");
          String marka = axtar.nextLine();
          System.out.println(" TV nin olcusu.");
          String olcu = axtar.nextLine();
          tv = new Televizor(marka,olcu);
          System.out.println(tv);
      }else{
          System.out.println(tv);
      }
    }

    private static void menuGoster(){
        System.out.println("*****MENU******");
        System.out.println("0 -- Cixis\n"+
                "1 -- TV duzelt\n"+
                "2 -- TV Ac\n"+
                "3 -- sesi ac\n"+
                "4 -- Sesi baqla\n"+
                "5 -- Kanali goster\n"+
                "6 --Kanal haqqinda melumatlar \n"+
                "7 -- TV ni baqla\n"+
                "8 -- Menunu goster\n");
    }

}

