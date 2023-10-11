package com.velocity.telecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.telecom.model.NetworkSliceCondition;
import com.velocity.telecom.repository.NetworkSliceConditionRepository;
import com.velocity.telecom.service.NetworkSliceConditionService;

@Service
public class NetworkSliceConditionServiceImpl implements NetworkSliceConditionService {
	
	@Autowired
	private NetworkSliceConditionRepository networkSliceConditionRepository;
	
	public NetworkSliceCondition updateNetworkSliceCondition(NetworkSliceCondition networkSliceCondition) {
		
		return networkSliceConditionRepository.save(networkSliceCondition);
	}
	public void deleteNetworkSliceCondition(NetworkSliceCondition networkSliceCondition) {
		
		 networkSliceConditionRepository.delete(networkSliceCondition);
	}
	

}
