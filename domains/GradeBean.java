package com.grade.web.domains;

import java.io.Serializable;

public class GradeBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String  kor, eng, math, society ;
	private int  total , ave;
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAve() {
		return ave;
	}
	public void setAve(int ave) {
		this.ave = ave;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "GradeBean [kor=" + kor + ", eng=" + eng + ", math=" + math + ", society=" + society + ", total=" + total
				+ ", ave=" + ave + "]";
	}
	
	


	
	
	
}
