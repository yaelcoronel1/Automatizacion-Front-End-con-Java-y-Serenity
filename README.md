# 🧪 Proyecto de Automatización de Testing con Serenity BDD (Java)

## 📘 Descripción General
Este proyecto implementa un framework de **automatización de pruebas funcionales** utilizando **Java**, **Serenity BDD**, **Cucumber** y **Gradle**, permitiendo ejecutar flujos de prueba sobre una aplicación web mediante la interacción con elementos mapeados y el uso del navegador **Google Chrome**.

---

## 🖥️ Requerimientos para ejecutar el proyecto desde cero

Para correr correctamente este proyecto en otra computadora necesitas instalar lo siguiente:

### ✔️ 1. Java JDK
- Versión recomendada: **Java 11 o Java 17**
- Verifica instalación con:
  ```bash
  java -version
  ```

### ✔️ 2. IDE compatible con Java
Cualquiera de los siguientes funciona sin problemas:
- IntelliJ IDEA (recomendado)
- Eclipse
- VS Code con extensiones para Java

### ✔️ 3. Gradle
El proyecto ya incluye **Gradle Wrapper (`gradlew`)**, así que NO es obligatorio instalar Gradle globalmente.

Puedes ejecutar directamente:
```bash
./gradlew test
```
— o en Windows —
```bash
gradlew.bat test
```

### ✔️ 4. Chrome + ChromeDriver
Este proyecto utiliza **WebDriver de Chrome**.

Debes instalar:
- **Google Chrome (última versión)**
- **ChromeDriver** compatible con tu versión de Chrome

Puedes verificar la versión con:
```bash
chrome --version
```

El archivo de ChromeDriver debe estar en tu **PATH** o configurado en Serenity.

---

## 📦 Dependencias principales
Las dependencias están gestionadas desde `build.gradle`.
Incluyen:
- Serenity BDD
- Serenity Cucumber
- WebDriver
- JUnit

Ejemplo (del proyecto):
```groovy
dependencies {
    testImplementation 'net.serenity-bdd:serenity-core:4.0.12'
    testImplementation 'net.serenity-bdd:serenity-junit:4.0.12'
    testImplementation 'net.serenity-bdd:serenity-cucumber:4.0.12'
    testImplementation 'io.cucumber:cucumber-java:7.14.0'
}
```

---

## 📁 Estructura principal del proyecto
```
co.com.practica.yaelcoronel
│── build.gradle
│── gradlew / gradlew.bat
│── settings.gradle
│
├── src/main/java/co/com/practica/yaelcoronel
│   ├── Main.java
│   ├── steps /
│   ├── tasks /
│   ├── interactions /
│   ├── models /
│   ├── questions /
│   └── utils /
│
└── src/test/resources
    └── features /
```

---

## ▶️ Cómo ejecutar el proyecto

### 1. Ubicarte en la carpeta raíz del proyecto
```bash
cd co.com.practica.yaelcoronel
```

### 2. Ejecutar pruebas
```bash
./gradlew clean test
```

### 3. Ver reportes de Serenity
Después de la ejecución, abre:
```
target/site/serenity/index.html
```

---

## 🌟 Notas Importantes
- ChromeDriver **debe coincidir exactamente** con la versión de Chrome.
- Si se generan errores por WebDriver, actualiza Chrome y descarga la versión más reciente.
- El uso de Gradle Wrapper garantiza que todos puedan ejecutar el proyecto sin configuraciones adicionales.

---

## 🏁 Conclusión
Con estas herramientas instaladas, el proyecto puede correr sin complicaciones en cualquier computadora nueva, permitiendo ejecutar flujos automatizados de manera rápida y confiable.
