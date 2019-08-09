import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import beans.Employee;

public class RestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestTemplate template = new RestTemplate();
		Employee emp = template.getForObject("http://localhost:8080/rest1/rest/EmpData/employee/1", Employee.class);
		System.out.println(emp);
		
		Map<String,String> params = new HashMap<>();
		params.put("empId", "2");
		UriTemplate uriTemplate = new UriTemplate("http://localhost:8080/rest1/rest/EmpData/employee/{empId}");
		String url = uriTemplate.expand(params).toASCIIString();
		
		emp = template.getForObject(url, Employee.class);
		System.out.println(emp);
	}

}
