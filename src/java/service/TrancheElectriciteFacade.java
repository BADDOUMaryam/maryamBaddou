/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TrancheElectricite;
import bean.TrancheElectriciteItem;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER
 */
@Stateless
public class TrancheElectriciteFacade extends AbstractFacade<TrancheElectricite> {
    @PersistenceContext(unitName = "meryPU")
    private EntityManager em;
public List<TrancheElectriciteItem> findByTranche(TrancheElectricite trancheElectricite){
        return em.createQuery("SELECT tr FROM TrancheElectriciteItem tr WHERE tr.trancheElectricite.id='"+trancheElectricite.getId()+"'").getResultList();
        
    }
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TrancheElectriciteFacade() {
        super(TrancheElectricite.class);
    }
    
}
