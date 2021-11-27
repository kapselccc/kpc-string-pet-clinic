package kpc.springframework.springpetclinic.repositories;

import kpc.springframework.springpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
