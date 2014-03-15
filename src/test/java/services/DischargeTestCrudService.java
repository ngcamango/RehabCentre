/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.ngcamango.rehabcentre.model.Discharge;
import com.ngcamango.rehabcentre.services.crud.DischargeCrudService;
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
public class DischargeTestCrudService {
    
    public DischargeTestCrudService() {
    }

    @Mock
    DischargeCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DischargeCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Discharge p1 = new Discharge.Builder("Dimpho").surname("Khudunyane").build();
        Discharge returnDischarge = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnDischarge);
        Mockito.verify(crudService).persist(p1);
    }
    
    @Test
    public void testRead() throws Exception {
        Discharge p1 = new Discharge.Builder("Dimpho").surname("Khudunyane").build();
        Discharge returnDischarge = crudService.find(p1.getSurname());
        when(crudService.find(p1.getSurname())).thenReturn(returnDischarge);
        Mockito.verify(crudService).find(p1.getSurname());

    }

    @Test
    public void testUpdate() throws Exception {

        Discharge p1 = new Discharge.Builder("Dimpho").surname("Khudunyane").build();

        Discharge returnDischarge = crudService.merge(p1);
        when(crudService.merge(p1)).thenReturn(returnDischarge);
        Mockito.verify(crudService).merge(p1);

    }

    @Test
    public void testDelete() throws Exception {

        Discharge p1 = new Discharge.Builder("Dimpho").surname("Khudunyane").build();
        Discharge returnDischarge = crudService.remove(p1);
        when(crudService.remove(p1)).thenReturn(returnDischarge);
        Mockito.verify(crudService).remove(p1);

    }
}
