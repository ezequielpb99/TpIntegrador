package domain;

public class Admin implements TipoDeUsuario {
    public void PermisoVerSensores(Integer id){
        if (id == 1 || id == 2 || id == 3 || id == 4){
            System.out.println("Tiene permisos");
        }
        else {
            System.out.println("No tiene permisos");
        }
    }
    public void PermisoABMConfiguraciones(Integer id){
        if (id == 2 || id == 3 || id == 4){
            System.out.println("Tiene permisos");
        }
        else {
            System.out.println("No tiene permisos");
        }
    }
    public void PermisoABMUsuarios(Integer id){
        if (id == 3 || id == 4){
            System.out.println("Tiene permisos");
        }
        else {
            System.out.println("No tiene permisos");
        }
    }
    public void PermisoABMGimnasios(Integer id){
        if (id == 4){
            System.out.println("Tiene permisos");
        }
        else {
            System.out.println("No tiene permisos");
        }
    }
}
