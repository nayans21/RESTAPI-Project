package com.velocity.telecom.service;

import com.velocity.telecom.model.NetworkSliceCondition;

public interface NetworkSliceConditionService {
	
	public NetworkSliceCondition updateNetworkSliceCondition(NetworkSliceCondition networkSliceCondition);
	public void deleteNetworkSliceCondition(NetworkSliceCondition networkSliceCondition);
	public void deleteNetworkSliceCondition(String nfstatusNotificationUriId);

}
