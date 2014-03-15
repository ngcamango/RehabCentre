/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import com.ngcamango.rehabcentre.model.Department;
import com.ngcamango.rehabcentre.services.crud.DepartmentCrudService;
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
public class DepartmentTestCrudService {
    
    public DepartmentTestCrudService() {
    }

    @Mock
    DepartmentCrudService crudService;

    @BeforeMethod
    public void setUpMethod() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DepartmentCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Department p1 = new Department.Builder(0201).name("D-O-D").build();
        Department returnDepartment = crudService.persist(p1);
        when(crudService.persist(p1)).thenReturn(returnDepartment);
        Mockito.verify(crudService).persist(p1);
    }
    
    @Test
    public void testRead() throws Exception {
        Department p1 = new Department.Builder(0201).name("D-O-D").build();
        Department returnDepartment = crudService.find(p1.getName());
        when(crudService.find(p1.getName())).thenReturn(returnDepartment);
        Mockito.verify(crudService).find(p1.getName());

    }

    @Test
    public void testUpdate() throws Exception {

        Department p1 = new Department.Builder(0201).name("D-O-D").build();

        Department returnDepartment = crudService.merge(p1);
        when(crudService.merge(p1)).thenReturn(returnDepartment);
        Mockito.verify(crudService).merge(p1);

    }

    @Test
    public void testDelete() throws Exception {

        Department p1 = new Department.Builder(0201).name("D-O-D").build();
        Department returnDepartment = crudService.remove(p1);
        when(crudService.remove(p1)).thenReturn(returnDepartment);
        Mockito.verify(crudService).remove(p1);

    }
}
