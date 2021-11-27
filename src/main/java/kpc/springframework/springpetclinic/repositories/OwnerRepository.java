package kpc.springframework.springpetclinic.repositories;

import kpc.springframework.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
    public Owner findByLastName(String lastname);
}
