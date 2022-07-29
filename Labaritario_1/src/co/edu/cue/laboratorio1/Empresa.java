package co.edu.cue.laboratorio1;


import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(01,"juanito","juanito@gmail.com",5);
        Empleado empleado2 = new Empleado(02,"ana","ana@gmail.com",10);
        Empleado empleado3 = new Empleado(03,"Gerardo","gerardo@gmail.com",1);

        Empleado empleado[]= new Empleado[3];
        empleado[0]=empleado1;
        empleado[1]=empleado2;
        empleado[2]=empleado3;

        Cliente cliente1 = new Cliente(10084324,"cedula","alberto jose","masculino","armenia");
        Cliente cliente2 = new Cliente(10084325,"pasaporte","juanita","femenino","cali");

        Producto producto1 = new Producto("100","vestido matrimonio de diseñador",5,"disponible",1500000);
        Producto producto2 = new Producto("101","esmoquin de diseñador LV",3,"disponible",1600000);
        Producto producto3 = new Producto("103","vestidos de fiesta de diseñador",20,"disponible",500000);

        Producto producto[]= new Producto[3];
        producto[0]=producto1;
        producto[1]=producto2;
        producto[2]=producto3;

        JOptionPane.showMessageDialog(null,"producto 1: "+producto1.getCodigo()+" "+producto1.getNombre()+"\nproducto 2: "+producto2.getNombre()+" "+producto2.getCodigo()+"\nproducto 3: "+producto3.getNombre()+" "+producto3.getCodigo());
        String mensaje = JOptionPane.showInputDialog("ingrese el codigo del producto: ");

        if (mensaje == "100"){
            if (producto1.getEstado()=="disponible"){
                String desicion = JOptionPane.showInputDialog(producto1+"\n desea alquilar el producto? si=1 no=2");
                if (desicion == "1"){
                    String cantCompra = JOptionPane.showInputDialog("cantidades: "+producto1.getDisponibilidad())
                }
            }


        }


    }
}