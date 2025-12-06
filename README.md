# sistema-inventario

Proyecto Maven de ejemplo para el Sistema de Inventario.
Incluye configuración para Travis CI y una prueba JUnit de ejemplo.

Estructura:
- pom.xml
- .travis.yml
- src/main/java/com/miempresa/inventario/App.java
- src/test/java/com/miempresa/inventario/AppTest.java

Instrucciones rápidas:
1. Descomprime el ZIP.
2. En la carpeta del proyecto ejecuta: `mvn test`
3. Para subir a GitHub:
   - `git init`
   - `git add .`
   - `git commit -m "Initial commit - sistema-inventario"`
   - Crea el repo en GitHub y `git remote add origin <url>`
   - `git branch -M develop`
   - `git push -u origin develop`
4. Activa el repo en https://travis-ci.com para que ejecute los tests.

# Sistema de Inventario 

### **Descripción**

El *Sistema de Inventario* es una aplicación diseñada para gestionar productos, movimientos de almacén, proveedores y existencias de manera eficiente. Este sistema agiliza los procesos de control interno y reduce errores humanos.

### **Problema Identificado**

Las empresas suelen presentar:

* Falta de control sobre entradas y salidas.
* Inventarios desactualizados.
* Registros manuales propensos a errores.
* Dificultad al generar reportes.

### **Solución Propuesta**

Crear un sistema digital centralizado que permite:

* Registrar productos
* Gestionar movimientos
* Obtener reportes automáticos
* Mantener trazabilidad del inventario en tiempo real

### **Arquitectura**

* Cliente Web (HTML, CSS, JS)
* Backend Java + Maven
* BD relacional (MySQL o H2)
* Servidor de aplicación (Tomcat/Heroku)
* Integración continua con Travis CI

---

## 📑 Tabla de Contenidos

1. [Requerimientos](#requerimientos)
2. [Instalación](#instalación)
3. [Configuración](#configuración)
4. [Uso](#uso)
5. [Contribución](#contribución)
6. [Roadmap](#roadmap)
7. [Licencia](#licencia)

---

## Requerimientos

### **Servidores necesarios**

* Servidor de Aplicación: Apache Tomcat 9+ o Heroku
* Base de Datos: MySQL 8+, PostgreSQL o H2 (dev)

### **Lenguajes y Versiones**

* Java 11 o superior
* Maven 3.8+
* Travis CI (integración continua)

### **Paquetes adicionales**

* JUnit 5
* Spring Framework (opcional)
* Hibernate/JPA (opcional)

---

## Instalación

### **1. Instalar ambiente de desarrollo**

```bash
git clone https://github.com/usuario/sistema-inventario.git
cd sistema-inventario
mvn clean install
```

### **2. Ejecutar pruebas manualmente**

```bash
mvn test
```

### **3. Ejecutar aplicación localmente**

```bash
mvn spring-boot:run
```

### **4. Despliegue en producción (Heroku)**

1. Instalar Heroku CLI
2. Iniciar repositorio Heroku:

```bash
heroku create sistema-inventario
```

3. Subir código:

```bash
git push heroku master
```

---

## Configuración

### **Archivos importantes**

* `application.properties` — Configuración del servidor
* `pom.xml` — Dependencias y administración de proyecto
* `.travis.yml` — Integración continua

### **Configurar Base de Datos**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventario
spring.datasource.username=root
spring.datasource.password=admin
```

---

## Uso

### **Manual del usuario final**

* Iniciar sesión
* Registrar productos
* Consultar inventario
* Generar reportes PDF/Excel

### **Manual del administrador**

* CRUD de usuarios
* Configuración del sistema
* Parámetros de inventario

---

## Contribución

### **Guía para contribuir**

1. Hacer *fork* del repositorio
2. Crear branch nuevo:

```bash
git checkout -b feature/nueva-funcionalidad
```

3. Realizar cambios y subirlos:

```bash
git add .
git commit -m "Descripción del cambio"
git push origin feature/nueva-funcionalidad
```

4. Crear Pull Request hacia `develop`
5. Esperar revisión y *merge*

---

## Roadmap

### **Futuras implementaciones**

* Módulo de auditoría
* Notificaciones automáticas de inventario bajo
* Dashboard con gráficas avanzadas
* Integración con dispositivos móviles
* Multiusuarios con roles avanzados

---

## 📄 Licencia

Proyecto académico — uso educativo.
