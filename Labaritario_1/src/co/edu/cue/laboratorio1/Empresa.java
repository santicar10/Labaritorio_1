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

        int x = 0;
        int contador = 0;
        int cont1 =0;
        int cont2 =0;
        int cont3 =0;
        int contador1 =0;
        int contador2 =0;
        int contador3 =0;


       while (x == 0 || contador<=3){
           String menu1="";
           if (x==0){
               menu1 = JOptionPane.showInputDialog("1-cliente \n 2-empleado");
           }
           else x=1;
           String mensajeMuetra ="producto 1: "+producto1.getCodigo()+" "+producto1.getNombre()+"\nproducto 2: "+producto2.getNombre()+" "+producto2.getCodigo()+"\nproducto 3: "+producto3.getNombre()+" "+producto3.getCodigo()+"\ningrese el codigo del producto: ";
           switch (menu1){
               case "1":
                   String usuario = JOptionPane.showInputDialog("ingrese su nombre");
                   if (usuario.equals("alberto") || usuario.equals("juanita")){
                       String menu = JOptionPane.showInputDialog("elija una opcion \n 1- realisar una compra \n 2- consultar un producto");
                       switch (menu){
                           case "1":
                               String mensaje = JOptionPane.showInputDialog(mensajeMuetra);
                               switch (mensaje){
                                   case "100":
                                       if (Objects.equals(producto1.getEstado(), "disponible")){
                                           String desicion = JOptionPane.showInputDialog("detalles del rpoducto: "+"\ndsiponibilidad: "+producto1.getEstado()+"\n"+"cantidad: "+producto1.getDisponibilidad()+"\n"+"precio: "+producto1.getPrecio()+"\n*RECUERDE QUE EL PRECIO ES POR DIAS"+"\n desea alquilar el producto?");
                                           if (Objects.equals(desicion, "si")){
                                               int cantCompra = Integer.parseInt(JOptionPane.showInputDialog("cuantas cantidades desea alquilar?"+"\ncantidades: "+producto1.getDisponibilidad()));
                                               if (producto1.getDisponibilidad()>0){
                                                   int dias = Integer.parseInt(JOptionPane.showInputDialog("cuantos dias desea alquilar el rpoducto?"));
                                                   int diasMax = dias;
                                                   double precioProd = 0;
                                                   if (dias <= dias){
                                                       precioProd = cantCompra*producto1.getPrecio()*dias;
                                                   }
                                                   else {
                                                       precioProd = cantCompra*producto1.getPrecio()*dias*0.7;
                                                   }

                                                   String user = JOptionPane.showInputDialog("usted es: "+usuario+"?");
                                                   String comprador = "";
                                                   if (user.equals("si")){
                                                       comprador = usuario;
                                                   }else {
                                                       String newUser = JOptionPane.showInputDialog("ingrese su nombre");
                                                       comprador=newUser;

                                                   }
                                                   int numero = (int)(Math.random()*2);
                                                   String vendedor = empleado[numero].getNombre();
                                                   Prestamo factura = new Prestamo(precioProd,dias,vendedor,comprador);
                                                   JOptionPane.showMessageDialog(null,factura.factura(comprador,precioProd,dias,vendedor)+"cantidades adquiridas: "+cantCompra);
                                                   int resta = producto1.setDisponibilidad(producto1.getDisponibilidad()-cantCompra);
                                                   contador++;
                                                   cont1++;
                                                   contador1 = cantCompra;
                                               }
                                               else {
                                                   producto1.setEstado("agotado");
                                                   JOptionPane.showMessageDialog(null,"el producto no esta disponible", "Error!", JOptionPane.ERROR_MESSAGE);
                                               }
                                           }else x=1;
                                       }else {
                                           JOptionPane.showMessageDialog(null,"el producto no esta disponible", "Error!", JOptionPane.ERROR_MESSAGE);
                                       }
                                       break;
                                   case "101":
                                       if (Objects.equals(producto2.getEstado(), "disponible")){
                                           String desicion = JOptionPane.showInputDialog("detalles del rpoducto: "+"\ndsiponibilidad: "+producto2.getEstado()+"\n"+"cantidad: "+producto2.getDisponibilidad()+"\n"+"precio: "+producto2.getPrecio()+"\n*RECUERDE QUE EL PRECIO ES POR DIAS"+"\n desea alquilar el producto?");
                                           if (Objects.equals(desicion, "si")){
                                               int cantCompra = Integer.parseInt(JOptionPane.showInputDialog("cuantas cantidades desea alquilar?"+"\ncantidades: "+producto2.getDisponibilidad()));
                                               if (producto2.getDisponibilidad()>0){
                                                   int dias = Integer.parseInt(JOptionPane.showInputDialog("cuantos dias desea alquilar el rpoducto?"));
                                                   double precioProd = 0;
                                                   if (dias <= dias){
                                                       precioProd = cantCompra*producto2.getPrecio()*dias;
                                                   }
                                                   else {
                                                       precioProd = cantCompra*producto2.getPrecio()*dias*0.7;
                                                   }
                                                   String user = JOptionPane.showInputDialog("usted es: "+usuario+"?");
                                                   String comprador = "";
                                                   if (user.equals("si")){
                                                       comprador = usuario;
                                                   }else {
                                                       String newUser = JOptionPane.showInputDialog("ingrese su nombre");
                                                       comprador=newUser;

                                                   }
                                                   int numero = (int)(Math.random()*2);
                                                   String vendedor = empleado[numero].getNombre();
                                                   Prestamo factura = new Prestamo(precioProd,dias,vendedor,comprador);
                                                   JOptionPane.showMessageDialog(null,factura.factura(comprador,precioProd,dias,vendedor)+"cantidades adquiridas: "+cantCompra);
                                                   int resta = producto1.setDisponibilidad(producto2.getDisponibilidad()-cantCompra);
                                                   contador++;
                                                   cont2++;
                                                   contador2 = cantCompra;
                                               }
                                               else {
                                                   producto1.setEstado("agotado");
                                                   JOptionPane.showMessageDialog(null,"el producto no esta disponible", "Error!", JOptionPane.ERROR_MESSAGE);
                                               }
                                           }else x=1;
                                       }else {
                                           JOptionPane.showMessageDialog(null,"el producto no esta disponible", "Error!", JOptionPane.ERROR_MESSAGE);
                                       }
                                       break;
                                   case "102":
                                       if (Objects.equals(producto3.getEstado(), "disponible")){
                                           String desicion = JOptionPane.showInputDialog("detalles del rpoducto: "+"\ndsiponibilidad: "+producto3.getEstado()+"\n"+"cantidad: "+producto3.getDisponibilidad()+"\n"+"precio: "+producto3.getPrecio()+"\n*RECUERDE QUE EL PRECIO ES POR DIAS"+"\n desea alquilar el producto?");
                                           if (Objects.equals(desicion, "si")){
                                               int cantCompra = Integer.parseInt(JOptionPane.showInputDialog("cuantas cantidades desea alquilar?"+"\ncantidades: "+producto3.getDisponibilidad()));
                                               if (producto3.getDisponibilidad()>0){
                                                   int dias = Integer.parseInt(JOptionPane.showInputDialog("cuantos dias desea alquilar el rpoducto?"));
                                                   double precioProd = 0;
                                                   if (dias <= dias){
                                                       precioProd = cantCompra*producto3.getPrecio()*dias;
                                                   }
                                                   else {
                                                       precioProd = cantCompra*producto3.getPrecio()*dias*0.7;
                                                   }
                                                   String user = JOptionPane.showInputDialog("usted es: "+usuario+"?");
                                                   String comprador = "";
                                                   if (user.equals("si")){
                                                       comprador = usuario;
                                                   }else {
                                                       String newUser = JOptionPane.showInputDialog("ingrese su nombre");
                                                       comprador=newUser;

                                                   }
                                                   int numero = (int)(Math.random()*2);
                                                   String vendedor = empleado[numero].getNombre();
                                                   Prestamo factura = new Prestamo(precioProd,dias,vendedor,comprador);
                                                   JOptionPane.showMessageDialog(null,factura.factura(comprador,precioProd,dias,vendedor)+"cantidades adquiridas: "+cantCompra);
                                                   int resta = producto1.setDisponibilidad(producto3.getDisponibilidad()-cantCompra);
                                                   contador++;
                                                   cont3++;
                                                   contador3 = cantCompra;
                                               }
                                               else {
                                                   producto1.setEstado("agotado");
                                                   JOptionPane.showMessageDialog(null,"el producto no esta disponible", "Error!", JOptionPane.ERROR_MESSAGE);
                                               }
                                           }else x=1;
                                       }else {
                                           JOptionPane.showMessageDialog(null,"el producto no esta disponible", "Error!", JOptionPane.ERROR_MESSAGE);
                                       }
                                       break;
                                   default:break;
                               }
                               break;
                           case "2":
                               String consulta = JOptionPane.showInputDialog("que producto desea conoser\n"+mensajeMuetra);
                               switch (consulta){
                                   case "100":
                                       JOptionPane.showMessageDialog(null,"detalles del rpoducto: "+"\ndsiponibilidad: "+producto1.getEstado()+"\n"+"cantidad: "+producto1.getDisponibilidad()+"\n"+"precio: "+producto1.getPrecio()+"\n cantidades de veces prestado: "+cont1+"\n cantidades alquiladas: "+contador1);
                                       break;
                                   case "101":
                                       JOptionPane.showMessageDialog(null,"detalles del rpoducto: "+"\ndsiponibilidad: "+producto2.getEstado()+"\n"+"cantidad: "+producto2.getDisponibilidad()+"\n"+"precio: "+producto2.getPrecio()+"\n cantidades de veces prestado: "+cont2+"\n cantidades alquiladas: "+contador2);
                                       break;
                                   case "102":
                                       JOptionPane.showMessageDialog(null,"detalles del rpoducto: "+"\ndsiponibilidad: "+producto3.getEstado()+"\n"+"cantidad: "+producto3.getDisponibilidad()+"\n"+"precio: "+producto3.getPrecio()+"\n cantidades de veces prestado: "+cont3+"\n cantidades alquiladas: "+contador3);
                                       break;
                                   default:break;
                               }
                               break;
                           default:break;
                       }
                   } else{
                       JOptionPane.showMessageDialog(null,"Escriba nuevamente su nombre", "Error!", JOptionPane.ERROR_MESSAGE);
                       x=0;
                   }
                   break;
               case "2":
                   String userName = JOptionPane.showInputDialog("ingrese su nombre");
                   int userPass = Integer.parseInt(JOptionPane.showInputDialog("ingrese su contraseña"));
                   if (userName.equals(empleado1.getNombre()) || userName.equals(empleado2.getNombre()) || userName.equals(empleado3.getNombre())){
                       if (userPass == empleado1.getCodigo()||userPass == empleado2.getCodigo()||userPass == empleado3.getCodigo()){
                            int ubicacion = Integer.parseInt(JOptionPane.showInputDialog("que producto desea remplazar?\n"+mensajeMuetra));
                           String nuevoNm = JOptionPane.showInputDialog("que nombre tendra el producto?");
                           int nuevaDs = Integer.parseInt(JOptionPane.showInputDialog("que cantidad tendra el producto?"));
                           double nuevoPr = Double.parseDouble(JOptionPane.showInputDialog("que precio tendra el producto?"));
                           producto[ubicacion].setNombre(nuevoNm);
                           producto[ubicacion].setDisponibilidad(nuevaDs);
                           producto[ubicacion].setPrecio(nuevoPr);
                           if(nuevaDs<0){
                               producto[ubicacion].setEstado("agotado");
                           }
                       }
                   }
                   break;
           }
           String seguir = JOptionPane.showInputDialog("desea seguir comprando ?");
           if (seguir.equals("si") ){
               x = 0;
           }
           else x =1;
       }
    }
}