package com.kaduFranca.Detetive_game_api.services;

import com.kaduFranca.Detetive_game_api.Dtos.PersonDto;
import com.kaduFranca.Detetive_game_api.models.PersonModel;
import com.kaduFranca.Detetive_game_api.repositories.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class PersonService {

    final PersonRepository personRepository;

    @Transactional
    public PersonModel save(PersonModel personModel) {
        if(existsByNome(personDto.getCpf())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Aviso: Esse nome já existe.");
        }
        return personRepository.save(personModel);
    }
}
