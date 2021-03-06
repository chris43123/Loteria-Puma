package Modelo;
// Generated 07-may-2020 20:54:24 by Hibernate Tools 4.3.1


import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javafx.beans.property.SimpleObjectProperty;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javax.imageio.ImageIO;
import javax.persistence.Transient;

/**
 * Tbsucursales generated by hbm2java
 */
public class Tbsucursales  implements java.io.Serializable {


     private Integer codigo;
     private int rtn;
     private String direccion;
     private String nombreSucursal;
     private String responsable;
     private byte[] imagen;
     private Set tbusuarioses = new HashSet(0);
     private Set tbticketheaders = new HashSet(0);
     private SimpleObjectProperty imageView;
     
    public Tbsucursales() {
    }

	
    public Tbsucursales(int codigo) {
        this.codigo = codigo;
    }
    public Tbsucursales(int rtn, String direccion, String nombreSucursal, String responsable, byte[] imagen, Set tbusuarioses, Set tbticketheaders) {
       this.rtn = rtn;
       this.direccion = direccion;
       this.nombreSucursal = nombreSucursal;
       this.responsable = responsable;
       this.imagen = imagen;
       this.tbusuarioses = tbusuarioses;
       this.tbticketheaders = tbticketheaders;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public int getRtn() {
        return this.rtn;
    }
    
    public void setRtn(int rtn) {
        this.rtn = rtn;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNombreSucursal() {
        return this.nombreSucursal;
    }
    
    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }
    public String getResponsable() {
        return this.responsable;
    }
    
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    public byte[] getImagen() {
        return this.imagen;
    }
    
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    public Set getTbusuarioses() {
        return this.tbusuarioses;
    }
    
    public void setTbusuarioses(Set tbusuarioses) {
        this.tbusuarioses = tbusuarioses;
    }
    public Set getTbticketheaders() {
        return this.tbticketheaders;
    }
    
    public void setTbticketheaders(Set tbticketheaders) {
        this.tbticketheaders = tbticketheaders;
    }

    @Transient
    public Image getImageView() {
        Image img = new Image(new ByteArrayInputStream(imagen));        
        return img;        
    }


    public void setImageView(Image image) {  
        if (image == null) {
            setImagen("0".getBytes());
            return;
        }

        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();

        try {
            ImageIO.write(bImage, "png", stream);
            byte[] bytes  = stream.toByteArray();
            stream.close();
            setImagen(bytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //imageView.set(image);
    }

    public SimpleObjectProperty imageViewProperty() {   
        return imageView;
    }    

    @Override
    public String toString()
    {
        return this.nombreSucursal;
    }
}


