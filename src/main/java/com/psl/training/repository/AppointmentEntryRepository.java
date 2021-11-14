package com.psl.training.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.psl.training.entity.AppointmentEntry;
import com.psl.training.entity.User;


@Repository
public interface AppointmentEntryRepository extends JpaRepository<AppointmentEntry, Long> {
	
	
//	@Query(value = "select * from appointment_entry where userID=?",nativeQuery=true)
//    public List<AppointmentEntry> getAppointmentByApointee(String appointee);
	
	public List<AppointmentEntry> findByOwner(User owner);
	
	public List<AppointmentEntry> findByAppointee(User apointee);

	@Query(value = "select * from AppointmentEntries where acID=?1 and isApproved=?2",nativeQuery=true)
    public List<AppointmentEntry> findSpecificAppointmentEntry(long acID, Boolean isApproved);
	
	
}
