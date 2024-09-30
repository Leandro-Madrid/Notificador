package ar.edu.davinci;

public class CorreoElectronico extends NotificacionDecorator {
    public CorreoElectronico(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar_mensaje(String mensaje) {
        String mensajeConEncabezado = "Enviando correo: " + mensaje;
        super.enviar_mensaje(mensajeConEncabezado);
    }
}
