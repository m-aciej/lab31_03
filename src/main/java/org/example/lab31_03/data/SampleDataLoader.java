package org.example.lab31_03.data;

import org.example.lab31_03.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;
import org.example.lab31_03.model.Person;
import org.example.lab31_03.model.Address;

@Component
public class SampleDataLoader implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(SampleDataLoader.class);

    private final PersonRepository repository;

    public SampleDataLoader(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Loading sample data...");

        logger.info("Loading sample data...");

        repository.saveAll(List.of(
                new Person("John", "Deere", "john.deere@example.com", "555-6650",
                        new Address("1st Main St", "San Francisco", "California", "60591")),

                new Person("Jane", "Smith", "jane.smith@example.com", "555-5678",
                        new Address("456 Oak Ave", "Chicago", "Illinois", "60601")),

                new Person("Michael", "Brown", "michael.brown@example.com", "555-1122",
                        new Address("78 Pine Road", "Seattle", "Washington", "98101")),

                new Person("Emily", "Johnson", "emily.johnson@example.com", "555-2233",
                        new Address("12 Maple St", "Boston", "Massachusetts", "02108")),

                new Person("David", "Wilson", "david.wilson@example.com", "555-3344",
                        new Address("900 River Dr", "Austin", "Texas", "73301")),

                new Person("Olivia", "Taylor", "olivia.taylor@example.com", "555-4455",
                        new Address("25 Lake View", "Denver", "Colorado", "80014")),

                new Person("Daniel", "Anderson", "daniel.anderson@example.com", "555-5566",
                        new Address("84 Sunset Blvd", "Los Angeles", "California", "90001")),

                new Person("Sophia", "Thomas", "sophia.thomas@example.com", "555-6677",
                        new Address("17 Cedar Lane", "Portland", "Oregon", "97035")),

                new Person("Matthew", "Jackson", "matthew.jackson@example.com", "555-7788",
                        new Address("300 Hill St", "Phoenix", "Arizona", "85001")),

                new Person("Ava", "White", "ava.white@example.com", "555-8899",
                        new Address("65 Birch Ave", "Miami", "Florida", "33101")),

                new Person("James", "Harris", "james.harris@example.com", "555-9900",
                        new Address("11 Walnut St", "Dallas", "Texas", "75001")),

                new Person("Isabella", "Martin", "isabella.martin@example.com", "555-1010",
                        new Address("222 King St", "Atlanta", "Georgia", "30301")),

                new Person("Benjamin", "Thompson", "benjamin.thompson@example.com", "555-2020",
                        new Address("73 Park Ave", "New York", "New York", "10001")),

                new Person("Mia", "Garcia", "mia.garcia@example.com", "555-3030",
                        new Address("9 Elm Street", "Houston", "Texas", "77001")),

                new Person("Lucas", "Martinez", "lucas.martinez@example.com", "555-4040",
                        new Address("144 Green Rd", "Las Vegas", "Nevada", "88901")),

                new Person("Charlotte", "Robinson", "charlotte.robinson@example.com", "555-5050",
                        new Address("18 Rose St", "Philadelphia", "Pennsylvania", "19019")),

                new Person("Henry", "Clark", "henry.clark@example.com", "555-6060",
                        new Address("501 Spring Ave", "Detroit", "Michigan", "48201")),

                new Person("Amelia", "Rodriguez", "amelia.rodriguez@example.com", "555-7070",
                        new Address("37 Forest Way", "San Diego", "California", "92101")),

                new Person("Alexander", "Lewis", "alexander.lewis@example.com", "555-8080",
                        new Address("250 Ocean Dr", "Tampa", "Florida", "33601")),

                new Person("Harper", "Lee", "harper.lee@example.com", "555-9090",
                        new Address("88 Cherry St", "Nashville", "Tennessee", "37201")),

                new Person("Ethan", "Walker", "ethan.walker@example.com", "555-1111",
                        new Address("14 Lincoln Ave", "Columbus", "Ohio", "43004")),

                new Person("Abigail", "Hall", "abigail.hall@example.com", "555-1212",
                        new Address("7 Market Street", "Charlotte", "North Carolina", "28202")),

                new Person("Logan", "Allen", "logan.allen@example.com", "555-1313",
                        new Address("95 Grand Blvd", "Indianapolis", "Indiana", "46201")),

                new Person("Ella", "Young", "ella.young@example.com", "555-1414",
                        new Address("63 Willow Way", "San Jose", "California", "95101")),

                new Person("Jacob", "King", "jacob.king@example.com", "555-1515",
                        new Address("29 Highland Rd", "Jacksonville", "Florida", "32099")),

                new Person("Scarlett", "Wright", "scarlett.wright@example.com", "555-1616",
                        new Address("410 Adams St", "Memphis", "Tennessee", "37501")),

                new Person("Sebastian", "Scott", "sebastian.scott@example.com", "555-1717",
                        new Address("52 Liberty Ave", "Baltimore", "Maryland", "21201")),

                new Person("Grace", "Green", "grace.green@example.com", "555-1818",
                        new Address("77 Riverbank St", "Milwaukee", "Wisconsin", "53201")),

                new Person("Samuel", "Baker", "samuel.baker@example.com", "555-1919",
                        new Address("5 Oak Hill", "Kansas City", "Missouri", "64101")),

                new Person("Lily", "Adams", "lily.adams@example.com", "555-2021",
                        new Address("138 North St", "New Orleans", "Louisiana", "70112"))
        ));

        logger.info("Sample data loaded.");
    }
}
