package com.uca.capas.TareaLabo4.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {

	@AssertTrue(message="Usted no puede agregar un producto porque es un robot. Haga click en regresar.")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
	public Robot() {
		
	}
	
}
