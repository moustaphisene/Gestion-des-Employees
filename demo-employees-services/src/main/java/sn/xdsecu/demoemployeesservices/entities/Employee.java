package sn.xdsecu.demoemployeesservices.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor @Builder @Setter @Getter @ToString
@Entity
public class Employee {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private double salary;
    private String role;
    private int nss;
    private String address;
    private double phone;
    private String domain;
    private String department;
}
