package ar.edu.davinci;

public class SMS extends NotificacionDecorator {
    public SMS(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar_mensaje(String mensaje) {
        String mensajeConPrefijo = "SMS: " + mensaje;
        notificacion.enviar_mensaje(mensajeConPrefijo);
    }
}

