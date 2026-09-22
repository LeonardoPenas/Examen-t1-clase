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


        AlumnoController controlador = new AlumnoController();


        String respuesta="s";


        while(respuesta.equalsIgnoreCase("s")){


            Alumno alumno = new Alumno();



            System.out.println("\n***** REGISTRO DE ALUMNO *****");


            System.out.print("Nombre: ");
            alumno.setNombre(sc.nextLine());


            System.out.print("Apellido: ");
            alumno.setApellido(sc.nextLine());


            System.out.print("Tipo documento: ");
            alumno.setTipoDocumento(sc.nextLine());


            System.out.print("Número documento: ");
            alumno.setnmrodocuemnto(sc.nextLine());


            System.out.print("Nivel socioeconómico (A/B/C): ");
            alumno.setnivelSocioeconomico(sc.nextLine());


            System.out.print("Tipo de beca (Ninguna/Parcial/Total): ");
            alumno.setTipoBeca(sc.nextLine());


            System.out.print("Pensión base: ");
            alumno.setPensionBase(Double.parseDouble(sc.nextLine()));



        

            if(alumno.validarDNI() &&
               alumno.validarNivel() &&
               alumno.validarBeca()){


                controlador.agregarAlumno(alumno);

                System.out.println("\nAlumno registrado correctamente");


            }
            else{

                System.out.println("\nERROR: Datos incorrectos");

            }



            System.out.print("\n¿Desea registrar otro alumno? s/n: ");

            respuesta=sc.nextLine();


        }



        controlador.listarAlumnos();



    }




    }




    }   
    
    
}
