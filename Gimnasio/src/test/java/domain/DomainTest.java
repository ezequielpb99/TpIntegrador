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
        //Listas
        List<Usuario> usuarios = new ArrayList<>();
        List<Usuario> usuarios2 = new ArrayList<>();
        usuarios.add(Visualizador1);
        usuarios.add(Visualizador2);
        usuarios.add(Configurador1);
        usuarios.add(Admin1);
        usuarios2.add(Visualizador3);
        usuarios2.add(Configurador2);
        usuarios2.add(Configurador3);
        usuarios2.add(Admin2);
        usuarios2.add(Admin3);
        List<Regla> reglas = new ArrayList<>();
        List<Regla> reglas2 = new ArrayList<>();
        reglas.add(regla1);
        reglas.add(regla2);
        reglas2.add(regla3);
        reglas2.add(regla4);
        List<Actuador> actuadores = new ArrayList<>();
        List<Actuador> actuadores2 = new ArrayList<>();
        actuadores.add(actuador1);
        actuadores2.add(actuador2);
        List<Gym> gimnasiosInd1 = new ArrayList<>();
        List<Gym> gimnasiosInd2 = new ArrayList<>();
        List<Gym> gimnasios = new ArrayList<>();
        gimnasios.add(Lugano);
        gimnasios.add(Belgrano);
        gimnasiosInd1.add(Lugano);
        gimnasiosInd2.add(Belgrano);

        //Gyms
        this.Lugano = new Gym(usuarios, reglas, actuadores, "Lugano", 12345);
        this.Belgrano = new Gym(usuarios2, reglas2, actuadores2, "Belgrano", 123456);

        //Usuarios
        this.Visualizador1 = new Usuario(123, 1, "usr1", "psw1", visualizador,gimnasiosInd1);
        this.Visualizador2 = new Usuario(124, 1, "usr2", "psw2", visualizador, gimnasiosInd1);
        this.Configurador1 = new Usuario(125, 2, "usr3", "psw3", configurador,gimnasiosInd1);
        this.Admin1 = new Usuario(126, 3, "usr4", "psw4", admin, gimnasiosInd1);

        this.Visualizador3 = new Usuario(1234, 1, "usr5", "psw5", visualizador,gimnasiosInd2);
        this.Configurador2 = new Usuario(1235, 2, "usr6", "psw6", visualizador, gimnasiosInd2);
        this.Configurador3 = new Usuario(1236, 2, "usr7", "psw7", configurador,gimnasiosInd2);
        this.Admin2 = new Usuario(1237, 3, "usr8", "psw8", admin, gimnasiosInd2);
        this.Admin3 = new Usuario(1238, 3, "usr9", "psw9", admin, gimnasiosInd2);

        this.SuperAdmin = new Usuario(12345, 4, "supUsr", "supPsw", superAdmin, gimnasios);


        this.Visualizador4 = new Usuario(124123123, 5, "usr2", "psw2", visualizador, gimnasiosInd1);

        //Reglas
        this.regla1 = new Regla(123,"Si la temp llega a los 20° abrir agua caliente", accion1, 20, alerta1 );
        this.regla2 = new Regla(124,"Si la temp llega a los 38° cerrar agua caliente", accion2, 38, alerta2 );
        this.regla3 = new Regla(125,"Si la temp llega a los 38° abrir agua fria", accion3, 38, alerta3 );
        this.regla4 = new Regla(126,"Si la temp llega a los 20° cerrar agua fria", accion4, 20, alerta4 );

        //Acciones
        this.accion1 = new Accion(123, "Apertura de valvula para calentar el agua", actuador1);
        this.accion2 = new Accion(124, "Cierre de valvula para calentar el agua", actuador1);
        this.accion3 = new Accion(125, "Apertura de valvula para enfriar el agua", actuador2);
        this.accion4 = new Accion(126, "Cierre de valvula para enfriar el agua", actuador2);

        //Alertas
        this.alerta1 = new Alerta(123, "Temperatura del agua baja, suministro de agua caliente en proceso", Configurador1);
        this.alerta1 = new Alerta(124, "Suministro de agua caliente finalizado", Configurador1);
        this.alerta1 = new Alerta(125, "Temperatura del agua alta, suministro de agua fria en proceso", Configurador2);
        this.alerta1 = new Alerta(126, "Suministro de agua fria finalizado", Configurador2);

        //Sensores
        this.sensor1 = new Sensor(124, Lugano, "°C", 20, reglas);
        this.sensor2 = new Sensor(125, Belgrano, "°C", 38, reglas2);
     }

     @Test
    public void Permisos(){
        this.Visualizador1.VerSensores();
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
        sensor1.CheckReglas();
        sensor1.setValorDeMedicion(38);
        sensor1.CheckReglas();
        sensor2.CheckReglas();
        sensor2.setValorDeMedicion(20);
        sensor2.CheckReglas();
     }

}


