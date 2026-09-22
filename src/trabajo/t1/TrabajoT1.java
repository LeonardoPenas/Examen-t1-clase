/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.t1;

import java.util.Scanner;

/**
 *
 * @author UCA40428
 */
public class TrabajoT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);


        Alumno p= new Alumno();
        String rpta="s";
         AlumnoController c= new AlumnoController();
          System.out.println("Su primer estado del objeto");
            p.verDatos();
        while(rpta.equals("s")){
                  
            System.out.println("Ingrese el tipo de documento");
            String tp = sc.nextLine();
            p.nombre(tp);

            System.out.println("Ingrese el número de documento");
            String num = sc.nextLine();
            p.setNro_documento(num);

            System.out.println("Ingrese el nombre");
            String n= sc.nextLine();
            p.setNombre(n);

            System.out.println("Ingrese apellido paterno");
            String ap=sc.nextLine();
            p.setApellido_paterno(ap);

            System.out.println("Ingrese apellido materno");
            String am=sc.nextLine();
            p.setApellido_materno(am);

            System.out.println("Ingresar telefono");
            String nro= sc.nextLine();
            p.tipoBeca(nro);
                     
            c.agregar(p);
            System.out.println("Desea agregar otra persona: s/n ");
            rpta=sc.nextLine();
        }   
        c.listar();
       
    }



    }




    }




    }   
    
    
}
