package com.dhl.ems.ems_backend.service;

import com.dhl.ems.ems_backend.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    /**
     * Creates a new employee.
     *
     * @param employeeDTO the employee data transfer object containing employee details
     * @return the created employee data transfer object
     */
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    /**
     * Retrieves an employee by their ID.
     *
     * @param id the ID of the employee to retrieve
     * @return the employee data transfer object if found, null otherwise
     */
    EmployeeDTO getEmployeeById(Long id);

    /**
     * Retrieves all employees.
     *
     * @return a list of employee data transfer objects
     */
    List<EmployeeDTO> getAllEmployees();

    /**
     * Updates an existing employee.
     * @param id
     * @param updatedEmployeeDTO
     * @return
     */
    EmployeeDTO updateEmployee(Long id, EmployeeDTO updatedEmployeeDTO);

    /**
     * Deletes an employee by their ID.
     *
     * @param id the ID of the employee to delete
     */
    void deleteEmployee(Long id);
}
