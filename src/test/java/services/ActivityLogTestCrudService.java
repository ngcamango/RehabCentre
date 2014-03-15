/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.ngcamango.rehabcentre.model.ActivityLog;
import com.ngcamango.rehabcentre.model.NextOfKin;
import com.ngcamango.rehabcentre.services.crud.ActivityLogCrudService;
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
public class ActivityLogTestCrudService {
    
    public ActivityLogTestCrudService() {
    }

    @Mock
    ActivityLogCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ActivityLogCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        ActivityLog p1 = new ActivityLog.Builder("Dimpho").surname("Khudunyane").build();
        ActivityLog returnActivityLog = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnActivityLog);
        Mockito.verify(crudService).persist(p1);
    }
    
    @Test
    public void testRead() throws Exception {
        ActivityLog p1 = new ActivityLog.Builder("Dimpho").surname("Khudunyane").build();
        ActivityLog returnActivityLog = crudService.find(p1.getSurname());
        when(crudService.find(p1.getSurname())).thenReturn(returnActivityLog);
        Mockito.verify(crudService).find(p1.getSurname());

    }

    @Test
    public void testUpdate() throws Exception {

        ActivityLog p1 = new ActivityLog.Builder("Dimpho").surname("Khudunyane").build();

        ActivityLog returnActivityLog = crudService.merge(p1);
        when(crudService.merge(p1)).thenReturn(returnActivityLog);
        Mockito.verify(crudService).merge(p1);

    }

    @Test
    public void testDelete() throws Exception {

        ActivityLog p1 = new ActivityLog.Builder("Dimpho").surname("Khudunyane").build();
        ActivityLog returnActivityLog = crudService.remove(p1);
        when(crudService.remove(p1)).thenReturn(returnActivityLog);
        Mockito.verify(crudService).remove(p1);

    }
}
