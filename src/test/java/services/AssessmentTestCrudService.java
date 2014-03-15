/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.ngcamango.rehabcentre.model.Assessment;
import com.ngcamango.rehabcentre.services.crud.AssessmentCrudService;
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
public class AssessmentTestCrudService {
    
    public AssessmentTestCrudService() {
    }

    @Mock
    AssessmentCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AssessmentCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Assessment p1 = new Assessment.Builder("Dimpho").surname("Khudunyane").build();
        Assessment returnAssessment = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnAssessment);
        Mockito.verify(crudService).persist(p1);
    }
    
    @Test
    public void testRead() throws Exception {
        Assessment p1 = new Assessment.Builder("Dimpho").surname("Khudunyane").build();
        Assessment returnAssessment = crudService.find(p1.getSurname());
        when(crudService.find(p1.getSurname())).thenReturn(returnAssessment);
        Mockito.verify(crudService).find(p1.getSurname());

    }

    @Test
    public void testUpdate() throws Exception {

        Assessment p1 = new Assessment.Builder("Dimpho").surname("Khudunyane").build();

        Assessment returnAssessment = crudService.merge(p1);
        when(crudService.merge(p1)).thenReturn(returnAssessment);
        Mockito.verify(crudService).merge(p1);

    }

    @Test
    public void testDelete() throws Exception {

        Assessment p1 = new Assessment.Builder("Dimpho").surname("Khudunyane").build();
        Assessment returnAssessment = crudService.remove(p1);
        when(crudService.remove(p1)).thenReturn(returnAssessment);
        Mockito.verify(crudService).remove(p1);

    }
}
