package web.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import  org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import beans.Employee;

@RestController
@RequestMapping("EmpData")
public class EmployeeResource {

	private static Map<Integer,Employee> empData;
	
	static {
		empData = new HashMap<Integer, Employee>();
		empData.put(1, new Employee(1,"Suresh",111111));
		empData.put(2, new Employee(2,"Naresh",999999));
		empData.put(3, new Employee(3,"Ramesh",888899));
		
	}
	
	//@RequestMapping(value="employee/{eid}",)
	//http://localhost:8080/rest1/rest/EmpData/employee/1
	@GetMapping(value="employee/{eid}",produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity getData(@PathVariable("eid") int empId) {
		Employee e = empData.get(empId);
		if (e == null) {
			return new ResponseEntity("No Employee found"+ empId, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(e, HttpStatus.OK);
		
	}
	//http://localhost:8080/rest1/rest/EmpData/employees
	@GetMapping(value="employees")	
	public List<Employee> getAll(){
			List<Employee> emps= new ArrayList<Employee>();
			Collection c= empData.values();
			emps.addAll(c);
			return emps;
		}
	//  http://localhost:8080/rest1/rest/EmpData/save
	@PostMapping(value="save",consumes="application/xml")
	public String save(@RequestBody Employee e) {
		if (empData.containsKey(e.getEmpid()))
			return "Employee already exist";
		empData.put(e.getEmpid(),e);
			return "Employee Data saved successfully";
	}
	@DeleteMapping(value="delete/{eid}",produces = "text/plain")
	public String delete(@PathVariable("eid") int empId) {
		empData.remove(empId);
		return " Employee deleted Successfully";
		
	}
	}

