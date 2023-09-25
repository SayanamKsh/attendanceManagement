package com.ey.attendanceBE.contrller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ey.attendanceBE.entity.Attendance;
import com.ey.attendanceBE.service.AttendanceService;

@RestController
@RequestMapping("/attendance")
@CrossOrigin
public class AttendanceController {

	@Autowired
	AttendanceService attendanceService;
	
	@GetMapping("")
	public ResponseEntity<List<Attendance>> getAllAttendance() {
		return new ResponseEntity<List<Attendance>>(attendanceService.getAllAttendance(), HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<Attendance>> getAllAttendanceOfAnEmp(@PathVariable("id") Long id) {
		return new ResponseEntity<List<Attendance>>(attendanceService.getAllAttendanceOfAnEmp(id), HttpStatus.CREATED);
	}
	
	@PostMapping("/markAnAttendance")
	public ResponseEntity<Attendance> markAttendance(@RequestBody Attendance attendance) {
		return new ResponseEntity<Attendance>(attendanceService.markAttendance(attendance), HttpStatus.CREATED);
	}
	

}
