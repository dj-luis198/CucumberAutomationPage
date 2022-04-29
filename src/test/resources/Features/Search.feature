@search @all
Feature: Search
  Como usuario quiero buscar productos por palabras claves para poder visualizarlos de manera rapida.

  Scenario Outline: 
    Busqueda de productos desde la home page - sin logearse

    Given El usuario esta en la home page
    When realiza la busqueda de un producto "<criterio>"
    Then deveria de mostrar un listado de productos encontrados "<resp_esperada>"

    Examples: 
      | criterio       | resp_esperada              |
      | blouse         | 1 result has been found.   |
      | a              | 0 results have been found. |
      | bl             | 0 results have been found. |
      | blo            | 1 result has been found.   |
      | chiffon blouse | 0 results have been found. |
      | chiffon        | 2 results have been found. |
