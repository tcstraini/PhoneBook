package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MobileRepository;
import com.example.demo.entity.Mobile;


@Service
public class MobileService {
      @Autowired
      MobileRepository mobileRepository;
	
	
	public Iterable<Mobile> getMobiles() {

		return mobileRepository.findAll();
	}

	public void saveMobile(Mobile mobile) {
		
		mobileRepository.save(mobile);
	}

	public Optional<Mobile> getMobile(Integer id) {
	
		return mobileRepository.findById(id);
	}

	public void deleteMobile(Integer id) {
		mobileRepository.deleteById(id);
		
	}

}
