package br.org.projetointegrador.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.projetointegrador.model.Usuario;
import br.org.projetointegrador.model.UsuarioLogin;
import br.org.projetointegrador.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/all")
	public ResponseEntity <List<Usuario>> getAll() {
		return ResponseEntity.ok(usuarioService.listarUsuarios());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getById(@PathVariable long id) {
		return usuarioService.buscarUsuarioId(id)
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping("/logar")
	public ResponseEntity<UsuarioLogin> autenticationUsuario(@RequestBody Optional<UsuarioLogin> usuario) {
		
		return usuarioService.logarUsuario(usuario)
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario usuario) {
		
		return usuarioService.cadastrarUsuario(usuario)
			.map(resp -> ResponseEntity.status(HttpStatus.CREATED).body(resp))
			.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
		
	}
	
	@PutMapping("/alterar")
	public ResponseEntity<Usuario> putUsuario(@RequestBody Usuario usuario){
		
		return usuarioService.atualizarUsuario(usuario)
			.map(resp -> ResponseEntity.status(HttpStatus.OK).body(resp))
			.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
	}
}
