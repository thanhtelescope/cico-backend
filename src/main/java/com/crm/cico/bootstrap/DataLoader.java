package com.crm.cico.bootstrap;

import com.crm.cico.model.*;
import com.crm.cico.services.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@AllArgsConstructor
@Component
public class DataLoader implements CommandLineRunner {

    private final CustomerService customerService;
    private final ProfileService profileService;
    private final ShopService shopService;
    private final OwnerService ownerService;
    private final ManagerService managerService;
    private final StaffService staffService;

    @Override
    public void run(String... args) {
        long countCustomers = customerService.count();
        if (countCustomers == 0) {
            loadData();
        }
    }

    private void loadData() {
        Profile profile = Profile.builder()
                .firstName("Airi")
                .lastName("Satou")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Tokyo")
                .state("Tokyo")
                .country("Japan")
                .build();
        Customer customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Angelica")
                .lastName("Ramos")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("London")
                .state("London")
                .country("England")
                .build();

        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();

        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();

        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();

        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();

        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);
        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);
        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);
        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);
        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);
        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();
        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        profile = Profile.builder()
                .firstName("Tiger")
                .lastName("Nixon")
                .birthday(LocalDate.parse("2008-11-28"))
                .phone("+84 774261234")
                .email("tiger@cico.com")
                .address("28th Floor, 1325 6th Avenue")
                .city("Edinburgh")
                .state("Edinburgh")
                .country("US")
                .build();

        customer = Customer.builder()
                .profile(profile)
                .build();

        profileService.save(profile);
        customerService.save(customer);

        Profile ownerProfile = new Profile("Airi", "Satou", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        profileService.save(ownerProfile);
        Owner owner = new Owner(ownerProfile);
        ownerService.save(owner);


        Profile ownerProfile1 = new Profile("Caesar", "Vance", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        Owner owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Cara", "Stevens", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Cedric", "Kelly", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Charde", "Marshall", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Colleen", "Hurst", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Dai", "Rios", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Donna", "Snider", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Doris", "Wilder", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Finn", "Camacho", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Fiona", "Green", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Garrett", "Winters", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Gavin", "Cortez", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Gavin", "Joyce", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Gloria", "Little", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Haley", "Kennedy", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Hermione", "Butler", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Herrod", "Chandler", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Hope", "Fuentes", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Howard", "Hatfield", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Jackson", "Bradshaw", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Jena", "Gaines", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Jenette", "Caldwell", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Jennifer", "Acosta", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);
        ownerProfile1 = new Profile("Jennifer", "Chang", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner1 = new Owner(ownerProfile1);
        profileService.save(ownerProfile1);
        ownerService.save(owner1);

        Profile ownerProfile2 = new Profile("Jonas", "Alexander", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        Owner owner2 = new Owner(ownerProfile2);
        profileService.save(ownerProfile2);
        ownerService.save(owner2);

        Profile ownerProfile3 = new Profile("Quinn", "Flynn", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        Owner owner3 = new Owner(ownerProfile3);
        profileService.save(ownerProfile3);
        ownerService.save(owner3);
        ownerProfile3 = new Profile("Rhona", "Davidson", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner3 = new Owner(ownerProfile3);
        profileService.save(ownerProfile3);
        ownerService.save(owner3);
        ownerProfile3 = new Profile("Sakura", "Yamamoto", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner3 = new Owner(ownerProfile3);
        profileService.save(ownerProfile3);
        ownerService.save(owner3);
        ownerProfile3 = new Profile("Serge", "Baldwin", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner3 = new Owner(ownerProfile3);
        profileService.save(ownerProfile3);
        ownerService.save(owner3);
        ownerProfile3 = new Profile("Shad", "Decker", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner3 = new Owner(ownerProfile3);
        profileService.save(ownerProfile3);
        ownerService.save(owner3);
        ownerProfile3 = new Profile("Shou", "Itou", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner3 = new Owner(ownerProfile3);
        profileService.save(ownerProfile3);
        ownerService.save(owner3);
        ownerProfile3 = new Profile("Sonya", "Frost", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner3 = new Owner(ownerProfile3);
        profileService.save(ownerProfile3);
        ownerService.save(owner3);
        ownerProfile3 = new Profile("Suki", "Burks", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner3 = new Owner(ownerProfile3);
        profileService.save(ownerProfile3);
        ownerService.save(owner3);
        ownerProfile3 = new Profile("Tatyana", "Fitzpatrick", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner3 = new Owner(ownerProfile3);
        profileService.save(ownerProfile3);
        ownerService.save(owner3);
        ownerProfile3 = new Profile("Thor", "Walton", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner3 = new Owner(ownerProfile3);
        profileService.save(ownerProfile3);
        ownerService.save(owner3);
        ownerProfile3 = new Profile("Tiger", "Nixon", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner3 = new Owner(ownerProfile3);
        profileService.save(ownerProfile3);
        ownerService.save(owner3);
        ownerProfile3 = new Profile("Timothy", "Mooney", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        owner3 = new Owner(ownerProfile3);
        profileService.save(ownerProfile3);
        ownerService.save(owner3);

        Profile ownerProfile4 = new Profile("Unity", "Butler", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.SHOP_OWNER);
        Owner owner4 = new Owner(ownerProfile4);
        profileService.save(ownerProfile4);
        ownerService.save(owner4);


        Shop shop = new Shop("1 Nail Salon", "(309)344-0162", "dvinci@webexpert.net", "1470 N Henderson St", "Galesburg", "IL", "17095", "US", 40.9508, -90.3832, owner);
        shopService.save(shop);
        Shop shop1 = new Shop("10 Perfect Nails", "(817)281-3171", "dvinci@webexpert.net", "6651 Watauga Rd Suite#1151", "Fort Worth", "TX", "48439", "US", 32.8687, -97.2516, owner);
        shopService.save(shop1);
        Shop shop2 = new Shop("114 Nails", "(978)774-4117", "dvinci@webexpert.net", "11 Andover", "Danvers", "MA", "25009", "US", 42.5739, -70.9505, owner);
        shopService.save(shop2);
        Shop shop3 = new Shop("2000 Nails", "(918)248-7790", "dvinci@webexpert.net", "808 E Taft St # D", "Sapulpa", "OK", "40037", "US", 35.9978, -96.1373, owner);
        shopService.save(shop3);
        Shop shop4 = new Shop("5th Ave Nail Salon", "(720)904-2022", "dvinci@webexpert.net", "1617 Wazee St Unit D", "Denver", "CO", "8031", "US", 39.7512, -104.9975, owner);
        shopService.save(shop4);
        Shop shop5 = new Shop("8 & 22 Hair Salon", "(305)541-0240", "dvinci@webexpert.net", "2224 Sw 8th St", "Miami", "FL", "12086", "US", 25.7663, -80.235, owner);
        shopService.save(shop5);
        Shop shop6 = new Shop("90 Nails", "(518)962-4445", "dvinci@webexpert.net", "60 Smithfield Blvd", "Plattsburgh", "NY", "36019", "US", 44.737, -73.4626, owner);
        shopService.save(shop6);
        Shop shop7 = new Shop("A 1 Nails", "(702)458-5151", "dvinci@webexpert.net", "1019 Whitney Ranch Dr", "Henderson", "NV", "32003", "US", 36.0622, -115.0567, owner);
        shopService.save(shop7);
        Shop shop8 = new Shop("A Nails", "(252)792-0446", "dvinci@webexpert.net", "819 East Blvd", "Williamston", "NC", "37117", "US", 35.7282, -77.0495, owner);
        shopService.save(shop8);
        Shop shop9 = new Shop("A Serenity Spa", "(806)798-5667", "dvinci@webexpert.net", "8008 Slide Road Unit #11", "Lubbock", "TX", "48303", "US", 33.4516, -101.9805, owner);
        shopService.save(shop9);
        Shop shop10 = new Shop("A To Z Nails", "(530)247-1288", "dvinci@webexpert.net", "173 Lake Blvd", "Redding", "CA", "6089", "US", 40.6518, -122.3125, owner);
        shopService.save(shop10);
        Shop shop11 = new Shop("A. Salon Galleria & Spa", "(401)821-0400", "dvinci@webexpert.net", "1015 Tiogue Avenue", "Coventry", "RI", "44003", "US", 41.6899, -71.6207, owner1);
        shopService.save(shop11);
        Shop shop12 = new Shop("Aavco Products", "(973)952-0131", "dvinci@webexpert.net", "P. O. Box 31", "East Hanover", "NJ", "34027", "US", 40.8189, -74.3642, owner1);
        shopService.save(shop12);
        Shop shop13 = new Shop("Abiella Beauty Salon", "(760)768-1718", "dvinci@webexpert.net", "744 S Imperial Ave # 8", "Calexico", "CA", "6025", "US", 32.6882, -115.5488, owner1);
        shopService.save(shop13);
        Shop shop14 = new Shop("Absolutely Madison Salon", "(248)545-7190", "MChunn@sbcglobal.net", "511 West 11 Mile Road", "Madison Heights", "MI", "26125", "US", 42.508, -83.103, owner1);
        shopService.save(shop14);
        Shop shop15 = new Shop("Absolutely Premium Nails", "(512)341-0011", "thenailtek@aol.com", "1910 Hermitage Suite 105", "Round Rock", "TX", "48491", "US", 30.5225, -97.7248, owner1);
        shopService.save(shop15);
        Shop shop16 = new Shop("Acrylic's 'n' More", "(859)273-2585", "dvinci@webexpert.net", "3761 Forest Green Drive", "Lexington", "KY", "21067", "US", 37.9839, -84.4889, owner1);
        shopService.save(shop16);
        Shop shop17 = new Shop("Adolfo Hair Studio", "(254)235-5458", "dvinci@webexpert.net", "1719 Burnett Ave", "Waco", "TX", "48309", "US", 31.4556, -97.0979, owner1);
        shopService.save(shop17);
        Shop shop18 = new Shop("Aesthetics by Miss Yvonne", "(518)580-0611", "missyvonne@aestheticsbymissyvonne.com", "1112 Route 9P", "Saratoga Springs", "NY", "36091", "US", 43.0842, -73.7411, owner1);
        shopService.save(shop18);
        Shop shop19 = new Shop("Alabaster Box Of Beauty & Spa", "(313)345-2787", "missyvonne@aestheticsbymissyvonne.com", "16901 Griggs St Suite 1", "Detroit", "MI", "26163", "US", 42.4267, -83.1482, owner1);
        shopService.save(shop19);
        Shop shop20 = new Shop("Alexis Beauty Salon", "(708)388-0280", "missyvonne@aestheticsbymissyvonne.com", "13020 Western Ave", "Blue Island", "IL", "17031", "US", 41.6641, -87.6855, owner1);
        shopService.save(shop20);
        Shop shop21 = new Shop("Alexis Beauty Salon", "(773)227-4751", "missyvonne@aestheticsbymissyvonne.com", "1325 N Ashland Ave", "Chicago", "IL", "17031", "US", 41.9022, -87.6726, owner1);
        shopService.save(shop21);
        Shop shop22 = new Shop("Alis Beauty Salon", "(713)227-7927", "missyvonne@aestheticsbymissyvonne.com", "804 Hogan St", "Houston", "TX", "48201", "US", 29.7956, -95.3676, owner2);
        shopService.save(shop22);
        Shop shop23 = new Shop("All About You", "(910)938-8847", "missyvonne@aestheticsbymissyvonne.com", "705 1/2 New Bridge Street", "Jacksonville", "NC", "37133", "US", 34.6773, -77.5232, owner2);
        shopService.save(shop23);
        Shop shop24 = new Shop("All The Rage", "(307)778-7777", "missyvonne@aestheticsbymissyvonne.com", "1414 Campbell Avenue", "Cheyenne", "WY", "56021", "US", 41.1301, -104.8689, owner2);
        shopService.save(shop24);
        Shop shop25 = new Shop("Amarantas Hair Salon", "(860)296-7296", "missyvonne@aestheticsbymissyvonne.com", "468 Franklin Ave", "Hartford", "CT", "9003", "US", 41.7391, -72.6703, owner2);
        shopService.save(shop25);
        Shop shop26 = new Shop("Ambrosia Nail", "(916)391-3669", "missyvonne@aestheticsbymissyvonne.com", "1010 Florin Rd", "Sacramento", "CA", "6067", "US", 38.4962, -121.5288, owner2);
        shopService.save(shop26);
        Shop shop27 = new Shop("American Manicures", "(412)366-7757", "missyvonne@aestheticsbymissyvonne.com", "3471 Babcock Blvd", "Pittsburgh", "PA", "42003", "US", 40.5502, -80.0492, owner2);
        shopService.save(shop27);
        Shop shop28 = new Shop("American Nail", "(215)427-9080", "missyvonne@aestheticsbymissyvonne.com", "2358 East Allegheny Ave.", "Philadelphia", "PA", "42101", "US", 39.9903, -75.1049, owner2);
        shopService.save(shop28);
        Shop shop29 = new Shop("American Nail", "(618)939-5155", "missyvonne@aestheticsbymissyvonne.com", "5720 North Belt West # 30", "Belleville", "IL", "17163", "US", 38.5251, -90.0796, owner3);
        shopService.save(shop29);
        Shop shop30 = new Shop("American Nail Style 2", "(781)639-3556", "missyvonne@aestheticsbymissyvonne.com", "126 Pleasant St", "Marblehead", "MA", "25009", "US", 42.4989, -70.8636, owner3);
        shopService.save(shop30);
        Shop shop31 = new Shop("Americas Barberia", "(831)722-0488", "missyvonne@aestheticsbymissyvonne.com", "3 W Beach St", "Watsonville", "CA", "6087", "US", 36.9274, -121.7472, owner3);
        shopService.save(shop31);
        Shop shop32 = new Shop("Andreas Beauty Salon", "(661)854-0919", "missyvonne@aestheticsbymissyvonne.com", "1006 Haven Dr", "Arvin", "CA", "6029", "US", 35.134, -118.852, owner3);
        shopService.save(shop32);
        Shop shop33 = new Shop("Andy Nail", "(704)525-7799", "missyvonne@aestheticsbymissyvonne.com", "201 West Arrowood Road # Jj", "Charlotte", "NC", "37119", "US", 35.1707, -80.909, owner3);
        shopService.save(shop33);
        Shop shop34 = new Shop("Angel Nails Etc.- Inc.", "(321)674-5000", "slnangels@aol.com", "1542 South Wickham Road", "Melbourne", "FL", "12009", "US", 28.0719, -80.7009, owner3);
        shopService.save(shop34);
        Shop shop35 = new Shop("Angels Nails", "(585)247-5180", "slnangels@aol.com", "2354 Lyell Ave", "Rochester", "NY", "36055", "US", 43.171, -77.716, owner3);
        shopService.save(shop35);
        Shop shop36 = new Shop("Annas Nail & Tanning", "(940)692-2266", "slnangels@aol.com", "3100 Kemp Boulevard # B", "Wichita Falls", "TX", "48485", "US", 33.838, -98.5232, owner3);
        shopService.save(shop36);
        Shop shop37 = new Shop("Annies Nails", "(916)682-1109", "slnangels@aol.com", "6668 Valley Hi Dr", "Sacramento", "CA", "6067", "US", 38.4748, -121.4432, owner3);
        shopService.save(shop37);
        Shop shop38 = new Shop("Aprils Shear Energy", "(573)883-8888", "slnangels@aol.com", "717 Weiler St", "Sainte Genevieve", "MO", "29186", "US", 37.9762, -90.0499, owner3);
        shopService.save(shop38);
        Shop shop39 = new Shop("Aracelys Hair Styles", "(713)681-7600", "slnangels@aol.com", "2106 Antoine Dr", "Houston", "TX", "48201", "US", 29.7972, -95.4933, owner4);
        shopService.save(shop39);


        Profile managerProfile = new Profile("Bruno", "Nash", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.MANAGER);
        Manager manager = new Manager(managerProfile);
        manager.setOwner(owner);
        manager.getShops().add(shop);
        manager.getShops().add(shop1);
        manager.getShops().add(shop2);
        profileService.save(managerProfile);
        managerService.save(manager);

        managerProfile = new Profile("Brielle", "Williamson", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.MANAGER);
        manager = new Manager(managerProfile);
        manager.setOwner(owner);
        manager.getShops().add(shop);
        manager.getShops().add(shop1);
        manager.getShops().add(shop2);
        manager.getShops().add(shop3);
        profileService.save(managerProfile);

        managerService.save(manager);
        managerProfile = new Profile("Brenden", "Wagner", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.MANAGER);
        manager = new Manager(managerProfile);
        manager.setOwner(owner);
        manager.getShops().add(shop);
        manager.getShops().add(shop1);
        manager.getShops().add(shop2);
        profileService.save(managerProfile);

        managerService.save(manager);

        managerProfile = new Profile("Bradley", "Greer", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.MANAGER);
        manager = new Manager(managerProfile);
        manager.setOwner(owner);
        manager.getShops().add(shop4);
        manager.getShops().add(shop5);
        manager.getShops().add(shop6);
        profileService.save(managerProfile);

        managerService.save(manager);
        managerProfile = new Profile("Ashton", "Cox", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.MANAGER);
        manager = new Manager(managerProfile);
        manager.setOwner(owner1);
        manager.getShops().add(shop10);
        manager.getShops().add(shop11);
        profileService.save(managerProfile);
        managerService.save(manager);

        managerProfile = new Profile("Angelica", "Ramos", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.MANAGER);
        manager = new Manager(managerProfile);
        manager.setOwner(owner1);
        manager.getShops().add(shop10);
        profileService.save(managerProfile);
        managerService.save(manager);

        managerProfile = new Profile("Airi", "Satou", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.MANAGER);
        manager = new Manager(managerProfile);
        manager.setOwner(owner1);
        manager.getShops().add(shop12);
        profileService.save(managerProfile);
        managerService.save(manager);

        managerProfile = new Profile("Vivian", "Harrell", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.MANAGER);
        Manager manager1 = new Manager(managerProfile);
        manager1.setOwner(owner1);
        manager1.getShops().add(shop12);
        profileService.save(managerProfile);
        managerService.save(manager1);

        managerProfile = new Profile("Yuri", "Berry", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.MANAGER);
        manager1 = new Manager(managerProfile);
        manager1.setOwner(owner2);
        manager1.getShops().add(shop26);
        profileService.save(managerProfile);
        managerService.save(manager1);

        managerProfile = new Profile("Zenaida", "Frank", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.MANAGER);
        manager1 = new Manager(managerProfile);
        manager1.setOwner(owner2);
        manager1.getShops().add(shop27);
        profileService.save(managerProfile);
        managerService.save(manager1);

        managerProfile = new Profile("Zorita", "Serrano", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.MANAGER);
        manager1 = new Manager(managerProfile);
        manager1.setOwner(owner2);
        manager1.getShops().add(shop28);
        profileService.save(managerProfile);
        managerService.save(manager1);


        Profile staffProfile = new Profile("Staff Angelica", "Ramos", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        Staff staff = new Staff(staffProfile);
        staff.setBoss(owner);
        profileService.save(staffProfile);
        staffService.save(staff);

        staffProfile = new Profile("Staff Ashton", "Cox", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        staff = new Staff(staffProfile);
        staff.setBoss(owner);
        profileService.save(staffProfile);
        staffService.save(staff);

        staffProfile = new Profile("Staff Bradley", "Greer", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        staff = new Staff(staffProfile);
        staff.setBoss(owner);
        profileService.save(staffProfile);
        staffService.save(staff);
        staffProfile = new Profile("Staff Brenden", "Wagner", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        staff = new Staff(staffProfile);
        staff.setBoss(owner);
        profileService.save(staffProfile);
        staffService.save(staff);
        staffProfile = new Profile("Staff Brielle", "Williamson", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        staff = new Staff(staffProfile);
        staff.setBoss(owner);
        profileService.save(staffProfile);
        staffService.save(staff);
        staffProfile = new Profile("Staff Bruno", "Nash", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        staff = new Staff(staffProfile);
        staff.setBoss(owner);
        profileService.save(staffProfile);
        staffService.save(staff);

        Profile staffProfile2 = new Profile("Staff Lael", "Greer", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        Staff staff2 = new Staff(staffProfile2);
        staff2.setBoss(owner1);
        profileService.save(staffProfile2);
        staffService.save(staff2);
        staffProfile2 = new Profile("Staff Martena", "Mccray", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        staff2 = new Staff(staffProfile2);
        staff2.setBoss(owner1);
        profileService.save(staffProfile2);
        staffService.save(staff2);
        staffProfile2 = new Profile("Staff Michael", "Bruce", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        staff2 = new Staff(staffProfile2);
        staff2.setBoss(owner1);
        profileService.save(staffProfile2);
        staffService.save(staff2);
        staffProfile2 = new Profile("Staff Michael", "Silva", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        staff2 = new Staff(staffProfile2);
        staff2.setBoss(owner1);
        profileService.save(staffProfile2);
        staffService.save(staff2);
        staffProfile2 = new Profile("Staff Michelle", "House", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        staff2 = new Staff(staffProfile2);
        staff2.setBoss(owner1);
        profileService.save(staffProfile2);
        staffService.save(staff2);
        staffProfile2 = new Profile("Staff Olivia", "Liang", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        staff2 = new Staff(staffProfile2);
        staff2.setBoss(owner1);
        profileService.save(staffProfile2);
        staffService.save(staff2);
        staffProfile2 = new Profile("Staff Paul", "Byrd", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        staff2 = new Staff(staffProfile2);
        staff2.setBoss(owner1);
        profileService.save(staffProfile2);
        staffService.save(staff2);
        staffProfile2 = new Profile("Staff Prescott", "Bartlett", "+84 774261234", "tiger@cico.com", LocalDate.parse("2008-11-28"), "28th Floor, 1325 6th Avenue", "Edinburgh", "Edinburgh", "US", AccountType.STAFF);
        staff2 = new Staff(staffProfile2);
        staff2.setBoss(owner1);
        profileService.save(staffProfile2);
        staffService.save(staff2);

    }
}
