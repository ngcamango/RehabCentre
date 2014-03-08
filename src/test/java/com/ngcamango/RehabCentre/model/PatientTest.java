/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.RehabCentre.model;

import com.ngcamango.rehabcentre.model.Patient;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ngcamango
 */
public class PatientTest {
    
    public PatientTest() {
    }

    @BeforeMethod
    public void setUp() throws Exception {
        
    }
    
    @Test
    public void testPatient() throws Exception {
        Patient p = new Patient.Builder("Ngcamango").surname("Mayekiso").age(22).build();
        Assert.assertEquals(p.getName(),"Ngcamango");
        Assert.assertEquals(p.getSurname(),"Mayekiso");
        Assert.assertEquals(p.getAge(),22);
    }
    
    @Test
    public void testPatientUpdate() throws Exception {
        Patient p = new Patient.Builder("Floyd").surname("Mayweather").age(37).build();
        Assert.assertEquals(p.getName(),"Floyd");
        Assert.assertEquals(p.getSurname(),"Mayweather");
        Assert.assertEquals(p.getAge(),37);
    }
}
