package com.velocity.telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.telecom.model.NFSubscriptionData;

@Repository
public interface NFSubscriptionDataRepository extends JpaRepository<NFSubscriptionData, Integer>{

	public NFSubscriptionData findBynfstatusNotificationUri(String nfstatusNotificationUri);

}
