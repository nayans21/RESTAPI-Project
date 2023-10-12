package com.velocity.telecom.restcontroller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.telecom.service.NFSubscriptionDataService;

@RestController
public class NFSubscriptionRestController {
 
     private NFSubscriptionDataService nFSubscriptionDataService;
	
	@DeleteMapping("/delete/{nfstatusNotificationUriId}")
	public void deleteNetworkSliceConditionBynfstatusNotificationUriId(@PathVariable("nfstatusNotificationUriId")String nfstatusNotificationUriId)throws Exception{
		nFSubscriptionDataService.deleteNetworkSliceCondition(nfstatusNotificationUriId);
	}

}
