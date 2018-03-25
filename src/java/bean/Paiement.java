/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author sabrine
 */
@Entity
public class Paiement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double montantHt;
    private Double montantTtc ;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePaiement;
    private int objet ;//eau /electricite
    private int type ;//exact /estimer
    @ManyToOne
    private Client client ;
    @ManyToOne
     private FactureEau factureEau;
    @ManyToOne
    private FactureElectricite factureElectricite ;
    @ManyToOne
    private TrancheEau trancheEau;
    @ManyToOne
    private TrancheElectricite trancheElectricite;
    @OneToMany(mappedBy = "paiement")
    private List<Avertissemnt> avertissemnts;
    
    
    
    public Paiement() {
    }

    public Paiement(Long id) {
        this.id = id;
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


  

    public Client getClient() {
        return client;
    }

    public Double getMontantHt() {
        return montantHt;
    }

    public void setMontantHt(Double montantHt) {
        this.montantHt = montantHt;
    }

    public Double getMontantTtc() {
        return montantTtc;
    }

    public void setMontantTtc(Double montantTtc) {
        this.montantTtc = montantTtc;
    }

    public int getObjet() {
        return objet;
    }

    public void setObjet(int objet) {
        this.objet = objet;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    public List<Avertissemnt> getAvertissemnts() {
        return avertissemnts;
    }

    public void setAvertissemnts(List<Avertissemnt> avertissemnts) {
        this.avertissemnts = avertissemnts;
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
    
    

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }
    

    public Paiement(Long id, Date datePaiement) {
        this.id = id;
        this.datePaiement = datePaiement;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Paiement)) {
            return false;
        }
        Paiement other = (Paiement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paiement{" + "id=" + id + ", montantHt=" + montantHt + ", montantTtc=" + montantTtc + ", datePaiement=" + datePaiement + ", objet=" + objet + ", type=" + type + '}';
    }

}
