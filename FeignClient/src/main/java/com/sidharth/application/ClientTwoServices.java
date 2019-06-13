package com.sidharth.application;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("EurekaClientTwo")
public interface ClientTwoServices {

	@RequestMapping("/client-two/test")
	public String test();
	
	@RequestMapping("/client-two/dummyfromclienttwo")
	public ResponseEntity<DummyEntityList> getDummyEntityFromClientOne();
}
