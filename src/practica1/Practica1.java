/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Camilo Martinez
 */
public class Practica1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion,j=0,cant,suma,i=0;
        String nom = "";
        Scanner teclado = new Scanner(System.in);
        ArrayList<Producto> arrayList = new ArrayList<Producto>();
        
        do{
            System.out.println("Digite la opción deseada");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Buscar Producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Realizar Venta");
            System.out.println("6. Mostrar Ganancias Totales");
            System.out.println("7. Salir");
            opcion = teclado.nextInt();
       
            switch (opcion){
                case 1:
                    Producto producto = null;
                    producto = new Producto();
                    producto.Agregar();
                    arrayList.add(producto);
                    break;
                case 2: 
                    System.out.println("Digite el Nombre a Buscar: ");
                    nom = teclado.next();
                    for(j=0 ; j<arrayList.size();j++){
                        if (nom.equals(arrayList.get(j).getNombre())){
                            System.out.println(arrayList.get(j));
                            break;
                        }
                    }
                    if(j==arrayList.size())System.out.println("No Existe");
                    break;
                case 3: 
                    System.out.println("Digite el Nombre a Buscar: ");
                    nom = teclado.next();
                    for(j=0 ; j<arrayList.size();j++){
                        if (nom.equals(arrayList.get(j).getNombre())){
                            arrayList.remove(j); 
                            i=1;
                        }
                    }
                    if(i==0){
                        System.out.println("No Existe");
                    }
                    break;
                case 4: 
                    if(arrayList.size()!=0){
                        for(j=0 ; j<arrayList.size();j++){
                            System.out.println(arrayList.get(j));
                        }
                    }else
                        System.out.println("No hay Productos");
                            
                      ;
                    break;
                case 5:
                    System.out.println("Digite el Nombre a Buscar: ");
                    nom = teclado.next();
                    for(j=0 ; j<arrayList.size();j++){
                        if (nom.equals(arrayList.get(j).getNombre())){
                            System.out.println("Digite la cantidad de Productos a Vender ");
                            cant = teclado.nextInt();
                            int cant2 =Integer.parseInt(arrayList.get(j).getCantidad());
                            arrayList.get(j).setVendidos(arrayList.get(j).getVendidos()+cant);
                            arrayList.get(j).setTotal(arrayList.get(j).getVendidos()*arrayList.get(j).getPrecio());
                            cant=cant2-cant;
                            arrayList.get(j).setCantidad(String.valueOf(cant));   
                        }
                    }                    
                    break;
                case 6: 
                    suma=0;
                    for(j=0 ; j<arrayList.size();j++){
                        System.out.println(arrayList.get(j).Show());
                        suma = suma + (arrayList.get(j).getPrecio()*arrayList.get(j).getVendidos());
                    }
                    System.out.println("El Valor Total Vendido es: " + suma + "\n");
                    ;
                    break;
                case 7:;
                    break;
                default: System.out.println("Opción invalida");
            }
        }while(opcion!=7);
          
    }
}

