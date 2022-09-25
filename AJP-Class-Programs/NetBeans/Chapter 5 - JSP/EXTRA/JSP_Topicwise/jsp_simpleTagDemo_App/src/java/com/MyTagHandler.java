/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.util.Calendar;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author heman
 */
public class MyTagHandler extends SimpleTagSupport {
    public void doTag() throws IOException, JspException {
    getJspContext().getOut().append("Hello from a simple tag handler!!");
  }
}
