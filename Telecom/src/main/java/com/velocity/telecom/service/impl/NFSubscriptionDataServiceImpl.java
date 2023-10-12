package com.velocity.telecom.service.impl;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.telecom.model.NFSubscriptionData;
import com.velocity.telecom.repository.NFSubscriptionDataRepository;
@Service
public class NFSubscriptionDataServiceImpl {
	
	@Autowired
	private NFSubscriptionDataRepository nfSubscriptionDataRepository;
	
	public void deleteNetworkSliceCondition(String nfstatusNotificationUriId) {
		nfSubscriptionDataRepository.deleteBynfstatusNotificationUriId(nfstatusNotificationUriId);

	
 }
}