package Sophos.Reto.definitions;

import Sophos.Reto.pageobject.pasos.Pasos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Definitions {
	
	@Steps
	Pasos paso;
	
	@Given("^Ingresar a la pagina web$")
	public void ingresar_a_la_pagina_web() {
	   paso.AbrirNavegador();
	}


	@When("^seleccionar Join Today$")
	public void seleccionar_Join_Today() throws InterruptedException {
		paso.seleccionarJoinToday();
	}

	@When("^Diligenciar Teel us \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" (\\d+) (\\d+) (\\d+)$")
	public void diligenciar_Teel_us(String arg1, String arg2, String arg3, int arg4, int arg5, int arg6) {
	    paso.FormularioTell(arg1, arg2, arg3, arg4, arg5, arg6);
	    paso.SeleccionarNextLocation();
	}

	@When("^Seleccionar Nextdevices$")
	public void seleccionar_Nextdevices() throws InterruptedException {
		paso.SeleccionarNextMoviles();
	}

	@When("^Diligenciar Movil$")
	public void diligenciar_Movil() throws InterruptedException {
	    paso.SeleccionarLastStep();
	}

	@When("^Diligenciar contraseña \"([^\"]*)\"$")
	public void diligenciar_contraseña(String arg1) throws InterruptedException {
	   paso.diligenicarContraseña(arg1);
	}

	@Then("^Verificar que se ha registrado$")
	public void verificar_que_se_ha_registrado() {
	  paso.VerirficarRegistro();
	}

}
