/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author sabrine
 */
@Entity
public class Consommation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int mois ;
    private int annee;
    private Double difference ;
    private String type ;
    private int ancienIndex ;
    private int nvIndex ;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ancienDate ;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date nvDate ;
    
    
    @ManyToOne
    private Client client ;
    
    @ManyToOne
     private TrancheEau trancheEau;
    
    @ManyToOne
    private TrancheElectricite trancheElectricite;
    @ManyToOne
    private FactureEau factureEau;
    @ManyToOne
    private FactureElectricite factureElectricite;
    @ManyToOne
    private PaiementItem paiementItem ;

    public Consommation() {
    }

    public Consommation(Long id) {
        this.id = id;
    }
    

    public FactureEau getFactureEau() {
        return factureEau;
    }

    public void setFactureEau(FactureEau factureEau) {
        this.factureEau = factureEau;
    }

    public FactureElectricite getFactureElectricite() {
        return factureElectricite;
    }

    public void setFactureElectricite(FactureElectricite factureElectricite) {
        this.factureElectricite = factureElectricite;
    }

    public Date getAncienDate() {
        return ancienDate;
    }

    public void setAncienDate(Date ancienDate) {
        this.ancienDate = ancienDate;
    }

    public Date getNvDate() {
        return nvDate;
    }

    public void setNvDate(Date nvDate) {
        this.nvDate = nvDate;
    }



    public TrancheEau getTrancheEau() {
        return trancheEau;
    }

    public void setTrancheEau(TrancheEau trancheEau) {
        this.trancheEau = trancheEau;
    }

    public TrancheElectricite getTrancheElectricite() {
        return trancheElectricite;
    }

    public void setTrancheElectricite(TrancheElectricite trancheElectricite) {
        this.trancheElectricite = trancheElectricite;
    }

    public Consommation(Long id, int mois, int annee, Double difference, String type, int ancienIndex, int nvIndex, Date ancienDate, Date nvDate) {
        this.id = id;
        this.mois = mois;
        this.annee = annee;
        this.difference = difference;
        this.type = type;
        this.ancienIndex = ancienIndex;
        this.nvIndex = nvIndex;
        this.ancienDate = ancienDate;
        this.nvDate = nvDate;
    }
 
 
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }


    public PaiementItem getPaiementItem() {
        return paiementItem;
    }

    public void setPaiementItem(PaiementItem paiementItem) {
        this.paiementItem = paiementItem;
    }

    public Double getDifference() {
        return difference;
    }

    public void setDifference(Double difference) {
        this.difference = difference;
    }

    public int getAncienIndex() {
        return ancienIndex;
    }

    public void setAncienIndex(int ancienIndex) {
        this.ancienIndex = ancienIndex;
    }

    public int getNvIndex() {
        return nvIndex;
    }

    public void setNvIndex(int nvIndex) {
        this.nvIndex = nvIndex;
    }
    
   

 



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
        if (!(object instanceof Consommation)) {
            return false;
        }
        Consommation other = (Consommation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Consommation{" + "id=" + id + ", mois=" + mois + ", annee=" + annee + ", difference=" + difference + ", type=" + type + ", ancienIndex=" + ancienIndex + ", nvIndex=" + nvIndex + ", ancienDate=" + ancienDate + ", nvDate=" + nvDate + '}';
    }

 
 

}
