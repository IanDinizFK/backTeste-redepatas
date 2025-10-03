package com.redepatas.api.controllers;

import com.redepatas.api.dtos.UserDtos.UpdateAddressDto;
import com.redepatas.api.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    // @PutMapping("/updateAddress")
    // public ResponseEntity<String> updateAddress(
    //         @RequestBody @Validated UpdateAddressDto addressDto,
    //         @AuthenticationPrincipal UserDetails userDetails) {
    //     String login = userDetails.getUsername();
    //     String response = userServices.updateOrAddAddress(login, addressDto);
    //     return ResponseEntity.ok(response);
    // }
}
