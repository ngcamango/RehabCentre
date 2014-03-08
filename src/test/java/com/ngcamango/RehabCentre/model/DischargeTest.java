/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.RehabCentre.model;

import com.ngcamango.rehabcentre.model.Discharge;
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
public class DischargeTest {
    
    public DischargeTest() {
    }
    
    @BeforeMethod
    public void setUp() throws Exception {
        
    }
    
    @Test
    public void testDischarge() throws Exception{
        Discharge d = new Discharge.Builder("Ngcamango").surname("Mayekiso").age(22).diagnosis("Games").weeks(4).build();
        Assert.assertEquals(d.getName(),"Ngcamango");
        Assert.assertEquals(d.getSurname(),"Mayekiso");
        Assert.assertEquals(d.getAge(),22);
        Assert.assertEquals(d.getDiagnosis(),"Games");
        Assert.assertEquals(d.getWeeks(),4);
    }
    
    @Test
    public void testDischargeUpdate() throws Exception{
        Discharge d = new Discharge.Builder("Saida").surname("Vutula").age(22).diagnosis("Smoking").weeks(6).build();
        Assert.assertEquals(d.getName(),"Saida");
        Assert.assertEquals(d.getSurname(),"Vutula");
        Assert.assertEquals(d.getAge(),22);
        Assert.assertEquals(d.getDiagnosis(),"Smoking");
        Assert.assertEquals(d.getWeeks(),6);
    }
}
