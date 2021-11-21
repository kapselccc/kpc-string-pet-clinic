package kpc.springframework.springpetclinic.bootstrap;

import kpc.springframework.springpetclinic.model.Owner;
import kpc.springframework.springpetclinic.model.Pet;
import kpc.springframework.springpetclinic.model.PetType;
import kpc.springframework.springpetclinic.model.Vet;
import kpc.springframework.springpetclinic.services.OwnerService;
import kpc.springframework.springpetclinic.services.PetTypeService;
import kpc.springframework.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        owner1.setFirstName("Kacper");
        owner1.setLastName("Cencelewski");
        owner1.setAddress("Zwierzewo 65");
        owner1.setCity("Ostroda");
        owner1.setTelephone("666519900");


        Pet pet1 = new Pet();
        pet1.setPetType(savedDogType);
        pet1.setName("Nelson");
        pet1.setBirthDate(LocalDate.now());
        pet1.setOwner(owner1);
        owner1.getPets().add(pet1);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Piotr");
        owner2.setLastName("Rybowski");
        owner2.setAddress("Grunwadzka 7/8");
        owner2.setCity("Gdansk");
        owner2.setTelephone("6714320690");


        Pet pet2 = new Pet();
        pet2.setPetType(savedCatType);
        pet2.setName("Mruczek");
        pet2.setBirthDate(LocalDate.now());
        pet2.setOwner(owner2);
        owner2.getPets().add(pet2);
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
