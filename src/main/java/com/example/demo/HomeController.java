package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping({"", "/"})
	public ResponseEntity<?> home(){
		Map<String, String> map = new HashMap<>();
		
		map.put("id", "moo1");
		
		return ResponseEntity.ok().body(map);
	}

}
