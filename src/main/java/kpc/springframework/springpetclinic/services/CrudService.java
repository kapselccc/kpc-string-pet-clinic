package kpc.springframework.springpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    void deleteById(ID id);

    void delete(T object);
    
    T save(T object);
}
