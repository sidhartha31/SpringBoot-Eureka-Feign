package com.sidharth.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignHomeController {

	@Autowired
	private ClientOneServices client1;
	
	@Autowired
	private ClientTwoServices client2;
	
	@GetMapping("/testclient1test1")
	public String testclient1test1() {
		return client1.test();
	}
	
	@GetMapping("/testclient1test2")
	public ResponseEntity<DummyEntityList> testclient1test2() {
		return client1.getDummyEntityFromClientOne();
	}
	
	@GetMapping("/testclient2test1")
	public String testclient2test1() {
		return client2.test();
	}
	
	@GetMapping("/testclient2test2")
	public ResponseEntity<DummyEntityList> testclient2test2() {
		return client2.getDummyEntityFromClientOne();
	}
}
