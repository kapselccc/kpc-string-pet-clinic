package kpc.springframework.springpetclinic.services.map;

import kpc.springframework.springpetclinic.model.PetType;
import kpc.springframework.springpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceMap extends AbstractMappingService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete( object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }
}
