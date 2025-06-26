package com.dhl.ems.ems_backend.service.impl;

import com.dhl.ems.ems_backend.dto.EmployeeDTO;
import com.dhl.ems.ems_backend.entity.Employee;
import com.dhl.ems.ems_backend.exceptions.ResourceNotFoundException;
import com.dhl.ems.ems_backend.mapper.EmployeeMapper;
import com.dhl.ems.ems_backend.repository.EmployeeRepository;
import com.dhl.ems.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        if (employee != null) {
            Employee savedEmployee = employeeRepository.save(employee);
            return EmployeeMapper.mapToEmployeeDTO(savedEmployee);
        }
        return null;
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee not found with id: " + id)
        );
        return EmployeeMapper.mapToEmployeeDTO(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                .map(EmployeeMapper::mapToEmployeeDTO)
                .toList();
    }

    @Override
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO updatedEmployeeDTO) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee not found with id: " + id));

        existingEmployee.setFirstName(updatedEmployeeDTO.getFirstName());
        existingEmployee.setLastName(updatedEmployeeDTO.getLastName());
        existingEmployee.setEmail(updatedEmployeeDTO.getEmail());

        Employee updatedEmployee = employeeRepository.save(existingEmployee);
        return EmployeeMapper.mapToEmployeeDTO(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee not found with id: " + id));

        employeeRepository.delete(employee);
    }
}