/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehabcentre.services.crud.Impl;

import com.ngcamango.rehabcentre.model.NextOfKin;
import com.ngcamango.rehabcentre.services.crud.NextOfKinCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ngcamango
 */
public class NextOfKinCrudServiceImpl implements NextOfKinCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public NextOfKin find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public NextOfKin persist(NextOfKin entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public NextOfKin merge(NextOfKin entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public NextOfKin remove(NextOfKin entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<NextOfKin> findAll() {
        return null;
    }
}
