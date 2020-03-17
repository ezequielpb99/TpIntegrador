package domain;

public class Admin implements TipoDeUsuario {
    public void VerificarPermiso(Integer id){
        if (id == 3 || id == 4){
            System.out.println("Tiene permisos");
        }
        else {
            System.out.println("No tiene permisos");
        }
    }
}
