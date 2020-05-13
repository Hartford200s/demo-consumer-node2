package com.example.demo.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.hystrix.HelloRemoteServiceHystrix;

@FeignClient(name="demo-producer2", fallback = HelloRemoteServiceHystrix.class)
public interface HelloRemoteService {
	
	@RequestMapping(value="/hello")
	public String hello2(@RequestParam(value="name") String name); 
}
