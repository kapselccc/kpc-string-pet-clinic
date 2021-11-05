package kpc.springframework.springpetclinic.services.map;

import kpc.springframework.springpetclinic.model.Owner;
import kpc.springframework.springpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMappingService<Owner,Long> implements CrudService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}