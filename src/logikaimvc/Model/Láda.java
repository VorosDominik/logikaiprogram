/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logikaimvc.Model;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class Láda {
    private String anyag,felirat;
    private boolean kincs;

    public Láda(String anyag, String felirat, boolean kincs) {
        this.anyag = anyag;
        this.felirat = felirat;
        this.kincs = kincs;
    }

    public Láda(String anyag, String felirat) {
           this(anyag,felirat,false);
    }

    public String getAnyag() {
        return anyag;
    }

    public String getFelirat() {
        return felirat;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public void setFelirat(String felirat) {
        this.felirat = felirat;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }
    
    
    
    
}
