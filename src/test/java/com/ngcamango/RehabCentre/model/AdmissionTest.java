/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.RehabCentre.model;

import com.ngcamango.rehabcentre.model.Admission;
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
public class AdmissionTest {
    
    public AdmissionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeMethod
    public void setUp() throws Exception {
        
    }
    
    @Test
    public void testAdmission() {
        Admission a = new Admission.Builder("Ngcamango").surname("Mayekiso").age(22).diagnosis("Games").weeks(4).build();
        Assert.assertEquals(a.getName(),"Ngcamango");
        Assert.assertEquals(a.getSurname(),"Mayekiso");
        Assert.assertEquals(a.getAge(),22);
        Assert.assertEquals(a.getDiagnosis(),"Games");
        Assert.assertEquals(a.getFee(),780.00);
    }
    
    @Test
    public void testAdmissionUpdate() {
        Admission a = new Admission.Builder("Saida").surname("Vutula").age(22).diagnosis("Smoking").weeks(6).build();
        Assert.assertEquals(a.getName(),"Saida");
        Assert.assertEquals(a.getSurname(),"Vutula");
        Assert.assertEquals(a.getAge(),22);
        Assert.assertEquals(a.getDiagnosis(),"Smoking");
        Assert.assertEquals(a.getFee(),1170.00);
    }
}
