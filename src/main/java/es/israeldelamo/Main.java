package es.israeldelamo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    /**
     * Logger para esta clase
     */
    private static final Logger logger = LoggerFactory.getLogger(Main.class);


    /**
     * Solo un ejemplo de logger, clase Main
     * @param args parámetros de lanzamiento
     */
    public static void main(String[] args) {
        logger.info("Lanzando la aplicación");
        logger.debug("Depuracion mostrada");

        String cadenaVacia="";
        Integer valorCadena;
        try {
            valorCadena = Integer.valueOf(cadenaVacia);
        } catch (NumberFormatException e) {
            logger.info("Lanzando la aplicación");
            logger.debug("Depuración mostrada");
            logger.error("Mensaje de error {}", e.getMessage());
            logger.error("Mensaje Localized {}", e.getLocalizedMessage());

        } finally {
            logger.debug("No debería haber llegado hasta aquí");
            valorCadena=0;
        }

        System.out.println("Hello, World!");

    }
}