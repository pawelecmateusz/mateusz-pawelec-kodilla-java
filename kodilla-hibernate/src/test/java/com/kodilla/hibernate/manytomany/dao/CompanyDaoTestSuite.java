package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    void testEmployeesWithSpecificLastname() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee anneSmith = new Employee("Anne", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee owenGrady = new Employee("Owen", "Grady");

        //When
        employeeDao.save(johnSmith);
        employeeDao.save(anneSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(owenGrady);

        List<Employee> smithEmployees = employeeDao.retrieveLastname("Smith");
        List<Employee> gradyEmployees = employeeDao.retrieveLastname("Grady");

        //Then
        try {
            assertEquals(2, smithEmployees.size());
            assertEquals(1, gradyEmployees.size());
        } finally {
            //CleanUp
            employeeDao.deleteAll();
        }
    }

    @Test
    void testCompaniesNamesStartingWith() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company dataMasters = new Company("Data Masters");
        Company dataNoobs = new Company("Data Noobs");
        Company greyMatter = new Company("Grey Matter");
        Company greyOrNot = new Company("Grey Or Not");

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(dataMasters);
        companyDao.save(dataNoobs);
        companyDao.save(greyMatter);
        companyDao.save(greyOrNot);

        List<Company> sofCompanies = companyDao.findCompaniesWithNameStartingWith("Sof");
        List<Company> datCompanies = companyDao.findCompaniesWithNameStartingWith("Dat");
        List<Company> greCompanies = companyDao.findCompaniesWithNameStartingWith("Gre");

        //Then
        try {
            assertEquals(1, sofCompanies.size());
            assertEquals(3, datCompanies.size());
            assertEquals(2, greCompanies.size());
        } finally {
            //CleanUp
            companyDao.deleteAll();
        }
    }
}