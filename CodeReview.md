# CODE REVIEW JUAN JOSÉ ABAD SAURA

# NECESIDADES DE NEGOCIO
Lo primero que se ha hecho es adaptar nuestros endpoints a las necesidades de negocio.
En esta parte no se ha implementado auht para la securización del edpoint para los encargados de calidad.

# ARQUITECTURA HEXAGONAL
Se elimina de la capa de aplicación los mapeos de los modelos response del controlador, delegando esta funcionalidad en AdsMapper en la capa de Infraestructura.
Se eliminan acoplamientos entre las diferentes capas.

# CÓDIGO
Se utiliza lombok en todos los modelos.

# TESTING
Las pruebas unitarias existentes no dan confianza alguna, ya que no abarcan todos los casos de uso de la aplicación.
No existen pruerbas de integración

# DOCUMENTACIÓN
No existe documentación de la API, se podría utilizar una librería tipo Swagger para la definición de nuestros servicios REST.

# MEJORAS
Existen muchas mejoras a realizar a nivel de implentación.
Uso de lambda functions.
Expresiones regulares para el cálculo de Score.
Uso de tipos genéricos para las funciones básicas de las entidades (create, read, update, delete).

# SUMMARY
Me he centrado sobre todo en uso de la arquitectura hexagonal, dejando para la entrevista detalles de implementación, por ejemplo, para calcular en Score.
Importante implementar TDD para abordar todos los casos de uso de la aplicación, la cual nos de confianza.

El código se encuentra en el repositorio:
https://github.com/JSAURAJ/code-review-challenge.git
branch:
feature/improvements