package com.grade.web.services;

import com.grade.web.domains.GradeBean;
import com.grade.web.domains.StudentBean;

public interface GradeService {
	 public void createGrade(GradeBean param);
	 public String createHakbun(StudentBean param);
	 public int createTotal(GradeBean param);
	 public int createAve(GradeBean param);
}
