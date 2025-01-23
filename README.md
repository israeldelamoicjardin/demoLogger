### DEMO DE LOGGER
El proyecto es una demostración de como diferentes niveles de logger dan diferentes resultados
## El xml
Tal y coimo esta definido el XML  en la lina 17
   <pattern>%d [%thread] %-5level %logger{36} - %msg%n</pattern>
 Se ve que va a guardar toda la información

 sin embargo, en el logger "es.israeldelmo" con nivel INFO hace que la consola no muestre todos los errores

 ## Como demostrarlo
 Descomenta el looger a nivel root (línea 33 a 38) y mira la salida del try/catch/final

 
