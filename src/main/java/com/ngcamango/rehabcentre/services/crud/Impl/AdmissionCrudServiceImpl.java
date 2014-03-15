/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehabcentre.services.crud.Impl;

import com.ngcamango.rehabcentre.model.ActivityLog;
import com.ngcamango.rehabcentre.model.Admission;
import com.ngcamango.rehabcentre.services.crud.AdmissionCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ngcamango
 */
public class AdmissionCrudServiceImpl implements AdmissionCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Admission find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Admission persist(Admission entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Admission merge(Admission entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Admission remove(Admission entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Admission> findAll() {
        return null;
    }
}
