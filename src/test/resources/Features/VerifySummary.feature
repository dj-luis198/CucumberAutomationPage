@verifySummary
Feature: Verificar sumario
  Como usuario quiero ir al sumario para verificar el costo total de la compra.

  Scenario Outline:
    Verificar que el monto total de la compra es correcto.

    Given El usuario esta en la home page
    And realiza la busqueda de un producto "<criterio>"
    And Selecciona el producto "<nombre>"
    And agrega el producto al carrito "<cantidad>" "<talle>" "<color>"
    When Presiona en el boton Check out
    Then deberia redirigir a la pagina Order
    And el total de la compra deberia ser igual al total esperado "<totalEsperado>"

    Examples:
      | criterio                    | nombre                      | cantidad | talle | color | totalEsperado |
      | Blouse                      | Blouse                      |        1 | M     | Black | $29.00        |
      | Faded Short Sleeve T-shirts | Faded Short Sleeve T-shirts |        3 | L     | Blue  | $51.53        |
      | Printed Dress               | Printed Chiffon Dress       |        5 | M     | Green | $84.00        |
