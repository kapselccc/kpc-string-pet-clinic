package kpc.springframework.springpetclinic.services;

import kpc.springframework.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Set<Pet> findAll();
    Pet save(Pet pet);
}
