package com.velocity.telecom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="networkSliceCondition")
public class NetworkSliceCondition {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String sliceId;
	private String sliceServiceType;
	private String nfstatusNotificationUriId;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSliceId() {
		return sliceId;
	}
	
	public void setSliceId(String sliceId) {
		this.sliceId = sliceId;
	}
	
	public String getSliceServiceType() {
		return sliceServiceType;
	}
	
	public void setSliceServiceType(String sliceServiceType) {
		this.sliceServiceType = sliceServiceType;
	}
	
	public String getNfstatusNotificationUriId() {
		return nfstatusNotificationUriId;
	}
	
	public void setNfstatusNotificationUriId(String nfstatusNotificationUriId) {
		this.nfstatusNotificationUriId = nfstatusNotificationUriId;
	}
	
	@Override
	public String toString() {
		return "NetworkSliceCondition [id=" + id + ", sliceId=" + sliceId + ", sliceServiceType=" + sliceServiceType
				+ ", nfstatusNotificationUriId=" + nfstatusNotificationUriId + "]";
	}	
}
