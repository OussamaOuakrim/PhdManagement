/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Doctorant {
    public int ID ; 
    public String Nom ;
    public String Prenom ;
    public String Email ;
    public String Cin ;
    public String Password ;
    public String Sujet ;
    public int Telephone ;
    public int Id_encadrant ;
    public String Image ;

    public Doctorant(int ID, String Nom, String Prenom, String Email, String Cin,String Password, String Sujet, int Telephone, int Id_encadrant, String Image) {
        this.ID = ID;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email = Email;
        this.Cin = Cin;
        this.Password = Password;
        this.Sujet = Sujet;
        this.Telephone = Telephone;
        this.Id_encadrant = Id_encadrant;
        this.Image = Image;
    }
    
    
    
// cette classe doit contenir les attributs doctorant ainisi que les fonctions de gestion qui vont gerer les liste des dotorant et actionner les bouttons

    public int getID() {
        return ID;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getEmail() {
        return Email;
    }

    public String getCin() {
        return Cin;
    }

    

    public String getPassword() {
        return Password;
    }

    public String getSujet() {
        return Sujet;
    }

    public int getTelephone() {
        return Telephone;
    }

    public int getId_encadrant() {
        return Id_encadrant;
    }

    public String getImage() {
        return Image;
    }

    public void setID_doc(int ID) {
        this.ID = ID;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setCin(String Cin) {
        this.Cin = Cin;
    }

    

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setSujet(String Sujet) {
        this.Sujet = Sujet;
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
    }

    public void setId_encadrant(int Id_encadrant) {
        this.Id_encadrant = Id_encadrant;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }
    
}
