package proyectos.ordenararchivos;

import java.io.File;



public class OrdenarArchivos {

    public static void main(String[] args) {

        
       Orden orden = new Orden("C:\\Users\\santy\\Desktop\\githubJava\\proyectosJava\\ordenarArchivos");
        System.out.println("ruta principal :" + orden.miRuta());

        System.out.println("\nLista de Archivos y Directorios en el directorio especificado");
        orden.mostrarArchivos();

        System.out.println("Tipos de extensiones  en el directorio:");
        System.out.println(orden.extensiones);

        System.out.println("==================crear de carpetas==================== ");
        orden.crearCarpetas();

        orden.moverArchivos();
        //fin
    }
}
