package com.velocity.telecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.telecom.model.NetworkSliceCondition;

@Repository
public interface NetworkSliceConditionRepository extends JpaRepository<NetworkSliceCondition, Integer> {

	public List<NetworkSliceCondition> findByNfstatusNotificationUriId(String uri);

	public NetworkSliceCondition getNetworkSliceConditionById(int id);

	public void deleteByNfstatusNotificationUriId(String nfstatusNotificationUri);	

}
