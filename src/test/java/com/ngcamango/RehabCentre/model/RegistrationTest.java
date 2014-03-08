/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.RehabCentre.model;

import com.ngcamango.rehabcentre.model.Registration;
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
public class RegistrationTest {
    
    public RegistrationTest() {
    }

    @BeforeMethod
    public void setUp() throws Exception {
    }

    @Test
    public void testRegistration() throws Exception{
        Registration p = new Registration.Builder("Ngcamango").surname("Mayekiso").age(22).diagnosis("Games").build();
        Assert.assertEquals(p.getName(),"Ngcamango");
        Assert.assertEquals(p.getSurname(),"Mayekiso");
        Assert.assertEquals(p.getAge(),22);
        Assert.assertEquals(p.getDiagnosis(),"Games");
    }
    
    @Test
    public void testRegistrationUpdate() throws Exception{
        Registration p = new Registration.Builder("Saida").surname("Vutula").age(22).diagnosis("Smoking").build();
        Assert.assertEquals(p.getName(),"Saida");
        Assert.assertEquals(p.getSurname(),"Vutula");
        Assert.assertEquals(p.getAge(),22);
        Assert.assertEquals(p.getDiagnosis(),"Smoking");
    }
}
