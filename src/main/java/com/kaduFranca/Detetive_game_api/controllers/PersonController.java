package com.kaduFranca.Detetive_game_api.controllers;

import com.kaduFranca.Detetive_game_api.Dtos.PersonDto;
import com.kaduFranca.Detetive_game_api.models.PersonModel;
import com.kaduFranca.Detetive_game_api.services.PersonService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/property-service")
@AllArgsConstructor
public class PersonController {

    final PersonService personService;

    @PostMapping
    public ResponseEntity<Object> saveEntity(@RequestBody @Valid PersonDto personDto) {
        var personModel = new PersonModel();
        BeanUtils.copyProperties(personDto, personModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.save(personModel));
    }
}
