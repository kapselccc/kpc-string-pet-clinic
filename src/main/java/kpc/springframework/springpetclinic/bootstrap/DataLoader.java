package kpc.springframework.springpetclinic.bootstrap;

import kpc.springframework.springpetclinic.model.Owner;
import kpc.springframework.springpetclinic.model.PetType;
import kpc.springframework.springpetclinic.model.Vet;
import kpc.springframework.springpetclinic.services.OwnerService;
import kpc.springframework.springpetclinic.services.PetTypeService;
import kpc.springframework.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Karol");
        owner1.setLastName("Mis");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Piotr");
        owner2.setLastName("Rybowski");
        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Mariusz");
        vet1.setLastName("Kamien");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Anzy");
        vet2.setLastName("Machatrzkala");
        vetService.save(vet2);

        System.out.println("Loaded Vets");
    }
}
