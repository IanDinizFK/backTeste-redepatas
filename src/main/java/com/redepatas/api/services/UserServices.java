package com.redepatas.api.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redepatas.api.dtos.UserDtos.UpdateAddressDto;
import com.redepatas.api.models.ClientModel;
import com.redepatas.api.models.Endereco;
import com.redepatas.api.repositories.ClientRepository;

@Service
public class UserServices {

    @Autowired
    private ClientRepository repositoryUser;

    // public String updateOrAddAddress(String login, UpdateAddressDto addressDto) {
    //     var user = repositoryUser.findByLogin(login);
    //     if (user == null) {
    //         return "Usuário não encontrado";
    //     }
    //     var client = (ClientModel) user;
    //     var endereco = client.getEndereco();
    //     if (endereco == null) {
    //         endereco = new Endereco();
    //         client.setEndereco(endereco);
    //     }

    //     if (addressDto.rua() != null)
    //         endereco.setRua(addressDto.rua());
    //     if (addressDto.cidade() != null)
    //         endereco.setCidade(addressDto.cidade());
    //     if (addressDto.estado() != null)
    //         endereco.setEstado(addressDto.estado());
    //     if (addressDto.cep() != null)
    //         endereco.setCep(addressDto.cep());
    //     if (addressDto.numero() != null)
    //         endereco.setNumero(addressDto.numero());
    //     if (addressDto.complemento() != null)
    //         endereco.setComplemento(addressDto.complemento());
    //     repositoryUser.save(client);

    //     return "Endereço atualizado com sucesso";
    // }

}