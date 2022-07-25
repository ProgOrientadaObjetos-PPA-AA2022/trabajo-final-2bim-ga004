/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;
import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import paquete02.PlanPostPagoMinutosMegasEconomico;

/**
 *
 * @author jpvpv
 */
public class EnlacePlanPostPagoMinutosMegasEconomico {
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            String url = "jdbc:sqlite:bd/base04.db";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarPlan(PlanPostPagoMinutosMegasEconomico plan) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            plan.calcularPagoMensual();
            String data = String.format("INSERT INTO tabla4 (nombresPropietario,"
                    + " cedulaPropietario, ciudadPropietario, marcaCelular, "
                    + "modeloCelular, minutos, costoMinuto, megasEngigas, "
                    + "costoGiga, descuento, pagoMensual) "
                    + "values ('%s', '%s', '%s', '%s', '%s', %s,  %s,  %s,  %s,  %s,  %s)", 
                    plan.obtenerNombresPropietario(), 
                    plan.obtenerCedulaPropietario(), 
                    plan.obtenerCiudadPropietario(), 
                    plan.obtenerMarcaCelular(), 
                    plan.obtenerModeloCelular(), 
                    plan.obtenerMinutos(), 
                    plan.obtenerCostoMinuto(), 
                    plan.obtenerMegasEnGigas(), 
                    plan.obtenerCostoGiga(), 
                    plan.obtenerDescuento(),
                    plan.obtenerPagoMensual());
            
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarPlan");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<PlanPostPagoMinutosMegasEconomico> obtenerDataPlan() {  
        ArrayList<PlanPostPagoMinutosMegasEconomico> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from tabla4";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                PlanPostPagoMinutosMegasEconomico miPlan = new PlanPostPagoMinutosMegasEconomico(
                        rs.getDouble("minutos"),
                        rs.getDouble("costoMinuto"),
                        rs.getDouble("megasEnGigas"),
                        rs.getDouble("costoGiga"),
                        rs.getString("nombresPropietario"),
                        rs.getString("cedulaPropietario"),
                        rs.getString("ciudadPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular")
                );
                miPlan.calcularPagoMensual();
                lista.add(miPlan);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarPlan");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
    
     
}
