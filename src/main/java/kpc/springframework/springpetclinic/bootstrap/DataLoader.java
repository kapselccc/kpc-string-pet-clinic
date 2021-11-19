package kpc.springframework.springpetclinic.bootstrap;

import kpc.springframework.springpetclinic.model.Owner;
import kpc.springframework.springpetclinic.model.Vet;
import kpc.springframework.springpetclinic.services.OwnerService;
import kpc.springframework.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
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
