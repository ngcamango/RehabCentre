/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.RehabCentre.model;

import com.ngcamango.rehabcentre.model.NextOfKin;
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
public class NextOfKinTest {
    
    public NextOfKinTest() {
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
    public void testNextOfKin() throws Exception{
        NextOfKin nok = new NextOfKin.Builder("Mary").age(26).relationship("Sister").build();
        Assert.assertEquals(nok.getName(),"Mary");
        Assert.assertEquals(nok.getAge(),26);
        Assert.assertEquals(nok.getRelationship(),"Sister");
    }
    
    @Test
    public void testNextOfKinUpdate() throws Exception{
        NextOfKin nok = new NextOfKin.Builder("Aliana").age(38).relationship("Mother").build();
        Assert.assertEquals(nok.getName(),"Aliana");
        Assert.assertEquals(nok.getAge(),38);
        Assert.assertEquals(nok.getRelationship(),"Mother");
    }
}
