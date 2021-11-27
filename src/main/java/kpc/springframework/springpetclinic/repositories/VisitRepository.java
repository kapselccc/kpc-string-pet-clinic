package kpc.springframework.springpetclinic.repositories;

import kpc.springframework.springpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
