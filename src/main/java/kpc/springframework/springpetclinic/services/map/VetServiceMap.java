package kpc.springframework.springpetclinic.services.map;

import kpc.springframework.springpetclinic.model.Speciality;
import kpc.springframework.springpetclinic.model.Vet;

import kpc.springframework.springpetclinic.services.SpecialityService;
import kpc.springframework.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMappingService<Vet,Long> implements VetService {
    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        if(object != null){
            if(object.getSpecialties() != null){
                object.getSpecialties().forEach(speciality -> {
                    if(speciality.getId() == null){
                        Speciality savedSpeciality = specialityService.save(speciality);
                        speciality.setId(savedSpeciality.getId());
                    }
                });
            }
            return super.save(object);
        }else{
            return null;
        }
    }
}
