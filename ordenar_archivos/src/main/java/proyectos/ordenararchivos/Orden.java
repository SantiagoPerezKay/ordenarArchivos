package proyectos.ordenararchivos;

import java.io.File;
import java.util.HashSet;

public class Orden {

    private File conexion;
    public String[] lista;
    public HashSet<String> extensiones;

    public Orden(String dirPrincipal) {
        
        this.conexion = new File(dirPrincipal);
        this.lista = this.conexion.list();
        this.extensiones = agregarExtensiones();

    }

    public String miRuta() {
        return conexion.getAbsolutePath();
    }

    public void mostrarArchivos() {
        //metodo para mostrar los archivos y carpetas en el directorio especificado.
        for (String element : lista) {
            System.out.println(element);
        }
    }

    public void crearCarpetas() {
        for (String element : extensiones) {
            File tipo = new File(miRuta() + "\\" + element);
            if (!tipo.exists()) {
                tipo.mkdir();
            }
        }
    }

    public void moverArchivos() {
        //mover archivos a una carpeta con el nombre de la extension del archivo
        for (String element : lista) {
            File ArchivoOrigen = new File(miRuta(), "\\" + element); //ej: C:\Users\santy\Desktop\githubJava\proyectosJava\ordenarArchivos\4letras.txt        

            if (ArchivoOrigen.isFile()) {
                 //solo si es archivo procesedo a mover el archivo
                File ArchivoDestino = new File(miRuta(), devolverExt(element) + "\\" + element); //ej: C:\Users\santy\Desktop\githubJava\proyectosJava\ordenarArchivos\jpg
                ArchivoOrigen.renameTo(ArchivoDestino);
            }

        }
    }

    public String devolverExt(String cadenaArchivo) {
        //devuelve un String de la cadena pasada por parametro,a partir del "." en adelante. rango 4-2.
        if (cadenaArchivo.charAt((cadenaArchivo.length() - 5)) == '.') {
            return cadenaArchivo.substring(cadenaArchivo.length() - 4);
        } else if (cadenaArchivo.charAt((cadenaArchivo.length() - 4)) == '.') {
            return cadenaArchivo.substring(cadenaArchivo.length() - 3);
        } else if (cadenaArchivo.charAt((cadenaArchivo.length() - 3)) == '.') {
            return cadenaArchivo.substring(cadenaArchivo.length() - 2);
        } else {
            return "vacio";
        }

    }

    public HashSet<String> agregarExtensiones() {
        HashSet<String> ext = new HashSet<>();
        for (String element : lista) {
            File fichero = new File((conexion.getAbsolutePath() + "\\" + element));
            try {
                if (fichero.isFile()) {
                    if (element.charAt((element.length() - 4)) == '.') {
                        ext.add(element.substring(element.length() - 3));
                    } else {
                        ext.add(element.substring(element.length() - 4));
                    }
                }
            } catch (Exception e) {
                System.err.println("ocurrio un error");
            }
        }
        return ext;
    }

}
