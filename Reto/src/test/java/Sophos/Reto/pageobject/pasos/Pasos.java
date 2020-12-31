package Sophos.Reto.pageobject.pasos;

import Sophos.Reto.pageobject.Pageobject;

public class Pasos {
	
	Pageobject Pageo;
	
	public void AbrirNavegador() {
		Pageo.open();
	}
	
	public void seleccionarJoinToday () throws InterruptedException {
		Pageo.SeleccionarJoin();
	}
	
	public void FormularioTell (String arg1, String arg2, String arg3, int arg4, int arg5, int arg6) {
		Pageo.IngresarNombre(arg1);
		Pageo.IngresarApellido(arg2);
		Pageo.IngresarEmail(arg3);
		Pageo.IngresarMes(arg4);
		Pageo.IngresarDia(arg5);
		Pageo.IngresarAño(arg6);
	}
	
	public void SeleccionarNextLocation () {
		Pageo.SeleccionarNextLocation();
	}
	
	public void SeleccionarNextMoviles () throws InterruptedException {
		Pageo.seleccionarNextMoviles();
	}
	
	public void SeleccionarLastStep () throws InterruptedException {
		Pageo.SeleccionarLastStep();
	}
	
	public void diligenicarContraseña (String arg1) throws InterruptedException {
		Pageo.DiligenciarContraseña(arg1);
		Pageo.ConfirmarContraseña(arg1);
		Pageo.SeleccionarChecks();
		Pageo.SeleccionarCompleteSetup();
	}
	
	public void VerirficarRegistro () {
		Pageo.VerificarRegistro();
	}

}
