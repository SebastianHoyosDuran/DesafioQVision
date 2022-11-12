package stepsDefinitions;

import cucumber.api.java.en.*;
import driver.GoogleChromeDriver;
import steps.CrearArticulo;
import steps.IrInicio;
import steps.Registrarse;
import steps.Loguearse;

public class PruebaTecnicaStepsDefinitions {

    //Impors de los steps

    IrInicio irInicio = new IrInicio();
    Registrarse registrarse = new Registrarse();

    Loguearse loguearse = new Loguearse();

    CrearArticulo crearArticulo = new CrearArticulo();


    //variables



    @Given("^el usuario se encuentra en la pagina$")
    public void el_usuario_se_encuentra_en_la_pagina() {

        irInicio.abrirNavegador("https://angular.realworld.io/");
    }


    @When("^el usuario se registre$")
    public void el_usuario_se_registre() {

        registrarse.registrarse();
    }

    @Then("^podra ingresar el usuario$")
    public void podra_ingresar_el_usuario() throws InterruptedException {
        registrarse.validarRegistro();
    }


    @When("^el usuario se loguea$")
    public void el_usuario_se_loguea() {
        loguearse.loguearse();
    }


    @Then("^podra validar que esta logueado$")
    public void podra_validar_que_esta_logueado() throws InterruptedException {
        loguearse.validarLogueo();
    }


    @When("^el usuario cree un articulo$")
    public void el_usuario_cree_un_articulo() throws InterruptedException {
        crearArticulo.crearArticulo();

    }

    @Then("^podra validar la creacion del articulo$")
    public void podra_validar_la_creacion_del_articulo() {
        crearArticulo.validarCreacionArticulo();
    }

}
