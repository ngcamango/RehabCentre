/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.RehabCentre.model;

import com.ngcamango.rehabcentre.model.Assessment;
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
public class AssessmentTest {
    
    public AssessmentTest() {
    }

    @BeforeMethod
    public void setUp() throws Exception {
    }

    @Test
    public void testAssessment() throws Exception{
        Assessment ass = new Assessment.Builder("Ngcamango").surname("Mayekiso").age(22).diagnosis("Games").weeksAssessed(2).progress("Good").build();
        Assert.assertEquals(ass.getName(),"Ngcamango");
        Assert.assertEquals(ass.getSurname(),"Mayekiso");
        Assert.assertEquals(ass.getAge(),22);
        Assert.assertEquals(ass.getDiagnosis(),"Games");
        Assert.assertEquals(ass.getWeeksAssessed(),2);
        Assert.assertEquals(ass.getProgress(),"Good");
    }
    
    @Test
    public void testAssessmentUpdate() throws Exception{
        Assessment ass = new Assessment.Builder("Saida").surname("Vutula").age(22).diagnosis("Smoking").weeksAssessed(3).progress("Excellent").build();
        Assert.assertEquals(ass.getName(),"Saida");
        Assert.assertEquals(ass.getSurname(),"Vutula");
        Assert.assertEquals(ass.getAge(),22);
        Assert.assertEquals(ass.getDiagnosis(),"Smoking");
        Assert.assertEquals(ass.getWeeksAssessed(),3);
        Assert.assertEquals(ass.getProgress(),"Excellent");
    }
}
