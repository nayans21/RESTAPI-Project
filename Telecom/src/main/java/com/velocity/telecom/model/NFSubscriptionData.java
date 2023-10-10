package com.velocity.telecom.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "NFSubscriptionData")
public class NFSubscriptionData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private int subscriptionId;
	private int validityTime;
	private String nfstatusNotificationUri;
	private String reqestestedNfType;
	private String isLocalSubscription;
	private String subscriptionCondition;
	private String reqestestedNfFrequency;
	private String subscriptionStatus;
	private List<NetworkSliceCondition> networkSliceConditions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public int getValidityTime() {
		return validityTime;
	}
	public void setValidityTime(int validityTime) {
		this.validityTime = validityTime;
	}
	public String getNfstatusNotificationUri() {
		return nfstatusNotificationUri;
	}
	public void setNfstatusNotificationUri(String nfstatusNotificationUri) {
		this.nfstatusNotificationUri = nfstatusNotificationUri;
	}
	public String getReqestestedNfType() {
		return reqestestedNfType;
	}
	public void setReqestestedNfType(String reqestestedNfType) {
		this.reqestestedNfType = reqestestedNfType;
	}
	public String getIsLocalSubscription() {
		return isLocalSubscription;
	}
	public void setIsLocalSubscription(String isLocalSubscription) {
		this.isLocalSubscription = isLocalSubscription;
	}
	public String getSubscriptionCondition() {
		return subscriptionCondition;
	}
	public void setSubscriptionCondition(String subscriptionCondition) {
		this.subscriptionCondition = subscriptionCondition;
	}
	public String getReqestestedNfFrequency() {
		return reqestestedNfFrequency;
	}
	public void setReqestestedNfFrequency(String reqestestedNfFrequency) {
		this.reqestestedNfFrequency = reqestestedNfFrequency;
	}
	public String getSubscriptionStatus() {
		return subscriptionStatus;
	}
	public void setSubscriptionStatus(String subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}
	public List<NetworkSliceCondition> getNetworkSliceConditions() {
		return networkSliceConditions;
	}
	public void setNetworkSliceConditions(List<NetworkSliceCondition> networkSliceConditions) {
		this.networkSliceConditions = networkSliceConditions;
	}
	@Override
	public String toString() {
		return "NFSubscriptionData [id=" + id + ", subscriptionId=" + subscriptionId + ", validityTime=" + validityTime
				+ ", networkSliceConditions=" + networkSliceConditions + "]";
	}
	
	
}
