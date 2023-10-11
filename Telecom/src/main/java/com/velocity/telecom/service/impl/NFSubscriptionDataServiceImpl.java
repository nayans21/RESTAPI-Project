package com.velocity.telecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.telecom.model.NFSubscriptionData;
import com.velocity.telecom.repository.NFSubscriptionDataRepository;
import com.velocity.telecom.service.NFSubscriptionDataService;

@Service
public class NFSubscriptionDataServiceImpl implements NFSubscriptionDataService {
	
	@Autowired
	private NFSubscriptionDataRepository nfSubscriptionDataRepository;
	
	public NFSubscriptionData updateNFSubscriptionData(NFSubscriptionData nfSubscriptionData) {
		
		return nfSubscriptionDataRepository.save(nfSubscriptionData);
 }
}