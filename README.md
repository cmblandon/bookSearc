# AUTGoogleSearchJava
This repository contains a basic automation of searching word process on google in java languaje

# Configuración del proyecto
* Se debe importar o crear el proyecto como un de proyecto maven; para este caso se usó el ide IntelliJ, si haces uso de este ide, crear un proyecto a partir de recursos existentes, y adicionar el framework de maven.
* En la clase Drivers, se debe modificar la ruta desde la cual el proyecto tomará el driver de google chrome para abrir la instancia del navegador, ejemplo: _`private static String driverpath = "/Users/testingPC/Documents/proyectos/librerias/chromedriver";`
# Ejecución del proyecto
* Para ejecutar el proyecto desde el ide, se debe correr la clase `TestRunner`
# Ejecución del proyecto por consola
* Ejecutar el comando `mvn clean verify`, esto permite descargar todas las depencias indicadas en el archivo pom.xml y ejecutar automaticamente los escenarios de prueba.
* Para correr un feature en específico, ejecute el siguiente comando: `mvn test -Dcucumber.options="src/test/resources/features/BuscarPalabra.feature"`
