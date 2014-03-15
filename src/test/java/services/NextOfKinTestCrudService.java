/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.ngcamango.rehabcentre.model.NextOfKin;
import com.ngcamango.rehabcentre.services.crud.NextOfKinCrudService;
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
public class NextOfKinTestCrudService {
    
    public NextOfKinTestCrudService() {
    }

    @Mock
    NextOfKinCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(NextOfKinCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        NextOfKin p1 = new NextOfKin.Builder("Alianna").surname("Khudunyane").build();
        NextOfKin returnNextOfKin = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnNextOfKin);
        Mockito.verify(crudService).persist(p1);
    }
    
    @Test
    public void testRead() throws Exception {
        NextOfKin p1 = new NextOfKin.Builder("Alianna").surname("Khudunyane").build();
        NextOfKin returnNextOfKin = crudService.find(p1.getSurname());
        when(crudService.find(p1.getSurname())).thenReturn(returnNextOfKin);
        Mockito.verify(crudService).find(p1.getSurname());

    }

    @Test
    public void testUpdate() throws Exception {

        NextOfKin p1 = new NextOfKin.Builder("Alianna").surname("Khudunyane").build();

        NextOfKin returnNextOfKin = crudService.merge(p1);
        when(crudService.merge(p1)).thenReturn(returnNextOfKin);
        Mockito.verify(crudService).merge(p1);

    }

    @Test
    public void testDelete() throws Exception {

        NextOfKin p1 = new NextOfKin.Builder("Alianna").surname("Khudunyane").build();
        NextOfKin returnNextOfKin = crudService.remove(p1);
        when(crudService.remove(p1)).thenReturn(returnNextOfKin);
        Mockito.verify(crudService).remove(p1);

    }
}
