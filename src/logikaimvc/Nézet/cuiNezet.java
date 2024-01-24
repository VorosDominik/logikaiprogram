/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logikaimvc.Nézet;

import java.util.Scanner;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class cuiNezet {
    private static final Scanner sc= new Scanner(System.in);
    private final String SEP= System.lineSeparator();
    
    private void konzolrair(String msg){
        System.out.print(msg+SEP);
    
    
    }
    public void feladatmegjelenitö(String msg){
        konzolrair(msg+SEP);
    }
    public int valasztas(String msg){
        konzolrair(msg);
        return sc.nextInt();
    
    }
     public void eredmenymegjelenito(String msg){
        konzolrair(msg+SEP);
       
    
    }
}
