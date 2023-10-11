package com.velocity.telecom.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NFSubscriptionRestController<NFsubscription> {

	@Autowired
	private NFsubscription  nfSubscription; 
	@PutMapping("/updatenfSubscription")
	public Description
	saveNfsubscription(@RequestBody NfSubscription nfsubscription )	{
		nfsubscription nfsub=nfsubscriptionService.updateNfsubscription(nfsubscription);
		return nfsub;
	}


