package com.dhl.ems.ems_backend.controller;

import com.dhl.ems.ems_backend.dto.EmployeeDTO;
import com.dhl.ems.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    // This class will handle HTTP requests related to Employee operations.
    // It will use EmployeeService to perform business logic and return responses.

    private final EmployeeService employeeService;

    /**
     * Endpoint to create a new employee.
     *
     * @param employeeDTO the employee data transfer object containing employee details.
     * @return ResponseEntity with the created EmployeeDTO and HTTP status 201 (Created).
     */
    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeDTO createdEmployee = employeeService.createEmployee(employeeDTO);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }

    /**
     * Endpoint to retrieve an employee by their ID.
     *
     * @param id the ID of the employee to retrieve.
     * @return ResponseEntity with the EmployeeDTO and HTTP status 200 (OK).
     */
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("id") Long id) {
        EmployeeDTO employeeDTO = employeeService.getEmployeeById(id);
        return new ResponseEntity<>(employeeDTO, HttpStatus.OK);
    }

    /**
     * Endpoint to retrieve all employees.
     *
     * @return ResponseEntity with a list of EmployeeDTOs and HTTP status 200 (OK).
     */
    @GetMapping()
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
        List<EmployeeDTO> employeeList = employeeService.getAllEmployees();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    /**
     * Endpoint to update an existing employee.
     *
     * @param id the ID of the employee to update.
     * @param updatedEmployeeDTO the updated employee data transfer object.
     * @return ResponseEntity with the updated EmployeeDTO and HTTP status 200 (OK).
     */
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(
            @PathVariable("id") Long id,
            @RequestBody EmployeeDTO updatedEmployeeDTO
    ) {
        EmployeeDTO updatedEmployee = employeeService.updateEmployee(id, updatedEmployeeDTO);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    /**
     * Endpoint to delete an employee by their ID.
     *
     * @param id the ID of the employee to delete.
     * @return ResponseEntity with HTTP status 204 (No Content) if deletion is successful.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Employee deleted successfully");
    }
}