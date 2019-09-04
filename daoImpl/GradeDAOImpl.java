package com.grade.web.daoImpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;

public class GradeDAOImpl implements GradeDAO {
	public static final String FILE_PATH= String.format("C:%sUsers%suser%seclipse-jee%sjee-grade%sWebContent%sresources%stxt%s",
			//C:%sUsers%suser%seclipse-jee%sjee-grade%sWebContent%sresources%stxt
File.separator,
File.separator,
File.separator,
File.separator,
File.separator,
File.separator,
File.separator,
File.separator); 

	@Override
	public void insetGrade(GradeBean param) {
		System.out.println("insetGrade");
		try {
			File file = new File( FILE_PATH+"grade.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			writer.write(String.format("이름: %s,주민번호: %s, 학번: %s, 국어:  %s, 수학: %s,영어: %s,사회: %s,총점: %s,평균: %s",
//					param.getName(),param.getSsn(),param.getHakbun(),
					param.getKor(),param.getMath(),param.getEng(),param.getSociety(),param.getTotal(),param.getAve()));
			
			//getName,getHakbun,getKor,getMath,getSociety,getEng,getSsn,
			//writer.write();
			writer.newLine();
			writer.flush();
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
