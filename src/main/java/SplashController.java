package main.java;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="splashController", eager=true)
@RequestScoped
public class SplashController {
	
	@ManagedProperty(value="#{message}")
	private Heck messageBean;
	private String message;
	
	public SplashController() {	
		message = "Default message.";
		System.out.println(this.getClass() + " has started!");
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessageBean(Heck messageBean) {
		this.messageBean = messageBean;
		this.message = messageBean.getMessage();
	}
}