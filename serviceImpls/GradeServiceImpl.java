package com.grade.web.serviceImpls;

import java.util.Random;

import com.grade.web.daoImpl.GradeDAOImpl;
import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;
import com.grade.web.services.GradeService;

public class GradeServiceImpl implements GradeService{

	private GradeDAO dao;
	
	public GradeServiceImpl() {
	 dao =  new GradeDAOImpl();
	}
	@Override
	public void createGrade(GradeBean param) {
		System.out.println("createGrade*******"+param.toString());
		param.setHakbun( createHakbun(param));
		System.out.println("createGrade==="+param.toString());
		dao.insetGrade(param);
	}
	@Override
	public String createHakbun(GradeBean param) {
		String hakbun = "";
		String flag = "2019-";
		String gander = "";
		String ssn =param.getSsn();
		String num = ssn.substring(6,7);
		gander = num.equals("1") ? "³²" : "¿©";
		Random ran = new Random(10);
		int rnum = ran.nextInt(999)+1;
		hakbun = flag+num+rnum+gander;
		System.out.println(hakbun);
		return hakbun;
	}
}
