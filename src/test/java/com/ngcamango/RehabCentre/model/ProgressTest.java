/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.RehabCentre.model;

import com.ngcamango.rehabcentre.model.Progress;
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
public class ProgressTest {
    
    public ProgressTest() {
    }

    @BeforeMethod
    public void setUp() throws Exception {
        
    }
    
    @Test
    public void testProgress() throws Exception {
        Progress prog = new Progress.Builder("Ngcamango").surname("Mayekiso").age(22).diagnosis("Games").weeksLeft(2).progress("Good").build();
        Assert.assertEquals(prog.getName(),"Ngcamango");
        Assert.assertEquals(prog.getSurname(),"Mayekiso");
        Assert.assertEquals(prog.getAge(),22);
        Assert.assertEquals(prog.getDiagnosis(),"Games");
        Assert.assertEquals(prog.getWeeksLeft(),2);
        Assert.assertEquals(prog.getProgress(),"Good");
    }
    
    @Test
    public void testProgressUpdate() throws Exception {
        Progress prog = new Progress.Builder("Saida").surname("Vutula").age(22).diagnosis("Smoking").weeksLeft(3).progress("Excellent").build();
        Assert.assertEquals(prog.getName(),"Saida");
        Assert.assertEquals(prog.getSurname(),"Vutula");
        Assert.assertEquals(prog.getAge(),22);
        Assert.assertEquals(prog.getDiagnosis(),"Smoking");
        Assert.assertEquals(prog.getWeeksLeft(),3);
        Assert.assertEquals(prog.getProgress(),"Excellent");
    }
}
