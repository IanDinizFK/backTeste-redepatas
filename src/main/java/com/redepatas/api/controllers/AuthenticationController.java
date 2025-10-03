package com.redepatas.api.controllers;

import com.redepatas.api.dtos.ReponseLoginDto;
import com.redepatas.api.infra.security.TokenService;
import com.redepatas.api.models.AuthenticationDTO;
import com.redepatas.api.models.ClientModel;
import com.redepatas.api.models.ClientRole;
import com.redepatas.api.models.RegisterDTO;
import com.redepatas.api.repositories.ClientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private ClientRepository repository;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data) {
        try {
            var clientPassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
            var auth = this.authenticationManager.authenticate(clientPassword);
            var token = tokenService.generateToken((ClientModel) auth.getPrincipal());
            return ResponseEntity.ok(new ReponseLoginDto(token));
        } catch (org.springframework.security.core.AuthenticationException e) {
            return ResponseEntity.status(401).body("Credenciais inválidas!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro interno no servidor.");
        }
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid RegisterDTO data) {
        try {
            if (this.repository.findByLogin(data.login()) != null || this.repository.findByPhoneNumber(data.login()) != null) {
                return ResponseEntity.badRequest().body("Email ou telefone já cadastrado!");
            }

            String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
            ClientModel newUser = new ClientModel(data.login(), encryptedPassword, ClientRole.USER);

            this.repository.save(newUser);

            return ResponseEntity.ok().body("Usuário cadastrado com sucesso!");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Dados inválidos fornecidos!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro interno no servidor.");
        }
    }

}
