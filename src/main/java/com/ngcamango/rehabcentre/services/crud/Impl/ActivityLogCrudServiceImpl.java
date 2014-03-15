/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehabcentre.services.crud.Impl;

import com.ngcamango.rehabcentre.model.ActivityLog;
import com.ngcamango.rehabcentre.services.crud.ActivityLogCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ngcamango
 */
public class ActivityLogCrudServiceImpl implements ActivityLogCrudService{
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ActivityLog find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ActivityLog persist(ActivityLog entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ActivityLog merge(ActivityLog entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ActivityLog remove(ActivityLog entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ActivityLog> findAll() {
        return null;
    }
}
