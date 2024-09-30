# Sistema de Notificación

Vamos a simular un sistema de notificación que permite enviar mensajes a través de diferentes canales, como correo electrónico, SMS y notificaciones push. Para implementar esta funcionalidad, utilizaremos el patrón Decorator.

Define una interfaz base llamada `Notificacion` que tenga un método `enviar_mensaje(mensaje: str)`. Crea una clase concreta llamada `NotificacionBase` que implemente la interfaz `Notificacion`. Esta clase representará la funcionalidad básica de enviar un mensaje.

Crea clases decoradoras para cada tipo de canal de notificación: `CorreoElectronico`, `SMS` y `NotificacionPush`. Estas clases deben extender la clase `NotificacionDecorator`, que es una clase abstracta que implementa `Notificacion`. Cada clase decoradora debe agregar su propia funcionalidad al mensaje básico, como agregar encabezados para correo electrónico, prefijos para SMS, etc.

Finalmente, crea un cliente de prueba que demuestre cómo se puede utilizar este sistema de notificación. Crea instancias de cada tipo de notificación decorada y envía un mensaje a través de cada una.

## Roles dentro del Patrón Decorator

- **Componente**: `Notificacion`
  - Interfaz que define el método `enviar_mensaje(String mensaje)`.

- **Implementación**: `NotificacionBase`
  - Clase que envía el mensaje básico.

- **Decorator**: `NotificacionDecorator`
  - Clase abstracta que extiende la funcionalidad de las notificaciones.

- **Decoradores**: `CorreoElectronico`, `SMS`, `NotificacionPush`
  - Clases que añaden funcionalidades específicas a las notificaciones.

- **Cliente**: `Main`
  - Clase principal que muestra cómo usar las notificaciones decoradas.
