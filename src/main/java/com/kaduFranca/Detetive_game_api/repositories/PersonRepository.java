package com.kaduFranca.Detetive_game_api.repositories;

import com.kaduFranca.Detetive_game_api.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonModel, Long> {
}
