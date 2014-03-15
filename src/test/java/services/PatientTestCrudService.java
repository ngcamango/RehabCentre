/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.ngcamango.rehabcentre.model.Patient;
import com.ngcamango.rehabcentre.services.crud.PatientCrudService;
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
public class PatientTestCrudService {
    
    public PatientTestCrudService() {
    }
    @Mock
    PatientCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(PatientCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Patient p1 = new Patient.Builder("Ngcamango").surname("Mayekiso").build();
        Patient returnPatient = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnPatient);
        Mockito.verify(crudService).persist(p1);
    }
    
    @Test
    public void testRead() throws Exception {
        Patient p1 = new Patient.Builder("Ngcamango").surname("Mayekiso").build();
        Patient returnPatient = crudService.find(p1.getSurname());
        when(crudService.find(p1.getSurname())).thenReturn(returnPatient);
        Mockito.verify(crudService).find(p1.getSurname());

    }

    @Test
    public void testUpdate() throws Exception {

        Patient p1 = new Patient.Builder("Ngcamango").surname("Mayekiso").build();

        Patient returnPatient = crudService.merge(p1);
        when(crudService.merge(p1)).thenReturn(returnPatient);
        Mockito.verify(crudService).merge(p1);

    }

    @Test
    public void testDelete() throws Exception {

        Patient p1 = new Patient.Builder("Ngcamango").surname("Mayekiso").build();
        Patient returnPatient = crudService.remove(p1);
        when(crudService.remove(p1)).thenReturn(returnPatient);
        Mockito.verify(crudService).remove(p1);

    }
}
