package com.velocity.telecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.velocity.telecom.model.NFSubscriptionData;
import com.velocity.telecom.repository.NFSubscriptionDataRepository;

public class NFSubscriptionDataServiceImpl {
	
	@Autowired
	private NFSubscriptionDataRepository nfSubscriptionDataRepository;
	
	public NFSubscriptionData updateNFSubscriptionData(NFSubscriptionData nfSubscriptionData) {
		
		return nfSubscriptionDataRepository.save(nfSubscriptionData);
 }
}