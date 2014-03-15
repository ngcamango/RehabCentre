/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.ngcamango.rehabcentre.model.Diet;
import com.ngcamango.rehabcentre.services.crud.DietCrudService;
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
public class DietTestCrudService {
    
    public DietTestCrudService() {
    }

    @Mock
    DietCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DietCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Diet p1 = new Diet.Builder("Dimpho").surname("Khudunyane").build();
        Diet returnDiet = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnDiet);
        Mockito.verify(crudService).persist(p1);
    }
    
    @Test
    public void testRead() throws Exception {
        Diet p1 = new Diet.Builder("Dimpho").surname("Khudunyane").build();
        Diet returnDiet = crudService.find(p1.getSurname());
        when(crudService.find(p1.getSurname())).thenReturn(returnDiet);
        Mockito.verify(crudService).find(p1.getSurname());

    }

    @Test
    public void testUpdate() throws Exception {

        Diet p1 = new Diet.Builder("Dimpho").surname("Khudunyane").build();

        Diet returnDiet = crudService.merge(p1);
        when(crudService.merge(p1)).thenReturn(returnDiet);
        Mockito.verify(crudService).merge(p1);

    }

    @Test
    public void testDelete() throws Exception {

        Diet p1 = new Diet.Builder("Dimpho").surname("Khudunyane").build();
        Diet returnDiet = crudService.remove(p1);
        when(crudService.remove(p1)).thenReturn(returnDiet);
        Mockito.verify(crudService).remove(p1);

    }
}
