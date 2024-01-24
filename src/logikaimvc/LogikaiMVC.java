/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logikaimvc;

import logikaimvc.Model.Láda;
import logikaimvc.Nézet.cuiNezet;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class LogikaiMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        feladat();
    }

    private static void feladat() {
        
        Láda L1=new Láda("arany", "én rejtem");
        Láda L2=new Láda("ezüst", "nem én rejtem",true);
        Láda L3=new Láda("bronz", "az arany hazudik");
        
        cuiNezet c= new cuiNezet();
        
        c.feladatmegjelenitö(
                "a szobában 3 láda van "
                        + "minden ládának van felirata melyek igy szolnak:"+System.lineSeparator()
                        + L1.getAnyag()+": "+L1.getFelirat()+System.lineSeparator()
                        + L2.getAnyag()+": "+L2.getFelirat()+System.lineSeparator()
                        + L3.getAnyag()+": "+L3.getFelirat()+System.lineSeparator()
        
        
        
        
        
        
        );
        
        
        
        
        
        
        
        
    }
    
}
