package com.app.ioc;

public class UsuarioImplMongo implements IUsuario{
    public void insertaUsuario() {
        System.out.println("Insertando Usuario en Mongo");

    }

    public void eliminaUsuariobyId(int id) {
        System.out.println("Eliminando Usuario en Mongo: " + id);

    }
}
