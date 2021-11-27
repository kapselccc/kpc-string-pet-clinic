package kpc.springframework.springpetclinic.services.springdataJPA;

import kpc.springframework.springpetclinic.model.Speciality;
import kpc.springframework.springpetclinic.repositories.SpecialityRepository;
import kpc.springframework.springpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialityServiceSDJpa implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialityServiceSDJpa(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }
}