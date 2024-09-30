package ar.edu.davinci;

public abstract class NotificacionDecorator implements Notificacion {
    protected Notificacion notificacion;

    public NotificacionDecorator(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void enviar_mensaje(String mensaje) {
        notificacion.enviar_mensaje(mensaje);
    }
}

