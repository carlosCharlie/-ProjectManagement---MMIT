package com.mmit.negocio.usuarios;

public class UsuarioTrans {

    private String nombre;
    private String password;
    private boolean admin;
    private Integer id;

   

    /**
     * Inicia una nueva sesion
     * @param id id del usuario
     * @param nombre nombre del usuario
     * @param password password del usuario
     * @param admin permisos del usuario
     */
    
    public UsuarioTrans(String usuario, String password) {
        this.nombre = usuario;
        this.password = password;
    }
    
    public UsuarioTrans(int id,String nombre,String password,boolean admin)
    {
        this.id = id;
        this.nombre=nombre;
        this.password=password;
        this.admin=admin;
    }
    public void setId(Integer id){
        this.id = id;
    }
    
    public Integer getId(){
        return id;
    }
    
    public void setAdmin(boolean admin){
        this.admin = admin;
    }
    /**
     * Indica si la sesion actual tiene permisos de administrador 
     * @return true si es administrador, false si no
     */
    public boolean getAdmin(){
        return admin;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Devuelve el nombre del usuario
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    public void setPassword(String password){
        this.password = password;
    }
    /**
     * Devuelve la password del usuario
     * @return password
     */
    public String getPassword() {
        return password;
    }
    
}
