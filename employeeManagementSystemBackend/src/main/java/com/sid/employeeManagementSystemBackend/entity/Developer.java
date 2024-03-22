package com.sid.employeeManagementSystemBackend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Developer_Table")
public class Developer {

            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;
            private String firstname;
            private String lastname;
            private String email;

            @ManyToMany
            @JoinTable(
                    name = "developer_project",
                    joinColumns = @JoinColumn(name = "developer_id"),
                    inverseJoinColumns = @JoinColumn(name = "project_id")
            )
            private List<Project> projectList;
}
