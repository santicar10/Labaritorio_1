package co.edu.cue.laboratorio1;


import javax.swing.*;
import java.util.Objects;

public class Empresa {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1,"juanito","juanito@gmail.com",5);
        Empleado empleado2 = new Empleado(2,"ana","ana@gmail.com",10);
        Empleado empleado3 = new Empleado(3,"Gerardo","gerardo@gmail.com",1);

        Empleado empleado[]= new Empleado[3];
        empleado[0]=empleado1;
        empleado[1]=empleado2;
        empleado[2]=empleado3;

        Cliente cliente1 = new Cliente(10084324,"cedula","alberto","masculino","armenia");
        Cliente cliente2 = new Cliente(10084325,"pasaporte","juanita","femenino","cali");

        Producto producto1 = new Producto("100","vestido matrimonio de diseñador",5,"disponible",1500000);
        Producto producto2 = new Producto("101","esmoquin de diseñador LV",3,"disponible",1600000);
        Producto producto3 = new Producto("103","vestidos de fiesta de diseñador",20,"disponible",500000);

        Producto producto[]= new Producto[3];
        producto[0]=producto1;
        producto[1]=producto2;
        producto[2]=producto3;


        for (int i = 0;i < empleado.length; i++){
            String atendedor = empleado[i].getNombre();
        }

        int x = 0;

       while (x == 0){
           String menu1 = JOptionPane.showInputDialog("1-cliente \n 2-empleado");
           switch (menu1){
               case "1":
                   String usuario = JOptionPane.showInputDialog("ingrese su nombre");
                   if (usuario == "alberto"|| usuario == "juanita"){
                       String menu = JOptionPane.showInputDialog("elija una opcion \n 1- realisar una compra \n 2- consultar un producto \n 3- ver lista de productos");
                       switch (menu){
                           case "1":
                               String mensaje = JOptionPane.showInputDialog("producto 1: "+producto1.getCodigo()+" "+producto1.getNombre()+"\nproducto 2: "+producto2.getNombre()+" "+producto2.getCodigo()+"\nproducto 3: "+producto3.getNombre()+" "+producto3.getCodigo()+"\ningrese el codigo del producto: ");
                               switch (mensaje){
                                   case "100":
                                       if (Objects.equals(producto1.getEstado(), "disponible")){
                                           String desicion = JOptionPane.showInputDialog("detalles del rpoducto: "+"\ndsiponibilidad: "+producto1.getEstado()+"\n"+"cantidad: "+producto1.getDisponibilidad()+"\n"+"precio: "+producto1.getPrecio()+"\n*RECUERDE QUE EL PRECIO ES POR DIAS"+"\n desea alquilar el producto?");
                                           if (Objects.equals(desicion, "si")){
                                               int cantCompra = Integer.parseInt(JOptionPane.showInputDialog("cuantas cantidades desea alquilar?"+"\ncantidades: "+producto1.getDisponibilidad()));
                                               int dias = Integer.parseInt(JOptionPane.showInputDialog("cuantos dias desea alquilar el rpoducto?"));
                                               double precioProd = cantCompra*producto1.getPrecio()*dias;
                                               String user = JOptionPane.showInputDialog("usted es: "+usuario+"?");
                                               if (user == "si"){
                                                   String comprador = cliente1.getNombre();
                                                   Prestamo usuarioComp = new Prestamo(comprador);
                                               }else {
                                                   String comprador = cliente2.getNombre();
                                                   Prestamo usuarioComp = new Prestamo(comprador);
                                               }
                                               Prestamo factura = new Prestamo(precioProd);
                                               int resta = producto1.setDisponibilidad(producto1.getDisponibilidad()-cantCompra);
                                               System.out.println(producto1.getDisponibilidad());
                                           }
                                       }
                               }
                       }
                   } else{
                       JOptionPane.showMessageDialog(null,"Escriba nuevamente su nombre", "Error!", JOptionPane.ERROR_MESSAGE);
                   }
               case "2":
           }
           String seguir = JOptionPane.showInputDialog("desea seguir comprando ?");
           if (seguir.equals("si") ){
               x = 0;
           }
           else x =1;
       }
    }
}