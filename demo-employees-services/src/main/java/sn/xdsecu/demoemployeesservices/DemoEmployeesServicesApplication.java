package sn.xdsecu.demoemployeesservices;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sn.xdsecu.demoemployeesservices.entities.Employee;
import sn.xdsecu.demoemployeesservices.repositories.EmployeeRepository;

import java.util.UUID;

@SpringBootApplication
public class DemoEmployeesServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEmployeesServicesApplication.class, args);
    }



@Bean
public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
    return args -> {
        employeeRepository.save(Employee.builder()
                        .id(UUID.randomUUID().toString())
                        .firstname("Moustapha")
                        .lastname("SENE")
                        .salary(1000)
                        .role("Lead IT")
                        .nss(1237)
                        .address("Dakar")
                        .phone(778889900)
                        .domain("Information Technologies")
                        .department("Strategy Tranformation")
                .build());
        employeeRepository.save(Employee.builder()
                .id(UUID.randomUUID().toString())
                .firstname("Mohamed")
                .lastname("FAYE")
                .salary(1000)
                .role("Lead IT")
                .nss(1236)
                .address("Dakar")
                .phone(778889900)
                .domain("Information Technologies")
                .department("Cybersecurity")
                .build());
        employeeRepository.save(Employee.builder()
                .id(UUID.randomUUID().toString())
                .firstname("Mame Diarra")
                .lastname("BAMBA")
                .salary(1000)
                .role("Lead IT")
                .nss(1234)
                .address("Dakar")
                .phone(778889900)
                .domain("Information Technologies")
                .department("Architect & Strategy")
                .build());
        employeeRepository.save(Employee.builder()
                .id(UUID.randomUUID().toString())
                .firstname("Salla")
                .lastname("KANDE")
                .salary(1000)
                .role("Lead IT")
                .nss(1230)
                .address("Dakar")
                .phone(778889900)
                .domain("Information Technologies")
                .department("Architect & Strategy")
                .build());
        employeeRepository.save(Employee.builder()
                .id(UUID.randomUUID().toString())
                .firstname("Matar")
                .lastname("SECK")
                .salary(1000)
                .role("Lead IT")
                .nss(1238)
                .address("Dakar")
                .phone(778889900)
                .domain("Information Technologies")
                .department("Architect & Strategy")
                .build());

    };
}

}
