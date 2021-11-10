package com.psl.training.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "AppointmentCalendars", uniqueConstraints = {@UniqueConstraint(columnNames = {"acID", "userID", "userName"})})
public class AppointmentCalendar {

	@Id
	@Column(nullable = false)
	private long acID;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Users.userID")
	private long userID;
	
	@Column(nullable = false)
	private String userName;
	
	@Column(nullable = false)
	private String type;
	
	@Column(nullable = false)
	private String location;
	
	@Column(nullable = false)
	private String description;

	@OneToMany(mappedBy = "aeID", fetch = FetchType.LAZY, orphanRemoval = true)
	private List<AppointmentEntry> listAppointmentEntry = new ArrayList<AppointmentEntry>();
	
	
	public AppointmentCalendar() {
		// TODO Auto-generated constructor stub
	}

	public AppointmentCalendar(long acID, long userID, String userName, String type, String location,
			String description, List<AppointmentEntry> listAppointmentEntry) {
		super();
		this.acID = acID;
		this.userID = userID;
		this.userName = userName;
		this.type = type;
		this.location = location;
		this.description = description;
		this.listAppointmentEntry = listAppointmentEntry;
	}

	public long getAcID() {
		return acID;
	}


	public void setAcID(long acID) {
		this.acID = acID;
	}


	public long getUserID() {
		return userID;
	}


	public void setUserID(long userID) {
		this.userID = userID;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<AppointmentEntry> getListAppointmentEntry() {
		return listAppointmentEntry;
	}


	public void setListAppointmentEntry(List<AppointmentEntry> listAppointmentEntry) {
		this.listAppointmentEntry = listAppointmentEntry;
	}
	
}
