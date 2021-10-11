package jp.co.axa.apidemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.axa.apidemo.entities.Employee;
import jp.co.axa.apidemo.services.EmployeeService;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

//    @GetMapping("/employees")
//    public List<Employee> getEmployees() {
//        List<Employee> employees = employeeService.retrieveEmployees();
//        return employees;
//    }
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployees() {
        return ResponseEntity.ok(employeeService.retrieveEmployees());
    }

//    @GetMapping("/employees/{employeeId}")
//    public Employee getEmployee(@PathVariable(name="employeeId")Long employeeId) {
//        return employeeService.getEmployee(employeeId);
//    }
    @GetMapping("/employees/{employeeId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable(name="employeeId")Long employeeId) {
        return ResponseEntity.ok(employeeService.getEmployee(employeeId));
    }

    @PostMapping("/employees")
//	@ApiOperation(value = "Add a new employee", tags = { "employee" })
//	@ApiResponses(value = { @ApiResponse(code = 201, message = "Employee created"),
//	@ApiResponse(code = 400, message = "Invalid input"),
//	@ApiResponse(code = 409, message = "Employee already exists") })
    public void saveEmployee(Employee employee){
        employeeService.saveEmployee(employee);
        System.out.println("Employee Saved Successfully");
    }
    
//    @PostMapping("/employees")
//    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee){
//        return ResponseEntity.ok(employeeService.saveEmployee(employee));
//    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable(name="employeeId")Long employeeId){
        employeeService.deleteEmployee(employeeId);
        System.out.println("Employee Deleted Successfully");
        
    }

    @PutMapping("/employees/{employeeId}")
    public ResponseEntity<Employee> updateEmployee(@Valid @RequestBody Employee employee,
                                    @PathVariable(name="employeeId")Long employeeId){
        return ResponseEntity.ok(employeeService.updateEmployee(employee, employeeId));

    }

}
