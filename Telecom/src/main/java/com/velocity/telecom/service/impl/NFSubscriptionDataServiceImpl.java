package com.velocity.telecom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.telecom.exception.CanNotPerformOperation;
import com.velocity.telecom.exception.NoNFSubscriptionDataFound;
import com.velocity.telecom.model.NFSubscriptionData;
import com.velocity.telecom.model.NetworkSliceCondition;
import com.velocity.telecom.repository.NFSubscriptionDataRepository;
import com.velocity.telecom.repository.NetworkSliceConditionRepository;
import com.velocity.telecom.service.NFSubscriptionDataService;

@Service
public class NFSubscriptionDataServiceImpl implements NFSubscriptionDataService {
	@Autowired
	private NFSubscriptionDataRepository nfSubscriptionDataRepository;
	
	@Autowired
	private NetworkSliceConditionRepository networkSliceConditionRepository;
	
	public NFSubscriptionData updateNFSubscriptionData(NFSubscriptionData nfSubscriptionData) {
		NFSubscriptionData existingData = 
				nfSubscriptionDataRepository.findBynfstatusNotificationUri(nfSubscriptionData.getNfstatusNotificationUri());
		
		if(existingData==null) {
			String message = "No Data found with NfstatusNotificationUri as " + nfSubscriptionData.getNfstatusNotificationUri();
			throw new NoNFSubscriptionDataFound(message);
		}
		else
			return nfSubscriptionDataRepository.save(nfSubscriptionData);
 }

	public void deleteNFSubscriptionData(NFSubscriptionData nfSubscriptionData) {
		
		NFSubscriptionData existingData = 
				nfSubscriptionDataRepository.findBynfstatusNotificationUri(nfSubscriptionData.getNfstatusNotificationUri());
		
		if(existingData==null) {
			String message = "No Data found with NfstatusNotificationUri as " + nfSubscriptionData.getNfstatusNotificationUri();
			throw new NoNFSubscriptionDataFound(message);
		}
		
		String uri = nfSubscriptionData.getNfstatusNotificationUri();
		List<NetworkSliceCondition> lst	= networkSliceConditionRepository.findByNfstatusNotificationUriId(uri);
		if(!lst.isEmpty()) {
			String message = "Cannot delete as some records in the network_slice_condition table is present ";
			message= message + "for NfstatusNotificationUri "+uri;
			throw new CanNotPerformOperation(message);
		}
		else
			nfSubscriptionDataRepository.delete(nfSubscriptionData);
  }
	
}