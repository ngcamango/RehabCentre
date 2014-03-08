/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.RehabCentre.model;

import com.ngcamango.rehabcentre.model.Treatment;
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
public class TreatmentTest {
    
    public TreatmentTest() {
    }

    @BeforeMethod
    public void setUp() throws Exception {
        
    }
    
    @Test
    public void testTreatment() throws Exception{
        Treatment t = new Treatment.Builder("Ngcamango").surname("Mayekiso").age(22).diagnosis("Games").treatment("none").build();
        Assert.assertEquals(t.getName(),"Ngcamango");
        Assert.assertEquals(t.getSurname(),"Mayekiso");
        Assert.assertEquals(t.getAge(),22);
        Assert.assertEquals(t.getDiagnosis(),"Games");
        Assert.assertEquals(t.getTreatment(),"none");
    }
    
    @Test
    public void testTreatmentUpdate() throws Exception{
        Treatment t = new Treatment.Builder("Saida").surname("Vutula").age(22).diagnosis("Smoking").treatment("antibiotics").build();
        Assert.assertEquals(t.getName(),"Saida");
        Assert.assertEquals(t.getSurname(),"Vutula");
        Assert.assertEquals(t.getAge(),22);
        Assert.assertEquals(t.getDiagnosis(),"Smoking");
        Assert.assertEquals(t.getTreatment(),"antibiotics");
    }
}
