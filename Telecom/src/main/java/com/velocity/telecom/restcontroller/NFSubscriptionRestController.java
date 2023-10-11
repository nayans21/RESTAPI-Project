package com.velocity.telecom.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NFSubscriptionRestController<NFsubscription> {

	@Autowired
	private NFsubscription  nfSubscription; 
	

}
