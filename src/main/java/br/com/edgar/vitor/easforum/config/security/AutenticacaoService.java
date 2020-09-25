package br.com.edgar.vitor.easforum.config.security;

import br.com.edgar.vitor.easforum.modelo.Usuario;
import br.com.edgar.vitor.easforum.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> optionalUsuario = usuarioRepository.findByEmail(username);

        if (optionalUsuario.isPresent()) {
            return optionalUsuario.get();
        }
        throw new UsernameNotFoundException("Dados inválidos");
    }
}
