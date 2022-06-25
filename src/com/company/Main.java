package com.company;
import java.util.*;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String jakisText = scanner.nextLine();


        String[] tabela ={"pawel"};

        for (int index=0 ; index<tabela.length;index++) {

            if (jakisText.equals(tabela[index])) {
                  System.out.println("  witaj  " + tabela[index]);
            }

            else {
                String wynik = "niestety nie ma cie w bazie";
                    System.out.println(wynik);

            }

        }

    }

}
