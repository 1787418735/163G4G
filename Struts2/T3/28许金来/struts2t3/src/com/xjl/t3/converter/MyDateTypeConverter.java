package com.xjl.t3.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.util.ValueStack;

public class MyDateTypeConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年-MM月-dd日");
		Date date = null;
		try {
			date = sdf.parse(arg1[0]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return date;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年-MM月-dd日");		
		Date date = null;
		return sdf.format(date);
	}

}
