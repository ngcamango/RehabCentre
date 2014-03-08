/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.RehabCentre.model;

import com.ngcamango.rehabcentre.model.Diet;
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
public class DietTest {
    
    public DietTest() {
        
    }

    @BeforeMethod
    public void setUp() throws Exception {
    }

    @Test
    public void testDiet() throws Exception{
        Diet diet = new Diet.Builder("Ngcamango").surname("Mayekiso").age(22).diagnosis("Games").foodType("Sea Food").build();
        Assert.assertEquals(diet.getName(),"Ngcamango");
        Assert.assertEquals(diet.getSurname(),"Mayekiso");
        Assert.assertEquals(diet.getAge(),22);
        Assert.assertEquals(diet.getDiagnosis(),"Games");
        Assert.assertEquals(diet.getFoodType(),"Sea Food");
    }
    
    @Test
    public void testDietUpdate() throws Exception{
        Diet diet = new Diet.Builder("Saida").surname("Vutula").age(22).diagnosis("Smoking").foodType("Carbs and Proteins").build();
        Assert.assertEquals(diet.getName(),"Saida");
        Assert.assertEquals(diet.getSurname(),"Vutula");
        Assert.assertEquals(diet.getAge(),22);
        Assert.assertEquals(diet.getDiagnosis(),"Smoking");
        Assert.assertEquals(diet.getFoodType(),"Carbs and Proteins");
    }
}
