package Modelo;
// Generated 01-jun-2020 14:41:13 by Hibernate Tools 4.3.1



/**
 * Tbusuarios generated by hbm2java
 */
public class Tbusuarios  implements java.io.Serializable {


     private Integer userId;
     private Tbsucursales tbsucursales;
     private String userName;
     private String userPassword;
     private String userRole;
     
     private String SucursalNombre;

    public Tbusuarios() {
    }

	
    public Tbusuarios(String userName, String userPassword, String userRole) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }
    public Tbusuarios(Tbsucursales tbsucursales, String userName, String userPassword, String userRole) {
       this.tbsucursales = tbsucursales;
       this.userName = userName;
       this.userPassword = userPassword;
       this.userRole = userRole;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Tbsucursales getTbsucursales() {
        return this.tbsucursales;
    }
    
    public void setTbsucursales(Tbsucursales tbsucursales) {
        this.tbsucursales = tbsucursales;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return this.userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserRole() {
        return this.userRole;
    }
    
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getSucursalNombre() {
        return SucursalNombre;
    }

    public void setSucursalNombre(String SucursalNombre) {
        this.SucursalNombre = SucursalNombre;
    }

    
}


