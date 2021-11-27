package kpc.springframework.springpetclinic.services.springdataJPA;

import kpc.springframework.springpetclinic.model.PetType;
import kpc.springframework.springpetclinic.repositories.PetTypeRepository;
import kpc.springframework.springpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class PetTypeServiceSDJpa implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeServiceSDJpa(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }
}
