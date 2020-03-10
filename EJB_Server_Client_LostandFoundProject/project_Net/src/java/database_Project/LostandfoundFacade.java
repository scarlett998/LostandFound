/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_Project;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author suxia
 */
@Stateless
public class LostandfoundFacade extends AbstractFacade<Lostandfound> implements LostandfoundFacadeLocal {

    @PersistenceContext(unitName = "project_NetPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LostandfoundFacade() {
        super(Lostandfound.class);
    }
    
}
