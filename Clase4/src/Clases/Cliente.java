/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Empleado;
import clase4.Coneccion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class Cliente extends Persona {
private String nit;
Coneccion cn;
    public Cliente() {
    }

    public Cliente(String nit) {
        this.nit = nit;
    }

    public Cliente(String nit, Coneccion cn) {
        this.nit = nit;
        this.cn = cn;
    }

    public Cliente(String nit, Coneccion cn, String nombre, String apelido, String telefono, String direccion, String fechaDeNacimiento) {
        super(nombre, apelido, telefono, direccion, fechaDeNacimiento);
        this.nit = nit;
        this.cn = cn;
    }


    
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
       public int calcularEdad(String fecha){
   Date fechaNac=null;
       try {
          
           fechaNac = new SimpleDateFormat("dd-MM-yyyy").parse(fecha);
       } catch (ParseException | NullPointerException ex) {
           System.out.println("Error:");
       }
      
       Calendar fechaNacimiento = Calendar.getInstance();
       Calendar fechaActual = Calendar.getInstance();
       fechaNacimiento.setTime(fechaNac);
       int año = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
       int mes =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
       int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
       if(mes<0 || (mes==0 && dia<0)){
           año--;
       }
       return año;
   }

      public void Agregar(){}
      public void Modificar(String x){}
      public void Eliminar(String x){}
}
