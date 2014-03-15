/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehabcentre.services.crud.Impl;

import com.ngcamango.rehabcentre.model.Registration;
import com.ngcamango.rehabcentre.model.Treatment;
import com.ngcamango.rehabcentre.services.crud.TreatmentCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ngcamango
 */
public class TreatmentCrudServiceImpl implements TreatmentCrudService{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Treatment find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Treatment persist(Treatment entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Treatment merge(Treatment entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Treatment remove(Treatment entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Treatment> findAll() {
        return null;
    }
}
