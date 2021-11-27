package kpc.springframework.springpetclinic.repositories;

import kpc.springframework.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
