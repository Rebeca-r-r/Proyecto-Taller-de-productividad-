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
