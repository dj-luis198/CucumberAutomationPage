  @pay
Feature: Formas de pago
  Como usuario quiero seleccionar una forma de pago para completar una compra.

  Background: 
    Given El usuario esta en la home page

  Scenario Outline: 
    Forma de pago transferencia bancaria.

    And realiza la busqueda de un producto "<criterio>"
    And Selecciona el producto "<nombre>"
    And agrega el producto al carrito "<cantidad>" "<talle>" "<color>"
    And Presiona en el boton Check out
    When Presiona el boton Proceed to checkout desde order page
    And Se logea "<email>" "<passwd>"
    And Presiona el boton Proceed to checkout desde Addresses page
    And Presiona el boton Proceed to checkout desde Shipping page
    And Selecciona la opcion Pay by bank wire
    And Presiona el boton I confirm my order
    Then Es redireccionado a la pagina Order Confirmation

    Examples: 
      | criterio                    | nombre                      | cantidad | talle | color | email               | passwd |
      | Blouse                      | Blouse                      |        3 | M     | Black | mycuenta@gmail.com  | pass1  |
      | Faded Short Sleeve T-shirts | Faded Short Sleeve T-shirts |        2 | L     | Blue  | mycuenta5@gmail.com | pass1  |

  Scenario Outline: 
    Forma de pago cheque.

    And realiza la busqueda de un producto "<criterio>"
    And Selecciona el producto "<nombre>"
    And agrega el producto al carrito "<cantidad>" "<talle>" "<color>"
    And Presiona en el boton Check out
    When Presiona el boton Proceed to checkout desde order page
    And Se logea "<email>" "<passwd>"
    And Presiona el boton Proceed to checkout desde Addresses page
    And Presiona el boton Proceed to checkout desde Shipping page
    And Selecciona la opcion Pay by check
    And Presiona el boton I confirm my order
    Then Es redireccionado a la pagina Order Confirmation

    Examples: 
      | criterio                    | nombre                      | cantidad | talle | color | email               | passwd |
      | Blouse                      | Blouse                      |        3 | M     | Black | mycuenta@gmail.com  | pass1  |
      | Faded Short Sleeve T-shirts | Faded Short Sleeve T-shirts |        2 | L     | Blue  | mycuenta5@gmail.com | pass1  |
