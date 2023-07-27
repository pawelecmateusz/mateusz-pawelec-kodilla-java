package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTest {

    @Autowired
    private Facade facade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSearchCompaniesByCompanyNameFragment() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");
        companyDao.saveAll(List.of(softwareMachine, dataMasters, greyMatter));

        //When
        List<Company> searchResult = facade.findCompanyByNameFragment("ma");

        //Then
        assertEquals(3, searchResult.size());
        assertEquals("Software Machine", searchResult.get(0).getName());
        assertEquals("Data Masters", searchResult.get(1).getName());
        assertEquals("Grey Matter", searchResult.get(2).getName());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachine.getId());
            companyDao.deleteById(dataMasters.getId());
            companyDao.deleteById(greyMatter.getId());
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testSearchEmployeesByLastNameFragment() {
        // Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarkon = new Employee("Stephanie", "Clarkon");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        employeeDao.saveAll(List.of(johnSmith, stephanieClarkon, lindaKovalsky));

        // When
        List<Employee> searchResult = facade.findEmployeeByLastNameFragment("ko");


        // Then
        assertEquals(2, searchResult.size());
        assertEquals("Clarkon", searchResult.get(0).getLastname());
        assertEquals("Kovalsky", searchResult.get(1).getLastname());

        //CleanUp
        try {
            employeeDao.deleteById(johnSmith.getId());
            employeeDao.deleteById(stephanieClarkon.getId());
            employeeDao.deleteById(lindaKovalsky.getId());
        } catch (Exception e) {
            //do nothing
        }
    }
}
