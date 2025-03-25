package com.test;

import java.sql.Date;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport
{
	@Override
	public int doStartTag() {
	{
		JspWriter out = null;
		try
		{
			out = pageContext.getOut();
			
			Date d = new Date(0);
			out.println("Current System Date : "+d);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
	}
	
}
