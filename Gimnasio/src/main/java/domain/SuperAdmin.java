package domain;

public class SuperAdmin implements TipoDeUsuario {
    public void VerificarPermiso(Integer id){
        if (id == 4){
            System.out.println("Tiene permisos");
        }
        else {
            System.out.println("No tiene permisos");
        }
    }
}
