package com.velocity.telecom.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.telecom.model.NFSubscriptionData;
import com.velocity.telecom.model.NetworkSliceCondition;
import com.velocity.telecom.service.NFSubscriptionDataService;
import com.velocity.telecom.service.NetworkSliceConditionService;

@RestController
@RequestMapping("/nfSubscription")
public class NFSubscriptionRestController {

	private NFSubscriptionDataService nfSubscriptionDataService;
	private NetworkSliceConditionService networkSliceConditionService;
	
	@PutMapping("/update")
	public NFSubscriptionData updateNFSubscription(@RequestBody NFSubscriptionData nfSubscriptionData) {
		
		NFSubscriptionData nfSub = nfSubscriptionDataService.updateNFSubscriptionData(nfSubscriptionData);
		List <NetworkSliceCondition> networkSliceList = nfSubscriptionData.getNetworkSliceConditions();
		for(NetworkSliceCondition networkSlice : networkSliceList) {
			networkSlice.setNfstatusNotificationUriId(nfSubscriptionData.getNfstatusNotificationUri());
			networkSliceConditionService.updateNetworkSliceCondition(networkSlice);
		}
		return nfSub;
	}
}

