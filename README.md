<h1 align="center">Tabla SQL usuarios</h1>

- Tabla "usuarios"
```sql
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(12) NOT NULL,
    password VARCHAR(60) NOT NULL,
    email VARCHAR(45) NOT NULL
);
```
- Contenido de la tabla "usuarios"
```sql
INSERT INTO usuarios (username, password, email) VALUES
('admin', '12345', 'admin@correo.com'),
('andres', '12345', 'andres@correo.com');
```

<h1 align="center">Nuevas clases y modificaciones</h1>

<h2>Clase Usuario</h2>

Paquete: <b>org.CCristian.apiservlet.webapp.headers.models</b>

- <b>Objetivo</b>: Representar a un usuario en el sistema con sus atributos básicos.
- <b>Función</b>: Modela un objeto Usuario con propiedades como id, username, password, y email. Proporciona métodos para acceder y modificar estos atributos.

<h2>Interfaz UsuarioRepository</h2>

Paquete: <b>org.CCristian.apiservlet.webapp.headers.repositories</b>

- <b>Objetivo</b>: Definir las operaciones básicas para manipular los datos de los usuarios en la base de datos.
- <b>Función</b>: Extiende una interfaz genérica Repository y declara métodos específicos para Usuario, como porUsername, que busca un usuario por su nombre de usuario.

<h2>Clase UsuarioRepositoryImpl</h2>

Paquete: <b>org.CCristian.apiservlet.webapp.headers.repositories</b>

- <b>Objetivo</b>: Implementar la interfaz UsuarioRepository y realizar operaciones de base de datos relacionadas con los usuarios.
- <b>Función</b>: Utiliza una conexión SQL (Connection) para ejecutar consultas y comandos SQL. Implementa métodos como porUsername para buscar usuarios en la base de datos, y otros métodos CRUD (crear, leer, actualizar, eliminar) que aún no están implementados completamente.

<h2>Interfaz UsuarioService</h2>

Paquete: <b>org.CCristian.apiservlet.webapp.headers.services</b>

- <b>Objetivo</b>: Definir las operaciones de negocio relacionadas con los usuarios.
- <b>Función</b>: Proporciona el método login para autenticar usuarios basado en el nombre de usuario y contraseña.

<h2>Clase UsuarioServiceImpl</h2>

Paquete: <b>org.CCristian.apiservlet.webapp.headers.services</b>

- <b>Objetivo</b>: Implementar la interfaz UsuarioService y gestionar la lógica de negocio para la autenticación de usuarios.
- <b>Función</b>: Se comunica con UsuarioRepository para verificar las credenciales del usuario. Utiliza el método login para validar el nombre de usuario y la contraseña, devolviendo un objeto Optional<Usuario> si las credenciales son correctas.

<h2>Clase LoginServlet</h2>

Paquete: <b>org.CCristian.apiservlet.webapp.headers.controllers</b>

- <b>Objetivo</b>: Gestionar las solicitudes HTTP para el inicio de sesión de usuarios.
- <b>Función</b>:
  - <b>Método doGet</b>: Comprueba si el usuario ya ha iniciado sesión y muestra un mensaje de bienvenida o redirige al formulario de inicio de sesión.
  - <b>Método doPost</b>: Recibe los datos de inicio de sesión desde el formulario, utiliza UsuarioService para autenticar al usuario, y gestiona la sesión del usuario en el servidor. Si la autenticación es exitosa, inicia una sesión y redirige al usuario a la página de bienvenida; de lo contrario, muestra un error de autorización.
