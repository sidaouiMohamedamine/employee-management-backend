package com.sid.employeeManagementSystemBackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Employee_Table")
public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "employeeFirstName")
        private String firstname;
        @Column(name = "employeeLastName")
        private String lastname;
        private String email;
        private Date birthDate;
        private String phoneNumber;
        private String adress;
        private Double salary;












}
