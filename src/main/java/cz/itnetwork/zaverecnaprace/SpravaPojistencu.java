/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnaprace;

import java.util.ArrayList;

/**
 *
 * @author Petr
 */
public class SpravaPojistencu {
    private static ArrayList<Pojistenec> seznamPojistencu = new ArrayList();
    
    private SpravaPojistencu(){
        
    }
    
    public static void pridejPojistence(Pojistenec pojistenec){
        seznamPojistencu.add(pojistenec);
    }

    /**
     * @return the seznamPojistencu
     */
    public static ArrayList<Pojistenec> getSeznamPojistencu() {
        return seznamPojistencu;
    }
    
    
}
