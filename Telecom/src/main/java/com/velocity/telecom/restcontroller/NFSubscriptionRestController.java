package com.velocity.telecom.restcontroller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.telecom.model.NFSubscriptionData;
import com.velocity.telecom.service.NFSubscriptionDataService;

@RestController
@RequestMapping("/nfSubscription")
public class NFSubscriptionRestController {

	private NFSubscriptionDataService nfSubscriptionDataService;
	
	@PutMapping("/update")
	public NFSubscriptionData updateNFSubscription(@RequestBody NFSubscriptionData nfSubscriptionData) {
		
		return nfSubscriptionDataService.updateNFSubscriptionData(nfSubscriptionData);
		
	}
}

