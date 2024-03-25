package com.sid.employeeManagementSystemBackend.repository;


import com.sid.employeeManagementSystemBackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

        @Query("select e from Employee e where e.adress=:adress")
        List<Employee> getEmployeeByAdress(@Param("adress")String adress);

        /************************deuxiéme méthode    ***************/
        List<Employee> findEmployeeBySalary(Double salary);
        boolean existsEmployeeByLastname(String lastName);

}
