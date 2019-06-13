package com.sidharth.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client-one")
public class TestController {

	@GetMapping("/test")
	public String test() {
		return "Hello from Controller Client One!";
	}
	
	@GetMapping("/dummyfromclientone")
	public ResponseEntity<DummyEntityList> getDummyEntityFromClientOne() {
		
		DummyEntity d1 = new DummyEntity("1", "Desc1");
		DummyEntity d2 = new DummyEntity("2", "Desc2");
		DummyEntity d3 = new DummyEntity("3", "Desc3");
		DummyEntity d4 = new DummyEntity("4", "Desc4");
		
		List<DummyEntity> list = new ArrayList<DummyEntity>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		
		DummyEntityList response = new DummyEntityList();
		response.setDummyEntityList(list);
		
		return new ResponseEntity<DummyEntityList>(response, new HttpHeaders(), HttpStatus.OK);
		
	}
}
