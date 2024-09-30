package ar.edu.davinci;

public class NotificacionPush extends NotificacionDecorator {
    public NotificacionPush(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar_mensaje(String mensaje) {
        String mensajeConPush = "Notificación Push: " + mensaje;
        super.enviar_mensaje(mensajeConPush);
    }
}

