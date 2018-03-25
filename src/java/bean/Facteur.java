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
import javax.persistence.OneToMany;

/**
 *
 * @author sabrine
 */
@Entity
public class Facteur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private Long tel;
    private String adress ;
    private String type ;
    @OneToMany(mappedBy = "facteur")
    private List<Rue> rues;
  

    public Facteur() {
    }

    public Facteur(String id) {
        this.id = id;
    }

    public Facteur(String id, Long tel, String adress, String type) {
        this.id = id;
        this.tel = tel;
        this.adress = adress;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Rue> getRues() {
        return rues;
    }

    public void setRues(List<Rue> rues) {
        this.rues = rues;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
        if (!(object instanceof Facteur)) {
            return false;
        }
        Facteur other = (Facteur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Technicien{" + "id=" + id + ", tel=" + tel + ", adress=" + adress + ", type=" + type + '}';
    }

 

    
}
