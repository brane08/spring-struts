package org.brane.struts.actions;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Action("hello")
public class HelloAction extends ActionSupport {

    public String execute() {
        return SUCCESS;
    }
}
