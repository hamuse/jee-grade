package com.grade.web.domains;

import java.io.Serializable;

public class GradeBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String ssn, name, kor, eng, math, society ,hakbun ;
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public String getSociety() {
		return society;
	}
	public void setSociety(String society) {
		this.society = society;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "GradeBean [ssn=" + ssn + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", society=" + society + ", hakbun=" + hakbun + "]";
	}


	
	
	
}
