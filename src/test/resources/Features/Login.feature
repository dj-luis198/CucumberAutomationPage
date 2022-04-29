@test @all
Feature: Login
  Como usuario registrado quiero logearme en la pagina para poder realizar compras

  Background: 
    Given El usuario esta en login page

  Scenario Outline: Login con email y password correctos partiendo de la home page
    When Se logea "<email>" "<passwd>"
    Then Deveria ser redirigido a la pagina My Account

    Examples: 
      | email               | passwd |
      | mycuenta@gmail.com  | pass1  |
      | mycuenta5@gmail.com | pass1  |

  Scenario Outline: Login con email y password incorrectos o invalidos partiendo de la home page
    When Se logea "<email>" "<passwd>"
    Then Deveria Mostrar un mensaje de "<error>"

    #passwd invalido
    #email invalido
    #email y passwd invalidos
    #passwd incorrecto
    #email incorrecto
    Examples: 
      | email              | passwd | error                  |
      | mycuenta@gmail.com | pass   | Invalid password.      |
      | mycuentagmail.com  | pass1  | Invalid email address. |
      | mycuentagmail.com  | pass   | Invalid email address. |
      | mycuenta@gmail.com | 123456 | Authentication failed. |
      | mycuent@gmail.com  | 123456 | Authentication failed. |
