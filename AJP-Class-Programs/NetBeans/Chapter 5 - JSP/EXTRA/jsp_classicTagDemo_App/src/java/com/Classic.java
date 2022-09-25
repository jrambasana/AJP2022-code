/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author heman
 */
public class Classic extends TagSupport {

    private int counter;
  public int doStartTag() throws JspException {
    counter = 1;
    return EVAL_BODY_INCLUDE;
  }
  public int doAfterBody() throws JspException {
    while (counter < 3) {
      counter++;
      return EVAL_BODY_AGAIN;
    }
    return SKIP_BODY;
  }
  
}
