Feature: GENERACION DE PETICIONES APIS

  Scenario Outline: Generar token
    Given ingreso usuario <User> y clave <Clave>
   Then valido token
#    Examples:
#      | User    | Clave         |
#      | "admin" | "password123" |

  Scenario Outline: Obtener Booking id
    Given obtengo id
    Then valido numero de id

  Scenario Outline: Obtener Ping
    Given obtengo Ping
    Then valido numero de Ping

