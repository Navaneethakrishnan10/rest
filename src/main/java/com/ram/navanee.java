package com.ram;

import com.ram.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;

public class navanee {

    @Autowired
    RestTemplate restTemplate;
    public String StringcreateEmployee( Employee emp) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Employee> entity = new HttpEntity<Employee>(emp, headers);

        ResponseEntity<String> responseEntity = restTemplate
                .exchange("http://localhost:8000/emp", HttpMethod.POST, entity, String.class);
        return responseEntity.getBody();

    }


    public Employee Employeegetemp( int id) {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<Employee> responseEntity = restTemplate
                .exchange("http://localhost:8000/emp/" + id, HttpMethod.GET, entity, Employee.class);

        return responseEntity.getBody();
    }

    public List<Employee> getAll() {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<List> responseEntity = restTemplate
                .exchange("http://localhost:8000/emp", HttpMethod.GET, entity, List.class);
        return responseEntity.getBody();
    }
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


