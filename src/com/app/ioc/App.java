package com.app.ioc;

public class App {
    public static void main(String[] args) {
        //generamos la inyeccion de dependencia
        //1. implementamos de IntelliJ
        //2. IoC se hace camiando solo usuarioImpMongo en vez de IntelliJ)
        //UsuarioFactory obj = new UsuarioFactory(new UsuarioImplIntelliJ());
        UsuarioFactory obj = new UsuarioFactory(new UsuarioImplMongo());

        obj.insertaUsuario();
        obj.eliminaUsuariobyId(1);

    }
}
