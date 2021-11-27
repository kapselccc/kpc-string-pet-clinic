package kpc.springframework.springpetclinic.repositories;

import kpc.springframework.springpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
