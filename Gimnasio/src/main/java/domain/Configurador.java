package domain;

public class Configurador implements TipoDeUsuario {
    public void VerificarPermiso(Integer id){
        if (id == 2 || id == 3 || id == 4){
            System.out.println("Tiene permisos");
        }
        else {
            System.out.println("No tiene permisos");
        }
    }
}
