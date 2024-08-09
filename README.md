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
