/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.RehabCentre.model;

import com.ngcamango.rehabcentre.model.Department;
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
public class DepartmentTest {
    
    public DepartmentTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }
    
    @Test
    public void testDepartment() throws Exception{
        Department dept = new Department.Builder(0201).name("D-O-D").description("Drug addicts").wards(5).build();
        Assert.assertEquals(dept.getId(),0201);
        Assert.assertEquals(dept.getName(),"D-O-D");
        Assert.assertEquals(dept.getDescription(),"Drug addicts");
        Assert.assertEquals(dept.getWards(),5);
    }
    
    @Test
    public void testDepartmentUpdate() throws Exception{
        Department dept = new Department.Builder(0241).name("D-O-VG").description("Video game addicts").wards(4).build();
        Assert.assertEquals(dept.getId(),0241);
        Assert.assertEquals(dept.getName(),"D-O-VG");
        Assert.assertEquals(dept.getDescription(),"Video game addicts");
        Assert.assertEquals(dept.getWards(),4);
    }
}
