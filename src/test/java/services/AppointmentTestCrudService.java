/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.ngcamango.rehabcentre.model.Appointment;
import com.ngcamango.rehabcentre.services.crud.AppointmentCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class AppointmentTestCrudService {
    
    public AppointmentTestCrudService() {
    }

    @Mock
    AppointmentCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AppointmentCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Appointment p1 = new Appointment.Builder("Alianna").surname("Khudunyane").build();
        Appointment returnAppointment = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnAppointment);
        Mockito.verify(crudService).persist(p1);
    }
    
    @Test
    public void testRead() throws Exception {
        Appointment p1 = new Appointment.Builder("Alianna").surname("Khudunyane").build();
        Appointment returnAppointment = crudService.find(p1.getSurname());
        when(crudService.find(p1.getSurname())).thenReturn(returnAppointment);
        Mockito.verify(crudService).find(p1.getSurname());

    }

    @Test
    public void testUpdate() throws Exception {

        Appointment p1 = new Appointment.Builder("Alianna").surname("Khudunyane").build();

        Appointment returnAppointment = crudService.merge(p1);
        when(crudService.merge(p1)).thenReturn(returnAppointment);
        Mockito.verify(crudService).merge(p1);

    }

    @Test
    public void testDelete() throws Exception {

        Appointment p1 = new Appointment.Builder("Alianna").surname("Khudunyane").build();
        Appointment returnAppointment = crudService.remove(p1);
        when(crudService.remove(p1)).thenReturn(returnAppointment);
        Mockito.verify(crudService).remove(p1);

    }
}
