# language: es
@stories
Característica: : Registrar un nuevo usuario en la pagina utest
  @scenario1
  Escenario: Registrar un estudiante
    Dado que el estudiante quiera registrarse
    Cuando se registra con la informacion requerida para el registro
      | srtNombre | strApellido| strEmail|strMes|strDia|strAno|strCity|strZip|strPassword|strConfirmPass|
      |  emilio    |Tapias     |juanestellez@gmail.com|July|24|1999|Valledupar|20001|991124Jteran9|991124Jteran9|
    Entonces el debe finalizar el proceso
      | strEmail|strPassword|
      |juanestellez@gmail.com|991124Jteran9|

