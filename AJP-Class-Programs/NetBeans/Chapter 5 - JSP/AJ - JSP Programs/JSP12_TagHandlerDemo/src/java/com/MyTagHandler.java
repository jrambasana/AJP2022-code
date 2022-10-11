package com;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends SimpleTagSupport {
    public void doTag() throws IOException, JspException {
        getJspContext().getOut().append("Hello Simple Tag handler here... Today is " + new Date());
    }
}
