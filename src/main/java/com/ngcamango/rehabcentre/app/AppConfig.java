/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehabcentre.app;

import com.ngcamango.rehabcentre.services.crud.Impl.PatientCrudServiceImpl;
import com.ngcamango.rehabcentre.services.crud.PatientCrudService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author ngcamango
 */
@Configurable
public class AppConfig {
    
    @Bean(name = "patientCrudService")
    public  PatientCrudService getPatientCrudService(){
        return new PatientCrudServiceImpl();
    }
}
