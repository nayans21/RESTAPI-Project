package com.velocity.telecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.telecom.exception.NoNFSubscriptionDataFound;
import com.velocity.telecom.exception.NoNetworkSliceConditionFound;
import com.velocity.telecom.model.NFSubscriptionData;
import com.velocity.telecom.model.NetworkSliceCondition;
import com.velocity.telecom.repository.NFSubscriptionDataRepository;
import com.velocity.telecom.repository.NetworkSliceConditionRepository;
import com.velocity.telecom.service.NetworkSliceConditionService;

@Service
public class NetworkSliceConditionServiceImpl implements NetworkSliceConditionService {
	
	@Autowired
	private NetworkSliceConditionRepository networkSliceConditionRepository;
	
	@Autowired
	private NFSubscriptionDataRepository nfSubscriptionDataRepository;
	
	public NetworkSliceCondition updateNetworkSliceCondition(NetworkSliceCondition networkSliceCondition) {
		
		int id = networkSliceCondition.getId();
		String uri = networkSliceCondition.getNfstatusNotificationUriId();
		NetworkSliceCondition existingData = 
				networkSliceConditionRepository.getNetworkSliceConditionById(id);
		
		NFSubscriptionData nfSubscriptionData = nfSubscriptionDataRepository.findBynfstatusNotificationUri(uri);
		
		if(existingData==null) {
			String message = "No Data found with id as " + id;
			throw new NoNetworkSliceConditionFound(message);	
		}
		else if(nfSubscriptionData==null){
			
			String message = "No NfstatusNotificationUri found in table nf_subscription_data";
			throw new NoNFSubscriptionDataFound(message);
		}
		else
			return networkSliceConditionRepository.save(networkSliceCondition);
	}
	public void deleteNetworkSliceCondition(NetworkSliceCondition networkSliceCondition) {
		
		int id = networkSliceCondition.getId();
		NetworkSliceCondition existingData = 
				networkSliceConditionRepository.getNetworkSliceConditionById(id);
		
		if(existingData==null) {
			String message = "No Data found with id as " + id;
			throw new NoNetworkSliceConditionFound(message);
		}
		else
			networkSliceConditionRepository.delete(networkSliceCondition);
	}

	public void deleteNetworkSliceCondition(String nfstatusNotificationUriId) {
		
		 networkSliceConditionRepository.deleteBynfstatusNotificationUriId(nfstatusNotificationUriId);
	}

}
