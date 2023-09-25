package com.ey.attendanceBE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.attendanceBE.Repo.AttendanceRepo;
import com.ey.attendanceBE.entity.Attendance;

@Service
public class AttendanceService {

	@Autowired
	AttendanceRepo attendanceRepo;
	public Attendance markAttendance(Attendance attendance) {
		return attendanceRepo.save(attendance);
	}
	public List<Attendance> getAllAttendanceOfAnEmp(Long id) {
		return attendanceRepo.findByEmpId(id);
	}
	public List<Attendance> getAllAttendance() {
		return attendanceRepo.findAll();
	}

}
