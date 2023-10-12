package com.velocity.telecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.velocity.telecom.model.NetworkSliceCondition;
import com.velocity.telecom.repository.NetworkSliceConditionRepository;

public class NetworkSliceConditionServiceImpl {
	
	@Autowired
	private NetworkSliceConditionRepository networkSliceConditionRepository;
	
	public void deleteNetworkSliceCondition(String nfstatusNotificationUriId) {
		
		 networkSliceConditionRepository.deleteBynfstatusNotificationUriId(nfstatusNotificationUriId);
	}

}
