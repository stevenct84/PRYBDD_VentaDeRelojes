# PRYBDD_VentaDeRelojes
Proyecto del curso de verano de Bases de Datos del Instituto Tecnológico de Costa Rica.

![](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![](https://img.shields.io/badge/-MySQL-blue?style=for-the-badge&logo=mysql&logoColor=white)

## Introducción
Este proyecto consiste en desarrollar un sistema para registrar y administrar relojes que han adquirido los distintos usuarios (aficionados) a la horología así como las ventas entre ellos.

Es requerido contruir un sistema con datos persistentes que permita dicha administración de las ventas de los relojes, así como el control sobre ellos entre los diferentes usuarios (aficionados o coleccionistas).

Se debe crear un sistema escalable, intuitivo, de fácil uso, agradable a la vista y debe cumplir con las características esenciales de las bases de datos.

Se debe estructurar como un sistema de N Capas. Que por lo menos cumpla con los siguientes requerimientos:
- Interfaz de usuario (UI): cada de presentación, esta capa no toma decisiones ni procesa lógica de negocio
- Capa de negocios (BL): capa de la lógica de negocios, encargada de modelar las reglas de negocio de la aplicación, toma las decisiones, cálculos, procesos, etc.
- Acceso a datos (DA): capa de acceso a los datos, abstrae la comunicación del sistema con la base de datos, no debe confundirse como la base de datos como tal.

Se espera un código fuente que siga las normas básicas establecidas en el libro Clean Code (Martin, 2008).

## Requerimientos
- Registro:
  - Administradores para seguridad e información.
  - Personas (nombre, apellidos, cédula/cResidencia/pasaporte, fecha nacimiento, edad, foto, nacionalidad, comunidad (?), e-mail y teléfono.
  - Conexión por medio de credenciales (usuario-clave encriptada).
  - Administradores para información de catálogos.
  - Los datos pueden ser editados en la aplicación (considerando permisos).
  - Todas las personas pueden registrar permisos en la plataforma (nombre, descripción, categoría, precio, tipo de envío y fotos).
  - Los usuarios pueden agregar y eliminar relojes del CARRITO de compras.
  - Se pueden adquirir relojes y elegir un método de pago (paypal, efectivo, otros) para sus compras, como también se requiere un historial de compras).
  - Posibilidad de manejar reviews en cada uno de los relojes adquiridos que se han adquiridos (manejar sistema gráfico de estrellas visibles a todo usuario y comentarios del producto).
  - Comunicación entre vendedores por medio de mensajes privados desde la misma plataforma.
  - Existen calificaciones para compradores y vendedores (? Se pueden tener ambas?). Solo se pueden puntuar usuarios con los que se hayan hecho negocios.


- Registro Relojes:
  - Se pueden clasificar relojes (de pulsera, de bolsillo, juguete, fantasía, con joyería, etc...)
  - Registro de marca del reloj, descripción, categoría, modelo, día, mes y año de fabricación, estado, tipo de envío y fotos.
  - Se debe poder clasificar un reloj como vintage (?).
  - Se debe registrar la información del vendedor del artículo, tal como nombre y correo de contacto, entre otros indicado en el apartado de registro. (? se refiere a que a la hora de ver un producto que se está vendiendo se despliega información del vendedor?)
 
- Publicación de reviews.
  - A la hora de hacer una compra de un reloj, debe aparecer la review del vendedor. (X)
  - A la hora de hacer una venta de un reloj, debe aparecer la review del comprador. (X)
  - Se debe visualizar la cantidad de estrellas (interactivo).
  - Se deben de ver todos los comentarios hechos del producto.

- Favoritos: se debe permitir a los usuarios optar por los relojes favoritos como un wish list y desde ahí también por ir a ver en detalle el reloj.

- Auditoría y bitácora: el sistema debe administrar campos de auditoría para los registros de datos en las tablas de base de datos y para la última actualización de un registro. Ademas de una bitácora con los cambios de precios de un reloj y del dueño de este. (Investigación de triggers)

- Control y Usabilidad: Debe permitir a los administradores las operaciones de agregar, editar, eliminar o inactivar registros principalmente de los catálogos. Todos los catálogos (plural) deben registrarse, editarse y consultar por medio del sistema. **No se aceptan registros de datos por medio de la base de datos**

- Módulo de Consultas: permite a los usuarios visualizar información precisa e inmediata. Se debe permitir **combinación de datos en los filtros y filtros en blanco**
  - Consultas para administradores:
    1. Listado de relojes de un coleccionaste (sin privacidad como en cualquier app).
    2. Top "n" (parametrizable) de usuarios con mas ventas realizadas.
    3. Top "n" con usuarios con mas compras realizadas.
    4. Listado de vendedores y compradores con mejores calificaciones.
    5. Listado de vendedores y compradores con peores calificaciones.
    6. Top n de relojes más costosos por categoría.
    7. Montos mínimos y máximos de relojes por categoría.
  - Consultas para usuarios:
    1. Debe existir una pantalla de búsquedas para cualquier reloj. Con selección de al menos cinco filtros.
    2. Historial de compras realizadas.
    3. Listado de relojes vendidos para cada usuario.
    4. Total de compras realizadas por el usuario por categoría mayores a 600 dólares o equivalente en la moneda del sistema.

- Módulo de Estadísticas: permite a los **ADMINISTRADORES** tener información precisa e inmediata de la información, mostrarse con datos numéricos, porcentajes y gráficos. Los requisitos mínimos son:
  1. Total y porcentaje de relojes por clasificación.
  2. Total de vendedores por género.
  3. Total de compradores por género.
  4. Total de vendedores por **RANGO DE EDAD**.

- Jobs: El sistema debe generar **TOP 3 VENDEDORES** con mejor calificación, este reporte se debe generar como un Job de base de datos todos los días a las 1 a.m. de lunes a domingo.

- Consideraciones extras.
  1. El sistema debe presentarse con datos reales y bien clasificados (no tirar al azar creando relojes).
  2. Los catálogos deben tener los datos **previamente registrados** para la defensa del proyecto. Por los menos:
    - 30 artículos.
    - 10 usuarios.
    - 20 compras.
    - 20 ventas.
    - Interacciones con los usuarios (Comentarios, mensajes directos, valuaciones de comprador y vendedor)
  3. Todos los campos que se ingresen en el sistema deben tener su respectiva salida (consulta, estadística, reporte, otro que considere) (???).
  4. Las consultas, estadísticas, entre otros sql deben ser **eficientes**.
  5. Todas las consultas deben estar programadas de forma eficiente haciendo uso de joins donde se requiera. **No se aceptan consultas separadas cuando se pueden realizar correctamente con joins**
  6. Se puede usar bases de datos Oracle, MySQL o MariaDB.
  7. Identificar donde aplica crear **tablas de catálogo**.
  8. La aplicación debe ser gráfica y de escritorio.
  9. Sistema 100% parametrizable.
  10. Toda entrada debe validarse con una salida (mensaje de error, consulta o reporte). **Sin necesidad de ir a ver la base de datos**
  11. La aplicación debe tener un nombre y logo **creado por el equipo**.
  12. Código debe trabajarse desde un programa de control de versiones.
  13. Modelo conceptual, modelo lógico, tablas, atributos, comentarios de base de datos **EN INGLÉS**.
  14. **ENTREGA EN EL TECDIGITAL EN FORMATO .ZIP (Solo codigo fuente)**
  15. **DOCUMENTACIÓN EN PDF, LATEX, DOC**

- Documentación:
  - Diagrama entidad-relación.
  - Manual de usuario.
  - Diccionario de datos.
  - Documento de matriz de casos de prueba en Excel con mínimo **50 CASOS DE PRUEBA**. (Id prueba, descripción, resultado esperado, estado).
  - Código documentado según estándar **Clean Code**.
