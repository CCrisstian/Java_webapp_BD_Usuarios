package org.CCristian.apiservlet.webapp.headers.services;

import org.CCristian.apiservlet.webapp.headers.models.Usuario;

import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> login(String username, String password);
}
