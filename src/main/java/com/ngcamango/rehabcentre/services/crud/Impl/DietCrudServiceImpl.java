/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehabcentre.services.crud.Impl;

import com.ngcamango.rehabcentre.model.Diet;
import com.ngcamango.rehabcentre.services.crud.DietCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ngcamango
 */
public class DietCrudServiceImpl implements DietCrudService{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Diet find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Diet persist(Diet entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Diet merge(Diet entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Diet remove(Diet entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Diet> findAll() {
        return null;
    }
}
