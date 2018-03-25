/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author sabrine
 */
@Entity
public class TrancheEau implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private  Date dateTranche;
    @OneToMany(mappedBy = "trancheEau")
    private List<TrancheEauItem> trancheEauItems;
    @OneToMany(mappedBy = "trancheEau")
    private List<Consommation> consommations;
    @OneToMany(mappedBy = "trancheEau")
    private List<Paiement> paiements;
    @OneToMany(mappedBy = "trancheEau")
    private List<FactureEau> factureEaus;

    public TrancheEau() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateTranche() {
        return dateTranche;
    }

    public void setDateTranche(Date dateTranche) {
        this.dateTranche = dateTranche;
    }

    public List<TrancheEauItem> getTrancheEauItems() {
        return trancheEauItems;
    }

    public void setTrancheEauItems(List<TrancheEauItem> trancheEauItems) {
        this.trancheEauItems = trancheEauItems;
    }

    public List<Consommation> getConsommations() {
        return consommations;
    }

    public void setConsommations(List<Consommation> consommations) {
        this.consommations = consommations;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TrancheEau other = (TrancheEau) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrancheEau{" + "id=" + id + ", dateTranche=" + dateTranche + '}';
    }

   
   

    
   

   
    
}
