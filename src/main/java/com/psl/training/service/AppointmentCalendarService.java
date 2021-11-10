package com.psl.training.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.psl.training.entity.AppointmentCalendar;
import com.psl.training.repository.AppointmentCalendarRepository;

@Service
public class AppointmentCalendarService {

	@Autowired
	AppointmentCalendarRepository repository;
	
	public void insertAppointmentCalendar(AppointmentCalendar object)
	{
		repository.save(object);
	}
	
	public void updateAppointmentCalendar(AppointmentCalendar object)
	{
		repository.save(object);
	}
	
	public void deleteAppointmentCalendarById(long acID)
	{
		repository.deleteById(acID);
	}
	
	public AppointmentCalendar getAppointmentCalendarById(long acID)
	{
		//return new object which is not found
		return repository.findById(acID).orElseThrow(IllegalArgumentException::new);
	}
	
	public List<AppointmentCalendar> getAppointmentCalendarByUserName (String userName ) {
		return repository.findByuserName(userName);
	}
	
	public List<AppointmentCalendar> getAppointmentCalendarByType (String type ) {
		return repository.findByType(type);
	}
	
	public List<AppointmentCalendar> getAppointmentCalendarByLocation (String location ) {
		return repository.findByLocation(location);
	}
	
	public List<AppointmentCalendar> getAppointmentCalendarByUserID (long userId ) {
		return repository.findByUserID(userId);
	}
	
	
}
