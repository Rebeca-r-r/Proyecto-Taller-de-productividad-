Sistema de Inventario Empresarial  
### Proyecto Integrador – Administración de Código (GitHub) + Gestión de Tareas (Zube)

Este proyecto consiste en el diseño, desarrollo y despliegue de un **Sistema de Inventario Empresarial**, administrado bajo las buenas prácticas de control de versiones utilizando **Git Flow**, y gestionado con la integración entre **GitHub** y **Zube**.

---

🧩 Objetivo del sistema
El sistema permitirá controlar:
- Productos
- Categorías
- Proveedores
- Entradas y salidas de inventario
- Movimientos históricos
- Reportes
- Roles de usuario (Admin / Staff / Lectura)

El desarrollo se divide en dos etapas:
- **Beta (MVP funcional)**
- **GA – General Availability (Versión final lista para producción)**

---

Arquitectura del Proyecto
Tecnologías (propuestas)
- **Frontend:** HTML5, CSS3, JavaScript, React o similar  
- **Backend:** Node.js / Express / API REST  
- **Base de datos:** MySQL / PostgreSQL  
- **Control de versiones:** Git / GitHub  
- **Gestión de proyectos:** Zube (con integración a GitHub)  
- **Despliegue:** Servidor o nube (Render, AWS, etc.)

---
Flujo de trabajo con Git Flow

El proyecto utiliza dos ramas principales:
**master**
- Contiene la versión estable del sistema (GA).
- No se permite subir código directo.
- Solo recibe merges desde `develop` mediante Pull Requests.
 **develop**
- Rama donde se integran todas las tareas (versión Beta).
- Aquí se hacen los merges de las ramas feature.

---
 Ramas secundarias (features)

Cada requerimiento se desarrolla en una rama única:

feature/requirements-document
feature/modelo-datos
feature/wireframes

feature/backend-crud-productos
feature/backend-crud-categorias
feature/backend-entradas
feature/backend-salidas
feature/backend-login

feature/frontend-login
feature/frontend-productos
feature/frontend-entradas
feature/frontend-salidas
feature/frontend-movimientos
feature/frontend-reportes-basicos

feature/backend-roles-avanzados
feature/backend-reportes-avanzados

feature/frontend-dashboard
feature/frontend-filtros
feature/frontend-reportes-avanzados

feature/deploy-servidor
feature/documentacion-final


---
Comandos para trabajar con branches

## Crear una nueva rama feature
```bash
git checkout develop
git pull
git checkout -b feature/nombre-de-la-tarea


