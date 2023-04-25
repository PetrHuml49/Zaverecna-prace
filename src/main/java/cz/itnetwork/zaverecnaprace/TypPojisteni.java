/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package cz.itnetwork.zaverecnaprace;

/**
 *
 * @author Petr
 */
public enum TypPojisteni {
    Zivotni("Životní pojištění"),
    Nemovitost("Pojištění nemovitosti"),
    Automobil("Pojištění vozidla"),
    Odpovednost("Pojištění odpovědnosti"),
    Zadne("Bez pojištění");
    
    
    
    private String text;
    
    TypPojisteni(String text){
        this.text = text;
    }
    
    @Override
    public String toString(){
        return text;
    }
}
