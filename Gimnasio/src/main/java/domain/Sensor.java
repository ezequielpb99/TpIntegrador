package domain;

import java.util.List;
import java.util.Random;

public class Sensor {
    public Integer id;
    public Gym ubicacion;
    public String prefijo;
    public int valorDeMedicion;
    public List<Regla> reglas;


    public Sensor(Integer id, Gym ubicacion, String prefijo, int valorDeMedicion, List<Regla> reglas) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.prefijo = prefijo;
        this.valorDeMedicion = valorDeMedicion;
        this.reglas = reglas;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer Id) {
        this.id = id;
    }
    public Gym getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(Gym ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getPrefijo() {
        return prefijo;
    }
    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }
    public int getValorDeMedicion() {
        return valorDeMedicion;
    }
    public void setValorDeMedicion(int valorDeMedicion) {
        this.valorDeMedicion = valorDeMedicion;
    }
    public List<Regla> getReglas() {
        return reglas;
    }
    public void setReglas(List<Regla> reglas) {
        this.reglas = reglas;
    }
    
    
    
    //public void CheckValor(){
        //Checkea de la base de datos el valor que los sensores guardan, se simula con la clase random
        //Random random = new Random();
        //int valorDeMedicion = random.nextInt(100);
        //setValorDeMedicion(valorDeMedicion);
    //}

    public void CheckReglas(){
        for (Regla regla: reglas) {
            regla.seCumpleCon(valorDeMedicion);
        }
    }
    


}
