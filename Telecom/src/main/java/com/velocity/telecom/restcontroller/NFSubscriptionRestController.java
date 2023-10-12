package com.velocity.telecom.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.telecom.exception.CanNotPerformOperation;
import com.velocity.telecom.model.NFSubscriptionData;
import com.velocity.telecom.model.NetworkSliceCondition;
import com.velocity.telecom.service.NFSubscriptionDataService;
import com.velocity.telecom.service.NetworkSliceConditionService;

@RestController
@RequestMapping("/nfSubscription")
public class NFSubscriptionRestController {

	@Autowired
	private NFSubscriptionDataService nfSubscriptionDataService;
	@Autowired
	private NetworkSliceConditionService networkSliceConditionService;
	
	@PutMapping("/update")
	public NFSubscriptionData updateNFSubscription(@RequestBody NFSubscriptionData nfSubscriptionData) {
		
		NFSubscriptionData nfSub = nfSubscriptionDataService.updateNFSubscriptionData(nfSubscriptionData);
		List <NetworkSliceCondition> networkSliceList = nfSubscriptionData.getNetworkSliceConditions();
		for(NetworkSliceCondition networkSlice : networkSliceList) {
			
				networkSliceConditionService.updateNetworkSliceCondition(networkSlice);
			}
		return nfSub;
	}
	
	@PutMapping("/update/networkslicecondition")
	public NetworkSliceCondition updateNetworkSliceConditionById(@RequestBody NetworkSliceCondition networkSlice) {

		return networkSliceConditionService.updateNetworkSliceCondition(networkSlice);
		
	}
	
	@PutMapping("/update/nfSubscriptionData")
	public NFSubscriptionData updateNFSubscriptionData(@RequestBody NFSubscriptionData nfSubscriptionData) {

		if(nfSubscriptionData.getNetworkSliceConditions()==null) {
			
			return nfSubscriptionDataService.updateNFSubscriptionData(nfSubscriptionData);
		}
		else {
			throw new CanNotPerformOperation("Network Slice Condition data is not required");
		}		
	}
	
	@DeleteMapping("/delete/{nfstatusNotificationUriId}")
	public void deleteNetworkSliceConditionBynfstatusNotificationUriId(@PathVariable("nfstatusNotificationUriId")String nfstatusNotificationUriId)throws Exception{
		networkSliceConditionService.deleteNetworkSliceCondition(nfstatusNotificationUriId);
	}
}

