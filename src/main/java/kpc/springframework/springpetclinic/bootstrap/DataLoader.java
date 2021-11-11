package kpc.springframework.springpetclinic.bootstrap;

import kpc.springframework.springpetclinic.model.Owner;
import kpc.springframework.springpetclinic.model.Vet;
import kpc.springframework.springpetclinic.services.OwnerService;
import kpc.springframework.springpetclinic.services.VetService;
import kpc.springframework.springpetclinic.services.map.OwnerServiceMap;
import kpc.springframework.springpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Karol");
        owner1.setLastName("Mis");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Piotr");
        owner2.setLastName("Rybowski");
        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Mariusz");
        vet1.setLastName("Kamien");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Anzy");
        vet2.setLastName("Machatrzkala");
        vetService.save(vet2);

        System.out.println("Loaded Vets");
    }
}
