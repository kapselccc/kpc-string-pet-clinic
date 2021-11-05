package kpc.springframework.springpetclinic.services;

import kpc.springframework.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastname);
}
