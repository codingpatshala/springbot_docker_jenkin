package api.com.org.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestSecurity {

	@GetMapping("/print")
	public ResponseEntity<String> get(@RequestParam String name){
		
		return new ResponseEntity<String>(name,HttpStatus.OK);
	}
	
	
}
