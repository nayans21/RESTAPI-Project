package com.velocity.telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.telecom.model.NetworkSliceCondition;

@Repository
public interface NetworkSliceConditionRepository extends JpaRepository<NetworkSliceCondition, Integer> {
	

}
