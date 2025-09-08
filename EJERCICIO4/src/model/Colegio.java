
package model;
//Integrantes: Manceñido Xenia, Ortiz Paez Lourdes, Ortiz Paez Santiago, Ozan Santiago 

public class Colegio {
    
    
    public static void main(String[] args) {
        
        //1. Crear las materias 
        Materia web2= new Materia(1, "Web 2",2); 
        Materia matemáticas= new Materia(2,"Matemáticas",1); 
        Materia laboratorio1= new Materia(3,"Laboratorio 1", 1);
        
        //2. Crear 2 alumnos
        Alumno lopez= new Alumno(1001, "López", "Martin");
        Alumno martinez= new Alumno(1002,"Martínez", "Brenda"); 
        
        //3. Inscribir a Lopez en 3 materias 
         lopez.inscribirMateria(web2);
         lopez.inscribirMateria(matemáticas);
         lopez.inscribirMateria(laboratorio1);
        
        //4. Inscribir a Martinez en 3 materias y volver a inscribirlo en en Laboratorio 1
         martinez.inscribirMateria(web2);
         martinez.inscribirMateria(matemáticas);
         martinez.inscribirMateria(laboratorio1);
         martinez.inscribirMateria(laboratorio1); // intento duplicado
        
        //5. Mostrar Resultados 
        System.out.println(lopez.getApellido() + " " + lopez.getNombre() +
                " está inscripto en " + lopez.cantidadMaterias() + " materias.");

        System.out.println(martinez.getApellido() + " " + martinez.getNombre() +
                " está inscripta en " + martinez.cantidadMaterias() + " materias.");
    } 
    
    
    
}
