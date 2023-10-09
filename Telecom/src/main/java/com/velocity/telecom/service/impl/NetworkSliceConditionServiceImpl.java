package com.velocity.telecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.velocity.telecom.model.NetworkSliceCondition;
import com.velocity.telecom.repository.NetworkSliceConditionRepository;

public class NetworkSliceConditionServiceImpl {
	
	@Autowired
	private NetworkSliceConditionRepository networkSliceConditionRepository;
	
	public NetworkSliceCondition updateNetworkSliceCondition(NetworkSliceCondition networkSliceCondition) {
		
		return networkSliceConditionRepository.save(networkSliceCondition);
	}

}
