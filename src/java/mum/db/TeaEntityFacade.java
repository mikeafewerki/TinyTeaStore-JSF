/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.db;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mum.model.TeaEntity;

/**
 *
 * @author 984986
 */
@Stateless
public class TeaEntityFacade extends AbstractFacade<TeaEntity> {

    @PersistenceContext(unitName = "TinyTeaStarterPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TeaEntityFacade() {
        super(TeaEntity.class);
    }
    
}
