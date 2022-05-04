@addCart
Feature: Add to cart
  Como usuario quiero agregar al carrito de compra productos para poder comprarlos.

  Background:
    Given El usuario esta en la home page

  Scenario Outline:
    Agregar producto/s al carrito de compras desde la pagina de detalle del producto View page

    When realiza la busqueda de un producto "<criterio>"
    And Selecciona el producto "<nombre>"
    And agrega el producto al carrito "<cantidad>" "<talle>" "<color>"
    Then deveria mostrar un mensaje de confirmacion "<resp_esperada>"

    Examples:
      | criterio                    | nombre                      | cantidad | talle | color | resp_esperada                                    |
      | Blouse                      | Blouse                      |        3 | M     | Black | Product successfully added to your shopping cart |
      | Faded Short Sleeve T-shirts | Faded Short Sleeve T-shirts |        2 | L     | Blue  | Product successfully added to your shopping cart |


  Scenario Outline:
    Ingresar cantidades invalidas cuando se quiere agregar producto/s al carrito de compras desde la pagina de detalle del producto View page

    When realiza la busqueda de un producto "<criterio>"
    And Selecciona el producto "<nombre>"
    And agrega el producto al carrito "<cantidad>" "<talle>" "<color>"
    Then deveria mostrar un mensaje de error "<resp_esperada>"

    Examples:
      | criterio                    | nombre                      | cantidad | talle | color | resp_esperada  |
      | Blouse                      | Blouse                      |        0 | M     | Black | Null quantity. |
      | Faded Short Sleeve T-shirts | Faded Short Sleeve T-shirts | gahaj    | L     | Blue  | Null quantity. |
      | Printed Dress               | Printed Chiffon Dress       | ;*       | M     | Green | Null quantity. |
