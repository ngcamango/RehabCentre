/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.RehabCentre.model;

import com.ngcamango.rehabcentre.model.Appointment;
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
public class AppointmentTest {
    
    public AppointmentTest() {
    }

    @BeforeMethod
    public void setUp() throws Exception {
        
    }

    @Test
    public void testAppointment() throws Exception{
        Appointment app = new Appointment.Builder("Anthony").surname("Mundine").age(25).relationship("Friend").hours(2).build();
        Assert.assertEquals(app.getName(),"Anthony");
        Assert.assertEquals(app.getSurname(),"Mundine");
        Assert.assertEquals(app.getAge(),25);
        Assert.assertEquals(app.getRelationship(),"Friend");
        Assert.assertEquals(app.getHours(),2);
    }
    
    @Test
    public void testAppointmentUpdate() throws Exception{
        Appointment app = new Appointment.Builder("Dinamita").surname("Alvarez").age(25).relationship("Friend").hours(2).build();
        Assert.assertEquals(app.getName(),"Dinamita");
        Assert.assertEquals(app.getSurname(),"Alvarez");
        Assert.assertEquals(app.getAge(),25);
        Assert.assertEquals(app.getRelationship(),"Friend");
        Assert.assertEquals(app.getHours(),2);
    }
}
