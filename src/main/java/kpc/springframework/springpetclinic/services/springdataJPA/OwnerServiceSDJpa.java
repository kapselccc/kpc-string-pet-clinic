package kpc.springframework.springpetclinic.services.springdataJPA;

import kpc.springframework.springpetclinic.model.Owner;
import kpc.springframework.springpetclinic.repositories.OwnerRepository;
import kpc.springframework.springpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerServiceSDJpa implements OwnerService {
     private final OwnerRepository ownerRepository;

    public OwnerServiceSDJpa(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public Owner findByLastName(String lastname) {
        return ownerRepository.findByLastName(lastname);
    }
}
