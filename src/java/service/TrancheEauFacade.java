/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TrancheEau;
import bean.TrancheEauItem;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER
 */
@Stateless
public class TrancheEauFacade extends AbstractFacade<TrancheEau> {
    @PersistenceContext(unitName = "meryPU")
    private EntityManager em;
    
    public List<TrancheEauItem> findByTranche(TrancheEau trancheEau){
        return em.createQuery("SELECT tr FROM TrancheEauItem tr WHERE tr.trancheEau.id='"+trancheEau.getId()+"'").getResultList();
        
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TrancheEauFacade() {
        super(TrancheEau.class);
    }
    
}
