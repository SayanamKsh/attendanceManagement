package com.ey.attendanceBE.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ey.attendanceBE.entity.Attendance;

@Repository
public interface AttendanceRepo extends JpaRepository<Attendance, Long>{

	List<Attendance> findByEmpId(Long id);

}
