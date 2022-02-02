package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Mobile;
import com.example.demo.service.MobileService;

@RestController
public class MobileController {

	@Autowired
	MobileService mobileService;
    
    @GetMapping("/mobile")
	Iterable<Mobile> getMobiles() {
	      return mobileService.getMobiles();
	 }
    
    @GetMapping("/mobile/{id}")
    Optional<Mobile> getUsers(@PathVariable("id") Integer id){
			return mobileService.getMobile(id);
	}
	
	@PostMapping("/mobile")
	void createMobile(@RequestBody Mobile mobile) {
		
	mobileService.saveMobile(mobile);
	}
	
	@DeleteMapping("/mobile/{id}")
	void deleteMobile(@PathVariable("id") Integer id) {
		mobileService.deleteMobile(id);
	}
}