package com.grade.web.serviceImpls;

import java.util.Random;

import com.grade.web.daoImpl.GradeDAOImpl;
import com.grade.web.daos.GradeDAO;
import com.grade.web.domains.GradeBean;
import com.grade.web.domains.StudentBean;
import com.grade.web.services.GradeService;

public class GradeServiceImpl implements GradeService{

	private GradeDAO dao;
	
	public GradeServiceImpl() {
	 dao =  new GradeDAOImpl();
	}
	@Override
	public void createGrade(GradeBean param) {
		System.out.println("createGrade*******"+param.toString());
		
//		param.setHakbun( createHakbun(param));
		param.setTotal(createTotal(param));
		param.setAve(createAve(param));
		System.out.println("createGrade==="+param.toString());
		dao.insetGrade(param);
	}
	@Override
	public String createHakbun(StudentBean param) {
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
	@Override
	public int createTotal(GradeBean param) {
		int flag = 0;
		int kor = Integer.parseInt(param.getKor());
		int eng =  Integer.parseInt(param.getEng());
		int math = Integer.parseInt(param.getMath());
		int society = Integer.parseInt(param.getSociety());
		flag = kor + eng + math+society;
		return flag;
	}
	@Override
	public int createAve(GradeBean param) {
		int ave = 0;
		int a = createTotal (param);
		ave =a/4 ;
		
		return ave;
	}

}
