/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.ngcamango.rehabcentre.model.Admission;
import com.ngcamango.rehabcentre.services.crud.AdmissionCrudService;
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
public class AdmissionTestCrudService {
    
    public AdmissionTestCrudService() {
    }

    @Mock
    AdmissionCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AdmissionCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Admission p1 = new Admission.Builder("Dimpho").surname("Khudunyane").build();
        Admission returnAdmission = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnAdmission);
        Mockito.verify(crudService).persist(p1);
    }
    
    @Test
    public void testRead() throws Exception {
        Admission p1 = new Admission.Builder("Dimpho").surname("Khudunyane").build();
        Admission returnAdmission = crudService.find(p1.getSurname());
        when(crudService.find(p1.getSurname())).thenReturn(returnAdmission);
        Mockito.verify(crudService).find(p1.getSurname());

    }

    @Test
    public void testUpdate() throws Exception {

        Admission p1 = new Admission.Builder("Dimpho").surname("Khudunyane").build();

        Admission returnAdmission = crudService.merge(p1);
        when(crudService.merge(p1)).thenReturn(returnAdmission);
        Mockito.verify(crudService).merge(p1);

    }

    @Test
    public void testDelete() throws Exception {

        Admission p1 = new Admission.Builder("Dimpho").surname("Khudunyane").build();
        Admission returnAdmission = crudService.remove(p1);
        when(crudService.remove(p1)).thenReturn(returnAdmission);
        Mockito.verify(crudService).remove(p1);

    }
}
