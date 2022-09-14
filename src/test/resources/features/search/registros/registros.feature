# language: es

  Característica: Registro de usuario en el portal buggy cars

  Escenario: Registro de usuario nuevo happy patch
    Dado que se pulsa el boton register
    Cuando ingrese login correcto nombre apellido clave correcta y confimacion correcta de la clave
    Entonces se debe crear un nuevo usuario

    Característica: Registro de usuario nuevo fallido por login incorrecto
      Dado que se pulsa el boton register
  Cuando ingrese login incorrecto nombre apellido clave correcta y confirmacion correcta de la clave
  Entonces no se puede crear un nuevo usuario

  Característica: Registro de usuario fallido por clave incorrecta
  Dado que se pulsa el boton register
  Cuando ingrese login correcto nombre apellido clave incorecta y confirmacion incorrecta de la clave
  Entonces no se puede crear un nuevo usuario

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




