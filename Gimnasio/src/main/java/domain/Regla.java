package domain;

import java.util.List;
import java.util.Random;

public class Regla {
    public Integer id;
    public String descripccion;
    public Accion unaAccion;
    public double valorLimite;
    public Alerta unaAlerta;

    public Regla(Integer id, String descripccion, Accion unaAccion, double valorLimite, Alerta unaAlerta) {
        this.id = id;
        this.descripccion = descripccion;
        this.unaAccion = unaAccion;
        this.valorLimite = valorLimite;
        this.unaAlerta = unaAlerta;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescripccion() {
        return descripccion;
    }
    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }
    public Accion getUnaAccion() {
        return unaAccion;
    }
    public void setUnaAccion(Accion unaAccion) {
        this.unaAccion = unaAccion;
    }
    public double getValorLimite() {
        return valorLimite;
    }
    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }



    public void seCumpleCon(int unValor){
        if (unValor == valorLimite){
            ejecutaAccion();
        }
    }
    public void ejecutaAccion(){
        unaAlerta.NotificaUsuario();
        unaAccion.Accionar();
    }


}
