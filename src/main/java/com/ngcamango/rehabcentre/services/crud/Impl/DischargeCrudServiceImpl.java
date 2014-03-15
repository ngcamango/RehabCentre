/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehabcentre.services.crud.Impl;

import com.ngcamango.rehabcentre.model.Discharge;
import com.ngcamango.rehabcentre.services.crud.DischargeCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ngcamango
 */
public class DischargeCrudServiceImpl implements DischargeCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Discharge find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Discharge persist(Discharge entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Discharge merge(Discharge entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Discharge remove(Discharge entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Discharge> findAll() {
        return null;
    }
}
