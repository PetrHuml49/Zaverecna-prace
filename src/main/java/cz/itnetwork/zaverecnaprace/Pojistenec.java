/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnaprace;

import java.time.LocalDate;

/**
 * Třída pro vytvoření pojištěnce a metody pro jednoduché získání osobních
 * údajů pojišteného
 * @author Petr
 */
public class Pojistenec {
    private String jmeno, prijmeni, telefon;
    private int vek;
    
    
    
    /**
     * @param jmeno         Jméno pojištěnce
     * @param vek           Věk pojištěnce
     * @param prijmeni      Příjmení pojištěnce
     * @param telefon       Telefonní číslo pojištěnce
     */
    public Pojistenec(String jmeno, String prijmeni, int vek, String telefon){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }
    
    @Override
    public String toString(){
        return String.format("%s\t\t%s\t\t%d\t%s", jmeno, getPrijmeni(), vek, telefon);
    }
    

    /**
     * @return Vrací jméno pojištěnce
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @return Vrací věk pojištěnce
     */
    public int getVek() {
        return vek;
    }

    /**
     * @return Vrací telefoní číslo
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * @return the prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }
}
