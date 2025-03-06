# Proyecto de Conexion a Base de Datos en Java

**Desarrollador:** Stivenco12  

## Descripcion
Este proyecto en Java permite la conexion con una base de datos MySQL y proporciona funcionalidades basicas para gestionar registros, como insertar, consultar, editar y eliminar datos. Se ha desarrollado utilizando Maven para la gestion de dependencias.

## Tecnologias Utilizadas
- **Java** (JDK 8 o superior)
- **MySQL**
- **Maven** (para la gestion de dependencias)

## Estructura del Proyecto

```
Java_conexion_con_Base_de_Datos-main/
|-- pom.xml
|-- src/
    |-- main/
        |-- java/
            |-- java_base_de_datos/
                |-- ConexionMySQL.java
                |-- ConsultarDatos.java
                |-- Editardatos.java
                |-- Elimnardatos.java
                |-- Insertar_datos.java
                |-- Main.java
```

### Archivos principales
- **ConexionMySQL.java**: Maneja la conexion con la base de datos.
- **ConsultarDatos.java**: Permite realizar consultas en la base de datos.
- **Editardatos.java**: Contiene metodos para actualizar registros existentes.
- **Elimnardatos.java**: Gestiona la eliminacion de registros.
- **Insertar_datos.java**: Proporciona la funcionalidad para agregar nuevos datos.
- **Main.java**: Es la clase principal desde donde se ejecuta la aplicacion.

## Requisitos
1. Tener instalado **Java JDK 8** o superior.
2. Tener instalado **MySQL** y una base de datos configurada.
3. Configurar el archivo `ConexionMySQL.java` con las credenciales correctas de la base de datos.
4. Tener **Maven** instalado y configurado.

## Instalacion y Ejecucion
1. Clonar el repositorio o descargar el codigo fuente.
2. Abrir una terminal y navegar hasta la carpeta del proyecto.
3. Ejecutar el siguiente comando para compilar y ejecutar el proyecto:
   ```sh
   mvn clean install
   java -cp target/Java_conexion_con_Base_de_Datos-main.jar java_base_de_datos.Main
   ```

## Notas Adicionales
- Asegurate de que el servidor MySQL este en ejecucion.
- Puedes modificar `ConexionMySQL.java` para cambiar la configuracion de la base de datos.
- Si hay algun error en `Elimnardatos.java`, se recomienda renombrarlo a `EliminarDatos.java`.

## Autor
**Stivenco12**

