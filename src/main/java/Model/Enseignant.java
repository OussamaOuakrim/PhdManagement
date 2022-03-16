/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author oouak
 */
public class Enseignant {
    
    public int ID ;
    public String Nom ;
    public String Prenom ;
    public String Email ;
    public String CIN ;
    public String Password ;
    public String Specialite ;
    public int Telephone ;
    public String departement ;
    public String Image ;

    public Enseignant(int ID, String Nom, String Prenom,String Email, String CIN,String Password, String Specialite, int Telephone, String departement, String Image) {
        this.ID = ID;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email = Email;
        this.CIN = CIN;
        this.Password = Password;
        this.Specialite = Specialite;
        this.Telephone = Telephone;
        this.departement = departement;
        this.Image = Image;
    }

    public int getID() {
        return ID;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getCIN() {
        return CIN;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getSpecialite() {
        return Specialite;
    }

    public int getTelephone() {
        return Telephone;
    }

    public String getDepartement() {
        return departement;
    }

    public String getImage() {
        return Image;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setSpecialite(String Specialite) {
        this.Specialite = Specialite;
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

  
    
}
