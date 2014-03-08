/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.RehabCentre.model;

import com.ngcamango.rehabcentre.model.Nurse;
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
public class NurseTest {
    
    public NurseTest() {
    }

    @BeforeMethod
    public void setUp() throws Exception {
    
    }
    
    @Test
    public void testNurse() throws Exception{
        Nurse n = new Nurse.Builder(45.00).name("Veronica").build();
        Assert.assertEquals(n.getHoursWorked(),45.00);
        Assert.assertEquals(n.getName(),"Veronica");
        Assert.assertEquals(n.getSalary(),11281.05);
    }
    
    @Test
    public void testNurseUpdate() throws Exception{
        Nurse n = new Nurse.Builder(36.00).name("Valencia").build();
        Assert.assertEquals(n.getHoursWorked(),36.00);
        Assert.assertEquals(n.getName(),"Valencia");
        Assert.assertEquals(n.getSalary(),9024.84);
    }
}
