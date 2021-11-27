package kpc.springframework.springpetclinic.services.springdataJPA;

import kpc.springframework.springpetclinic.model.Vet;
import kpc.springframework.springpetclinic.repositories.VetRepository;
import kpc.springframework.springpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetServiceSDJpa implements VetService {

    private final VetRepository vetRepository;

    public VetServiceSDJpa(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }
}
