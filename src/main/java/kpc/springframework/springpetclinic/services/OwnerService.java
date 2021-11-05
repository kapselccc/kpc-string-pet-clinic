package kpc.springframework.springpetclinic.services;

import kpc.springframework.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastname);
    Owner findById(Long id);
    Set<Owner> findAll();
    Owner save(Owner owner);
}
