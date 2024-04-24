package com.app.ioc;

public class UsuarioImplIntelliJ implements IUsuario{

    public void insertaUsuario() {
        System.out.println("Insertando Usuario en IntelliJ");
    }

    public void eliminaUsuariobyId(int id) {
        System.out.println("Eliminando Usuario en IntelliJ: " + id);

    }
}
