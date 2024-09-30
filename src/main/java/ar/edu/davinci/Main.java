package ar.edu.davinci;

// Main.java
public class Main {
    public static void main(String[] args) {

        Notificacion notificacionBase = new NotificacionBase();

        Notificacion notificacionCorreo = new CorreoElectronico(notificacionBase);
        notificacionCorreo.enviar_mensaje("Hola, este es un mensaje de prueba.");

        Notificacion notificacionSMS = new SMS(notificacionBase);
        notificacionSMS.enviar_mensaje("Hola, este es un mensaje de prueba.");

        Notificacion notificacionPush = new NotificacionPush(notificacionBase);
        notificacionPush.enviar_mensaje("Hola, este es un mensaje de prueba.");

        Notificacion notificacionCompleta = new NotificacionPush(new SMS(new CorreoElectronico(notificacionBase)));
        notificacionCompleta.enviar_mensaje("Hola, este es un mensaje de prueba combinado.");
    }
}
