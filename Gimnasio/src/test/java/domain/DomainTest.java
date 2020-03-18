package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DomainTest {
    //Gyms
    private Gym Lugano;
    private Gym Belgrano;

    //Usuarios
    private Usuario Visualizador1;
    private Usuario Visualizador2;
    private Usuario Visualizador3;
    private Usuario Configurador1;
    private Usuario Configurador2;
    private Usuario Configurador3;
    private Usuario Admin1;
    private Usuario Admin2;
    private Usuario Admin3;
    private Usuario SuperAdmin;


    private Usuario Visualizador4;

    //Tipos de Usuario
    private Visualizador visualizador;
    private Configurador configurador;
    private Admin admin;
    private SuperAdmin superAdmin;

    //Reglas
    private Regla regla1;
    private Regla regla2;
    private Regla regla3;
    private Regla regla4;

    //Acciones
    private Accion accion1;
    private Accion accion2;
    private Accion accion3;
    private Accion accion4;

    //Actuadores
    private Actuador actuador1;
    private Actuador actuador2;

    //Alertas
    private Alerta alerta1;
    private Alerta alerta2;
    private Alerta alerta3;
    private Alerta alerta4;

    //Sensores
    private Sensor sensor1;
    private Sensor sensor2;




    @Before
    public void Init(){

        this.Lugano = new Gym("Lugano", 12345);
        this.Belgrano = new Gym("Belgrano", 123456);

        //Tipos de Usuario
        this.visualizador = new Visualizador();
        this.configurador = new Configurador();
        this.admin = new Admin();
        this.superAdmin = new SuperAdmin();

        //Usuarios
        this.Visualizador1 = new Usuario(123, 1, "usr1", "psw1", visualizador);
        this.Visualizador2 = new Usuario(124, 1, "usr2", "psw2", visualizador);
        this.Configurador1 = new Usuario(125, 2, "usr3", "psw3", configurador);
        this.Admin1 = new Usuario(126, 3, "usr4", "psw4", admin);

        this.Visualizador3 = new Usuario(1234, 1, "usr5", "psw5", visualizador);
        this.Configurador2 = new Usuario(1235, 2, "usr6", "psw6", visualizador);
        this.Configurador3 = new Usuario(1236, 2, "usr7", "psw7", configurador);
        this.Admin2 = new Usuario(1237, 3, "usr8", "psw8", admin);
        this.Admin3 = new Usuario(1238, 3, "usr9", "psw9", admin);

        this.SuperAdmin = new Usuario(12345, 4, "supUsr", "supPsw", superAdmin);


        this.Visualizador4 = new Usuario(124123123, 5, "usr2", "psw2", visualizador);

        //Sensores
        this.sensor1 = new Sensor(124, Lugano, "°C", 20);
        this.sensor2 = new Sensor(125, Belgrano, "°C", 38);

        //Actuadores
        this.actuador1 = new Actuador(1245, false);
        this.actuador2 = new Actuador(1246, false);

        //Acciones
        this.accion1 = new Accion(123, "Apertura de valvula para calentar el agua", actuador1);
        this.accion2 = new Accion(124, "Cierre de valvula para calentar el agua", actuador1);
        this.accion3 = new Accion(125, "Apertura de valvula para enfriar el agua", actuador2);
        this.accion4 = new Accion(126, "Cierre de valvula para enfriar el agua", actuador2);

        //Alertas
        this.alerta1 = new Alerta(123, "Temperatura del agua baja, suministro de agua caliente en proceso", Configurador1);
        this.alerta2 = new Alerta(124, "Suministro de agua caliente finalizado", Configurador1);
        this.alerta3 = new Alerta(125, "Temperatura del agua alta, suministro de agua fria en proceso", Configurador2);
        this.alerta4 = new Alerta(126, "Suministro de agua fria finalizado", Configurador2);

        //Reglas
        this.regla1 = new Regla(123,"Si la temp llega a los 20° abrir agua caliente", accion1, 20, alerta1 );
        this.regla2 = new Regla(124,"Si la temp llega a los 38° cerrar agua caliente", accion2, 38, alerta2 );
        this.regla3 = new Regla(125,"Si la temp llega a los 38° abrir agua fria", accion3, 38, alerta3 );
        this.regla4 = new Regla(126,"Si la temp llega a los 20° cerrar agua fria", accion4, 20, alerta4 );

    }

     @Test
    public void Permisos(){

        sensor1.addRegla(regla1);
        sensor1.addRegla(regla2);
        sensor2.addRegla(regla3);
        sensor2.addRegla(regla4);

        Lugano.addActuador(actuador1);
        Lugano.addRegla(regla1);
        Lugano.addRegla(regla2);
        Lugano.addSensor(sensor1);
        Belgrano.addActuador(actuador2);
        Belgrano.addRegla(regla3);
        Belgrano.addRegla(regla4);
        Belgrano.addSensor(sensor2);

        Visualizador1.addGym(Lugano);
        Visualizador2.addGym(Lugano);
        Visualizador3.addGym(Belgrano);
        Configurador1.addGym(Lugano);
        Configurador2.addGym(Belgrano);
        Configurador3.addGym(Belgrano);
        Admin1.addGym(Lugano);
        Admin2.addGym(Belgrano);
        Admin3.addGym(Belgrano);
        SuperAdmin.addGym(Lugano);
        SuperAdmin.addGym(Belgrano);

        //this.Visualizador1.VerSensores();
        this.Visualizador2.VerSensores();
        this.Visualizador3.VerSensores();
        this.Visualizador1.ABMConfiguraciones();
        this.Visualizador1.ABMGimnasios();
        this.Visualizador1.ABMUsuarios();
        this.Visualizador4.VerSensores();

        this.Configurador1.VerSensores();
        this.Configurador1.ABMUsuarios();
        this.Configurador1.ABMConfiguraciones();
        this.Configurador1.ABMGimnasios();
        this.Configurador2.VerSensores();
        this.Configurador2.ABMUsuarios();
        this.Configurador2.ABMConfiguraciones();
        this.Configurador2.ABMGimnasios();
        this.Configurador3.VerSensores();
        this.Configurador3.ABMUsuarios();
        this.Configurador3.ABMConfiguraciones();
        this.Configurador3.ABMGimnasios();

        this.Admin1.VerSensores();
        this.Admin1.ABMUsuarios();
        this.Admin1.ABMConfiguraciones();
        this.Admin1.ABMGimnasios();
        this.Admin2.VerSensores();
        this.Admin2.ABMUsuarios();
        this.Admin2.ABMConfiguraciones();
        this.Admin2.ABMGimnasios();
        this.Admin3.VerSensores();
        this.Admin3.ABMUsuarios();
        this.Admin3.ABMConfiguraciones();
        this.Admin3.ABMGimnasios();

        this.SuperAdmin.VerSensores();
        this.SuperAdmin.ABMUsuarios();
        this.SuperAdmin.ABMConfiguraciones();
        this.SuperAdmin.ABMGimnasios();
     }

     @Test
    public void CheckSensores(){


         sensor1.addRegla(regla1);
         sensor1.addRegla(regla2);
         sensor2.addRegla(regla3);
         sensor2.addRegla(regla4);

         Lugano.addActuador(actuador1);
         Lugano.addRegla(regla1);
         Lugano.addRegla(regla2);
         Lugano.addSensor(sensor1);
         Belgrano.addActuador(actuador2);
         Belgrano.addRegla(regla3);
         Belgrano.addRegla(regla4);
         Belgrano.addSensor(sensor2);

         Visualizador1.addGym(Lugano);
         Visualizador2.addGym(Lugano);
         Visualizador3.addGym(Belgrano);
         Configurador1.addGym(Lugano);
         Configurador2.addGym(Belgrano);
         Configurador3.addGym(Belgrano);
         Admin1.addGym(Lugano);
         Admin2.addGym(Belgrano);
         Admin3.addGym(Belgrano);
         SuperAdmin.addGym(Lugano);
         SuperAdmin.addGym(Belgrano);


        sensor1.CheckReglas();
        sensor1.setValorDeMedicion(38);
        sensor1.CheckReglas();
        sensor2.CheckReglas();
        sensor2.setValorDeMedicion(20);
        sensor2.CheckReglas();
     }

}


