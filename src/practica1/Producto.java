/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Camilo
 */
public class Producto {
    private String nombre;
    private String cantidad;
    private int precio;
    private int vendidos;
    private int total;

    public Producto(String nombre, String cantidad, int precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.vendidos =0;
        this.total=0;
    }
    public Producto() {
        
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
    public int getVendidos() {
        return vendidos;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void Agregar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite nombre: ");
        nombre = teclado.next();
        System.out.println("Digite Cantidad: ");
        cantidad = teclado.next();
        System.out.println("Digite Precio: ");
        precio = teclado.nextInt();  
    }
    public void Mostrar(){
        /*System.out.println("Nombre: "+nombre+"\n"+
                "apellido: "+apellido+"\n"+
                "edad: "+edad+"\n"+
                "cedula: "+cedula+"\n"+
                "fecha: "+fecha+"\n"+
                "dir: "+dir+"\n"+
                "tel: "+tel+"\n");
    */}

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    public String Show() {
        return "Producto{" + "nombre=" + nombre + ", Ventas=" + vendidos + ", Total Ventas=" + total + '}';
    }
    
}