/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehabcentre.services.crud.Impl;

import com.ngcamango.rehabcentre.model.Nurse;
import com.ngcamango.rehabcentre.services.crud.NurseCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ngcamango
 */
public class NurseCrudServiceImpl implements NurseCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Nurse find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Nurse persist(Nurse entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Nurse merge(Nurse entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Nurse remove(Nurse entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Nurse> findAll() {
        return null;
    }
}
