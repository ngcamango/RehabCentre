/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.ngcamango.rehabcentre.model.Nurse;
import com.ngcamango.rehabcentre.services.crud.NurseCrudService;
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
public class NurseTestCrudService {
    
    public NurseTestCrudService() {
    }

    @Mock
    NurseCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(NurseCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Nurse p1 = new Nurse.Builder(45.00).surname("Lobase").build();
        Nurse returnNurse = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnNurse);
        Mockito.verify(crudService).persist(p1);
    }
    
    @Test
    public void testRead() throws Exception {
        Nurse p1 = new Nurse.Builder(45.00).surname("Lobase").build();
        Nurse returnNurse = crudService.find(p1.getSurname());
        when(crudService.find(p1.getSurname())).thenReturn(returnNurse);
        Mockito.verify(crudService).find(p1.getSurname());

    }

    @Test
    public void testUpdate() throws Exception {

        Nurse p1 = new Nurse.Builder(45.00).surname("Lobase").build();

        Nurse returnNurse = crudService.merge(p1);
        when(crudService.merge(p1)).thenReturn(returnNurse);
        Mockito.verify(crudService).merge(p1);

    }

    @Test
    public void testDelete() throws Exception {

        Nurse p1 = new Nurse.Builder(45.00).surname("Lobase").build();
        Nurse returnNurse = crudService.remove(p1);
        when(crudService.remove(p1)).thenReturn(returnNurse);
        Mockito.verify(crudService).remove(p1);

    }
    
    
}
