/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author oouak
 */
public class Demande_soutenance {
    
    private int ID;
    private int ID_doc;
    private int ID_encadrant ;
    private String Theme ;
    private Date date_envisage ;

    public int getID() {
        return ID;
    }

    public int getID_doc() {
        return ID_doc;
    }

    public int getID_encadrant() {
        return ID_encadrant;
    }

    public String getTheme() {
        return Theme;
    }

    public Date getDate_envisage() {
        return date_envisage;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setID_doc(int ID_doc) {
        this.ID_doc = ID_doc;
    }

    public void setID_encadrant(int ID_encadrant) {
        this.ID_encadrant = ID_encadrant;
    }

    public void setTheme(String Theme) {
        this.Theme = Theme;
    }

    public void setDate_envisage(Date date_envisage) {
        this.date_envisage = date_envisage;
    }
    
    
}
