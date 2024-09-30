package ar.edu.davinci;

public class NotificacionBase implements Notificacion {
    @Override
    public void enviar_mensaje(String mensaje) {
        System.out.println("Mensaje enviado: " + mensaje);
    }
}

