package jp.co.axa.apidemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.axa.apidemo.entities.Employee;
import jp.co.axa.apidemo.error.EmployeeNotFoundException;
import jp.co.axa.apidemo.repositories.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
@Transactional
//@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private static Logger log = LogManager.getLogger(EmployeeServiceImpl.class);
    
	@Autowired
	// If a bean has one constructor, you can omit the @Autowired instead u can
	// directly set as final, indicating that it cannot be changed
	private EmployeeRepository employeeRepository;

	// constructor injection is used to obtain employeeRepositiory is a bean
	// when you know more classes to be injected classes need to be split
	// lot of huge task and need to be splitter
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> retrieveEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}

	public Employee getEmployee(Long employeeId) {
        return employeeRepository.findById(employeeId)
        .orElseThrow(() -> new EmployeeNotFoundException(employeeId));
        
    }

	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void deleteEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
	}

	public Employee updateEmployee(Employee employee, Long employeeId) {

        Optional<Employee> optEmp = employeeRepository.findById(employeeId);

        if(!optEmp.isPresent()){
            log.error("Employee Not Found Id : = " +employeeId);
            throw new EmployeeNotFoundException(employeeId);
        }
        
        Employee emp = optEmp.get();

        emp.setName(employee.getName());
        emp.setSalary(employee.getSalary());
        emp.setDepartment(employee.getDepartment());

       return employeeRepository.save(emp);
        
    }
}