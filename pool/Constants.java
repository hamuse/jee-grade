package com.grade.web.pool;
import java.io.File;

public class Constants { //상수만 관리하는 클레스 
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
	public static final String VIEW_PATH = "WEB-INF/views/%s/%s.jsp";
	
}
