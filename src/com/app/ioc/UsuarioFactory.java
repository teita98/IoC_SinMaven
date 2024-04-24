package com.app.ioc;

public class UsuarioFactory {

    IUsuario usr;

    public UsuarioFactory(IUsuario usr){
        this.usr = usr;
    }
    public void insertaUsuario(){
        usr.insertaUsuario();
    }
    public void eliminaUsuariobyId(int id){
        usr.eliminaUsuariobyId(id);
    }
}
