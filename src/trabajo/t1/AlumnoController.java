package trabajo.t1;


import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UCA40428
 */
public class AlumnoController 
{
   ArrayList<Alumno> listaAlumnos = new ArrayList();
   
   public void agregarAlumno(Alumno alumno)
   
   {
   listaAlumnos.add(alumno);
   }
  public void listarAlumno()
  {
        System.out.println("LA LISTA DE ALUMNOS: ");
        for(int i=0; i<listaAlumnos.size();i++){
            listaAlumnos.get(i).verDatos();
        }
    }
    public void agregar(Alumno nuevoAlumno){
        listaAlumnos.add(nuevoAlumno);
    }
   
}
