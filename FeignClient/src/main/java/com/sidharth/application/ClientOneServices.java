package com.sidharth.application;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("EurekaClientOne")
public interface ClientOneServices {

	@RequestMapping("/client-one/test")
	public String test();
	
	@RequestMapping("/client-one/dummyfromclientone")
	public ResponseEntity<DummyEntityList> getDummyEntityFromClientOne();
	
}
