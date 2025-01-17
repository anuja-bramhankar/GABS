package com.psl.training.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Users", uniqueConstraints = {@UniqueConstraint(columnNames = {"userID", "userName", "mobileNumber"})})
public class User {
	
		@Id
		@Column(nullable = false)
		private long userID;
		
		@Column(nullable = false)
		private String userName;
		
		@Column(nullable = false)
		private String mobileNumber;
		
		@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
		@Column(nullable = false)
		private LocalDate DoB;
		
		@Column(nullable = false)
		private String email;
		
		@Column(nullable = false)
		private boolean isAdmin;
		
		@Column(nullable = false)
		private String password; 
		
		@JsonManagedReference
		@OneToMany(mappedBy = "appointee")
		private Set<AppointmentEntry> appointmentEntries;
		
		@JsonManagedReference
		@OneToMany(mappedBy = "owner")
		private Set<AppointmentCalendar> appointmentCalendars;
		
		
		public  User() {
			
		}

		public User(long userID, String userName, String mobileNumber, LocalDate doB, String email, boolean isAdmin,
				String password, Set<AppointmentEntry> appointmentEntries,
				Set<AppointmentCalendar> appointmentCalendars) {
			super();
			this.userID = userID;
			this.userName = userName;
			this.mobileNumber = mobileNumber;
			this.DoB = doB;
			this.email = email;
			this.isAdmin = isAdmin;
			this.password = password;
			this.appointmentEntries = appointmentEntries;
			this.appointmentCalendars = appointmentCalendars;
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


		public String getMobileNumber() {
			return mobileNumber;
		}


		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}


		public LocalDate getDoB() {
			return DoB;
		}


		public void setDoB(LocalDate doB) {
			DoB = doB;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public boolean isAdmin() {
			return isAdmin;
		}


		public void setAdmin(boolean isAdmin) {
			this.isAdmin = isAdmin;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public Set<AppointmentEntry> getAppointmentEntries() {
			return appointmentEntries;
		}


		public void setAppointmentEntries(Set<AppointmentEntry> appointmentEntries) {
			this.appointmentEntries = appointmentEntries;
		}


		public Set<AppointmentCalendar> getAppointmentCalendars() {
			return appointmentCalendars;
		}


		public void setAppointmentCalendars(Set<AppointmentCalendar> appointmentCalendars) {
			this.appointmentCalendars = appointmentCalendars;
		}


		
		
		
		
}

		
   
