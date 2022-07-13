#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @CrearCuentaLibreria
  Scenario Outline: Crear cuenta en la libreria
    Given entro a la pagina de la libreria
    When crear un usuario en la libreria <correo><nombres><apellidos><numeroDeDocumento><telefonoCelular><telefonoFijo><contrase�a>
    Then valido la creacion de la cuenta

    Examples: 
      | correo               | nombres | apellidos | numeroDeDocumento | telefonoCelular | telefonoFijo | contrase�a  |
      | "Pruebasss@yopmail.com" | "Juan"  | "Perez"   | "1045685965"      | "3214526589"    | "8523315"    | "Prueba123" |
      
   @ComprarCuenta
  Scenario Outline: Comprar libro
    Given entro a la pagina de la libreria
    When compro un libro
    Then valido la compra de un libro
     Examples:
       |  |

    
