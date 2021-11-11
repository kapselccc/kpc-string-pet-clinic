package kpc.springframework.springpetclinic.services.map;

import kpc.springframework.springpetclinic.model.Pet;
import kpc.springframework.springpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMappingService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }
}
