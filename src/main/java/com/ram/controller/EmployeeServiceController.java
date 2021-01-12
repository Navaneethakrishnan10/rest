package com.ram.controller;

import java.util.Arrays;
import java.util.List;

import com.ram.navanee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.ram.model.Employee;

@RestController
public class EmployeeServiceController
{

	@Autowired
	RestTemplate restTemplate;
	@Autowired
	navanee obj;
	@PostMapping({"/emp"})
	public String createEmployee(@RequestBody Employee emp)
	{


		return obj.StringcreateEmployee(emp);
				
	}



	@GetMapping({"emp/{id}"})
	public Employee getemp(@PathVariable("id") int id)
	{


				
		return obj.Employeegetemp(id);
	}

	@GetMapping({"/emp"})
	public List<Employee> getemp()
	{


		return (List<Employee>) obj.getAll();
	}

	/*@RequestMapping(value = "/template/employees/{id}", method = RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable("id") int id)
	{
		System.out.println("Inside deleteEmployee method of SpringBootRestTemplateDemo Application");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Employee> entity = new HttpEntity<Employee>(headers);

		ResponseEntity<String> responseEntity = restTemplate.exchange("http://localhost:8080/employees/" + id, HttpMethod.DELETE,
				entity, String.class);
		return responseEntity.getBody();	
	}
	@RequestMapping(value = "/template/employees/{id}", method = RequestMethod.PUT)
	public String updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee)
	{
		System.out.println("Inside updateEmployee method of SpringBootRestTemplateDemo Application");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Employee> entity = new HttpEntity<Employee>(employee, headers);

		ResponseEntity<String> responseEntity = restTemplate.exchange("http://localhost:8080/employees/" + id, HttpMethod.PUT,
				entity, String.class);
		return responseEntity.getBody();
	}*/

}
