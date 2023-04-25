/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnaprace;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Petr
 */
public class UzivatelskeRozhrani {
    Scanner sc = new Scanner(System.in, "UTF-8");
    private int zvolenaMoznost = 0;
    public void spustit(){
        while(zvolenaMoznost != 4){
            switch(zvolenaMoznost){
                case 0 -> menu();
                case 1 -> pridej();
                case 2 -> vypis();
                case 3 -> hledej();


                default -> System.out.println("Neplatná volba.");
            }
            zvolenaMoznost = Integer.parseInt(sc.nextLine());
        }
        
        
    }
    
    private void menu(){
        System.out.println("--------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("--------------------------");
        System.out.println("Vyberte si akci:");
        System.out.println("1 - Přidat nového pojištěného\n" +
                           "2 - Vypsat všechny pojištěné\n" +
                           "3 - Vyhledat pojištěného\n" +
                           "4 - Konec\n" + 
                           " ");
    }
    
    private void vypis(){
        //String.format("%s    %s  %d  %s", jmeno, getPrijmeni(), vek, telefon);
        System.out.println("Jméno\t\tPříjmenít\tVěk\tTel. číslo");
        System.out.println("------------------------------------------------");
        
        ArrayList<Pojistenec> seznam = SpravaPojistencu.getSeznamPojistencu();
        for(Pojistenec pojistenec : seznam){
            System.out.println(pojistenec);            
        }
                
        System.out.println();
    }
    
    private void hledej(){
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine();
        
        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeni = sc.nextLine();
        
        ArrayList<Pojistenec> seznam = SpravaPojistencu.getSeznamPojistencu();
        
        System.out.println("Jméno   Příjmení  Věk   Tel. číslo");
        System.out.println("-----------------------------------");
        for(Pojistenec pojistenec : seznam){
            String jmenoPojistence = pojistenec.getJmeno();
            String prijmeniPojistence = pojistenec.getPrijmeni();
            if(prijmeniPojistence.equals(prijmeni) && jmenoPojistence.equals(jmeno)){
                System.out.println(pojistenec);
            }             
        }
        
    }
    
    private void pridej(){
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine();
        
        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeni = sc.nextLine();
        
        System.out.println("Zadejte věk pojištěného:");
        int vek = Integer.parseInt(sc.nextLine());
        
        System.out.println("Zadejte telefon pojištěného:");
        String telefon = sc.nextLine();
        
        SpravaPojistencu.pridejPojistence(new Pojistenec(jmeno, prijmeni, vek, telefon));
        System.out.println("Data byla uložena.");
    }
}
