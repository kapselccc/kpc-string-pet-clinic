package kpc.springframework.springpetclinic.services;

import kpc.springframework.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Set<Vet> findAll();
    Vet save(Vet vet);
}
