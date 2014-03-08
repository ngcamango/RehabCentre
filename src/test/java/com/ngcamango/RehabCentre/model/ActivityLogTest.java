/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.RehabCentre.model;

import com.ngcamango.rehabcentre.model.ActivityLog;
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
public class ActivityLogTest {
    
    public ActivityLogTest() {
    }
    
    @BeforeMethod
    public void setUp() throws Exception {
        
    }
    
    @Test
    public void testActivityLog() {
        ActivityLog alog = new ActivityLog.Builder("Ngcamango").surname("Mayekiso").age(22).diagnosis("Games").activity("Chess").build();
        Assert.assertEquals(alog.getName(),"Ngcamango");
        Assert.assertEquals(alog.getSurname(),"Mayekiso");
        Assert.assertEquals(alog.getAge(),22);
        Assert.assertEquals(alog.getDiagnosis(),"Games");
        Assert.assertEquals(alog.getActivity(),"Chess");
    }
    
    @Test
    public void testActivityLogUpdate() {
        ActivityLog alog = new ActivityLog.Builder("Saida").surname("Vutula").age(22).diagnosis("Smoking").activity("Jogging").build();
        Assert.assertEquals(alog.getName(),"Saida");
        Assert.assertEquals(alog.getSurname(),"Vutula");
        Assert.assertEquals(alog.getAge(),22);
        Assert.assertEquals(alog.getDiagnosis(),"Smoking");
        Assert.assertEquals(alog.getActivity(),"Jogging");
    }
}
