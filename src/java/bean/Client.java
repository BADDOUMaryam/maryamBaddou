/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author sabrine
 */
@Entity
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String nom;
    private String type ;
    private String prenom;
    private String adresse;
    private String passWord;
    private String cin;
    private Double numCompteur;
    private Double numContrat;
    private String genre;

    @OneToMany(mappedBy = "client")
    private List<Reclamation> reclamations;
    @OneToMany(mappedBy = "client")
    private List<Consommation> consommations;
    @OneToMany(mappedBy = "client")
    private List<FactureEau> factureEaus;
    @OneToMany(mappedBy = "client")
    private List<Paiement> paiements;
    @OneToMany(mappedBy = "client")
    private List<FactureElectricite> factureElectricites;
    @OneToMany(mappedBy = "client")
    private List<Avertissemnt> avertissemnts;
    @ManyToOne
    private Admine admin;
    @ManyToOne
    private Agence agence ;

    public Client() {
    }

    public Client(String id) {
        this.id = id;
    }

    public Client(String id, String nom, String type, String prenom, String adresse, String passWord, String cin, Double numCompteur, Double numContrat, String genre) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.prenom = prenom;
        this.adresse = adresse;
        this.passWord = passWord;
        this.cin = cin;
        this.numCompteur = numCompteur;
        this.numContrat = numContrat;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }
  

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Admine getAdmin() {
        return admin;
    }

    public void setAdmin(Admine admin) {
        this.admin = admin;
    }

    public Double getNumContrat() {
        return numContrat;
    }

    public void setNumContrat(Double numContrat) {
        this.numContrat = numContrat;
    }

    public List<Avertissemnt> getAvertissemnts() {
        return avertissemnts;
    }

    public void setAvertissemnts(List<Avertissemnt> avertissemnts) {
        this.avertissemnts = avertissemnts;
    }

    public Double getNumCompteur() {
        return numCompteur;
    }

    public void setNumCompteur(Double numCompteur) {
        this.numCompteur = numCompteur;
    }

    public List<Reclamation> getReclamations() {
        return reclamations;
    }

    public void setReclamations(List<Reclamation> reclamations) {
        this.reclamations = reclamations;
    }

    public List<Consommation> getConsommations() {
        return consommations;
    }

    public void setConsommations(List<Consommation> consommations) {
        this.consommations = consommations;
    }

    public List<FactureEau> getFactureEaus() {
        return factureEaus;
    }

    public void setFactureEaus(List<FactureEau> factureEaus) {
        this.factureEaus = factureEaus;
    }

    public List<FactureElectricite> getFactureElectricites() {
        return factureElectricites;
    }

    public void setFactureElectricites(List<FactureElectricite> factureElectricites) {
        this.factureElectricites = factureElectricites;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", type=" + type + ", prenom=" + prenom + ", adresse=" + adresse + ", passWord=" + passWord + ", cin=" + cin + ", numCompteur=" + numCompteur + ", numContrat=" + numContrat + ", genre=" + genre + '}';
    }

  

}
