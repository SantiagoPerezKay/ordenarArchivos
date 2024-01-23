# Ordenar Archivos Java

Este script en Java está diseñado para organizar archivos en un directorio específico según sus extensiones. La funcionalidad principal se centra en la creación de carpetas correspondientes a cada tipo de extensión y el posterior movimiento de archivos a sus carpetas respectivas.

## Uso

1. **Configuración inicial:**
    - Asegúrese de tener instalado Java en su sistema.
    - El script utiliza Maven para gestionar las dependencias y la compilación. Asegúrese de tener Maven instalado.

2. **Estructura del Proyecto:**
    - La estructura del proyecto Maven se ha configurado para facilitar la compilación y ejecución del script. El código fuente se encuentra en el paquete `proyectos.ordenararchivos`.

3. **Configuración del Directorio:**
    - Modifique la ruta del directorio principal en el archivo `OrdenarArchivos.java` al instanciar la clase `Orden`. Esto se realiza en el método `main`:

    ```java
    Orden orden = new Orden("C:\\ruta\\al\\directorio");
    ```

4. **Ejecución:**
    - Compile y ejecute el script utilizando Maven desde la línea de comandos:

    ```bash
    mvn clean install
    java -jar target/ordenarArchivos-1.0-SNAPSHOT.jar
    ```

5. **Resultado:**
    - El script imprimirá la ruta principal, la lista de archivos y directorios en el directorio especificado, los tipos de extensiones presentes y procederá a crear carpetas y mover archivos.

## Detalles del Código

- La lógica principal se encuentra en la clase `Orden`, que encapsula las operaciones relacionadas con la organización de archivos.
- El método `devolverExt` extrae la extensión de un nombre de archivo y se utiliza para crear las carpetas correspondientes.
- La clase principal `OrdenarArchivos` instancia la clase `Orden`, imprime información sobre el directorio y ejecuta las operaciones de organización.

## Autor

- Desarrollado por Santiago Perez Kay.

## Contribuciones

Las contribuciones son bienvenidas. Si encuentra algún problema o tiene alguna mejora, no dude en abrir un problema o enviar una solicitud de extracción.


