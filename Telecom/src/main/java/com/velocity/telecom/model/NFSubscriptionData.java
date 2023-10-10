package com.velocity.telecom.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "nfSubscriptionData")
public class NFSubscriptionData {
	
	@Id
	private String nfstatusNotificationUri;
	
	private int subscriptionId;
	private String reqestestedNfType;
	private int validityTime;
	private String isLocalSubscription;
	private String subscriptionCondition;
	private String reqestestedNfFrequency;
	private String subscriptionStatus;
	
	@OneToMany(mappedBy = "nfstatusNotificationUriId")
	private List<NetworkSliceCondition> networkSliceConditions;

		
	public String getNfstatusNotificationUri() {
		return nfstatusNotificationUri;
	}

	public void setNfstatusNotificationUri(String nfstatusNotificationUri) {
		this.nfstatusNotificationUri = nfstatusNotificationUri;
	}

	public int getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getReqestestedNfType() {
		return reqestestedNfType;
	}

	public void setReqestestedNfType(String reqestestedNfType) {
		this.reqestestedNfType = reqestestedNfType;
	}

	public int getValidityTime() {
		return validityTime;
	}

	public void setValidityTime(int validityTime) {
		this.validityTime = validityTime;
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
		return "NFSubscriptionData [nfstatusNotificationUri=" + nfstatusNotificationUri + ", subscriptionId="
				+ subscriptionId + ", reqestestedNfType=" + reqestestedNfType + ", validityTime=" + validityTime
				+ ", isLocalSubscription=" + isLocalSubscription + ", subscriptionCondition=" + subscriptionCondition
				+ ", reqestestedNfFrequency=" + reqestestedNfFrequency + ", subscriptionStatus=" + subscriptionStatus
				+ ", networkSliceConditions=" + networkSliceConditions + "]";
	}	
}
