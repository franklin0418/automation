# language: es

  Característica: Registro de usuario en el portal buggy cars

  Escenario: Registro de usuario nuevo
    Dado que franklin desea registrarse en el portal buggy cars
    Cuando se ingrese los datos solicitados
    Entonces se debe crear el usuario correctamente

    Característica: Registro de usuario fallido por error de datos
      Dado que franklin desea registrarse en el portal buggy cars
      Cuando ingrese los datos solicitados de manera incorrecta
      Entonces se debe generar un error

    Esquema del escenario: Registrar un usuario
    Dado que un usuario desea registrarse con su <login> <nombre> <apellido> >contraseña> <confirmacion contraseña>
    Cuando pulsa el boton register
    Entonces debe ser registrado de la siguiente <manera>
    Ejemplos:
      |    login  |    nombre   | apellido | contraseña | confirmacion contraseña | manera |
      | GABRIEL10 | franklin    | muñoz    | Mayra_0717 |    Mayra_0717           | correcta|
      |GABRIEL 11 |  franklin   |muñoz     |Mayra_0717  |Mayra_0717               |incorrecta|
      | GABRIEL10 |franklin     |muñoz     |mayra_0717  |mayra_0717               |incorrecto|
      |GABRIEL10  |franklin     |muñoz     |Mayra_0717  |mayra_0717               |incorrecto|
      |GABRIEL10  |franklin     |muñoz     |mayra_0717  |mayra_0717               |incorrecto|




