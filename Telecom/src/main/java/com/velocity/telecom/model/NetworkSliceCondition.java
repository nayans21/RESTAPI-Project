package com.velocity.telecom.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name ="NetworkSliceCondition")
public class NetworkSliceCondition {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id
	private String sd(slice id);
	private String sst(sliceServiceType);
	private String nfstatusNotificationUriId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNfstatusNotificationUriId() {
		return nfstatusNotificationUriId;
	}
	public void setNfstatusNotificationUriId(String nfstatusNotificationUriId) {
		this.nfstatusNotificationUriId = nfstatusNotificationUriId;
	}
	@Override
	public String toString() {
		return "NetworkSliceCondition [id=" + id + "]";
	}
	
	
	
	
	
}
