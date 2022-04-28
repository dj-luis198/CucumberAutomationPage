@registro
Feature: Registro de usuarios
  Como usuario quiero registrarme para poder realizar compras

  Background: 
    Given El usuario esta en login page

  Scenario Outline: Registrarse en la pagina ingresando todos los datos
    When Ingresa a la pagina Create an account "<email>"
    And Ingresa los datos personales "<genero>" "<nombre>" "<apellido>" "<email>" "<passwd>" "<diaNac>" "<mesNac>" "<anioNac>" "<newsletter>" "<offers>"
    And Ingresa datos de domicilio "<nombre>" "<apellido>" "<compania>" "<direccion1>" "<direccion2>" "<pais>" "<estado>" "<ciudad>" "<codPostal>" "<infoAdicional>" "<telefono>" "<celular>" "<alias>"
    And presiona el boton de registro
    Then deberia ser redirigido a la pagina My account
    And deberia mostrar mi apelledo y nombre "<nombre>" "<apellido>"

    Examples: 
      | genero | nombre | apellido | email                | passwd | diaNac | mesNac | anioNac | newsletter | offers | compania | direccion1  | direccion2  | pais          | estado  | ciudad  | codPostal | infoAdicional  | telefono   | celular   | alias  |
      | Mr.    | Daniel | Farias   | registro27@gmail.com | pass1  |     21 |      7 |    2000 | yes        | no     | NA       | direccion11 | direccion12 | United States | Arizona | ciudad1 |     11111 | infoAdicional1 | 4444455214 | 301211111 | alias1 |

  Scenario Outline: Registrarse en la pagina ingresando solo datos obligatorios
    When Ingresa a la pagina Create an account "<email>"
    And Ingresa los datos personales "<nombre>" "<apellido>" "<email>" "<passwd>"
    And Ingresa datos de domicilio "<nombre>" "<apellido>" "<direccion1>" "<pais>" "<estado>" "<ciudad>" "<codPostal>" "<celular>" "<alias>"
    And presiona el boton de registro
    Then deberia ser redirigido a la pagina My account
    And deberia mostrar mi apelledo y nombre "<nombre>" "<apellido>"

    Examples: 
      | nombre | apellido | email                | passwd | direccion1  | pais          | estado  | ciudad  | codPostal | celular   | alias  |
      | Daniel | Farias   | registro28@gmail.com | pass1  | direccion11 | United States | Arizona | ciudad1 |     11111 | 301211111 | alias1 |

  Scenario Outline: Registrarse en la pagina ingresando datos invalidos
    When Ingresa a la pagina Create an account "<email>"
    When Ingresa los datos personales "<genero>" "<nombre>" "<apellido>" "<email>" "<passwd>" "<diaNac>" "<mesNac>" "<anioNac>" "<newsletter>" "<offers>"
    And Ingresa datos de domicilio "<nombre>" "<apellido>" "<compania>" "<direccion1>" "<direccion2>" "<pais>" "<estado>" "<ciudad>" "<codPostal>" "<infoAdicional>" "<telefono>" "<celular>" "<alias>"
    And presiona el boton de registro
    Then deberia mostrar un mensaje de error "<error>"

    Examples: 
      | genero | nombre | apellido | email               | passwd | diaNac | mesNac | anioNac | newsletter | offers | compania | direccion1  | direccion2  | pais          | estado  | ciudad  | codPostal | infoAdicional  | telefono   | celular   | alias  | error                                                                                                                                             |
      | Mr.    | Daniel | Farias   | registro8@gmail.com | pass1  |     31 |      6 |    2000 | yes        | no     | NA       | direccion11 | direccion12 | United States | Arizona | ciudad1 |     11111 | infoAdicional1 | 4444455214 | 301211111 | alias1 | Invalid date of birth                                                                                                                             |
      | Mr.    | aaa11a | Farias   | registro8@gmail.com | pass1  |     20 |      6 |    2000 | yes        | no     | NA       | direccion11 | direccion12 | United States | Arizona | ciudad1 |     11111 | infoAdicional1 | 4444455214 | 301211111 | alias1 | firstname is invalid.                                                                                                                             |
      | Mr.    | Daniel | 111aaa   | registro8@gmail.com | pass1  |     20 |      6 |    2000 | yes        | no     | NA       | direccion11 | direccion12 | United States | Arizona | ciudad1 |     11111 | infoAdicional1 | 4444455214 | 301211111 | alias1 | lastname is invalid.                                                                                                                              |
      | Mr.    | Daniel | Farias   | registro8@gmail.com | pass1  |     20 |      6 |    2000 | yes        | no     | NA       | direccion11 | direccion12 | United States | Arizona | ciudad1 |       111 | infoAdicional1 | 4444455214 | 301211111 | alias1 | The Zip/Postal code you've entered is invalid. It must follow this format: 00000                                                                  |
      | Mr.    | 100kjj | Aaa111   | registro8@gmail.com | pass1  |     31 |      2 |    2000 | yes        | no     | NA       | direccion11 | direccion12 | United States | Arizona | ciudad1 | a1        | infoAdicional1 | 4444455214 | 301211111 | alias1 | lastname is invalid. firstname is invalid. The Zip/Postal code you've entered is invalid. It must follow this format: 00000 Invalid date of birth |
