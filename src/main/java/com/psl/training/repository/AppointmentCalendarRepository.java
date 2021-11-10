package com.psl.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psl.training.entity.AppointmentCalendar;

public interface AppointmentCalendarRepository  extends JpaRepository<AppointmentCalendar, Long> {

	public List<AppointmentCalendar> findByuserName(String userName);
	
	public List<AppointmentCalendar> findByType(String type);

	public List<AppointmentCalendar> findByLocation(String location);
	
	public List<AppointmentCalendar> findByUserID(long userId);
}
