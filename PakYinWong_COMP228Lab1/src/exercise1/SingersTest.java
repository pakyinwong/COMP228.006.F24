package exercise1;

import java.time.LocalDate;

public class SingersTest {
    public static void main(String[] args) {
        //Create Singer1 with no argument
        Singers singer1 = new Singers();
        //Display the values of Singer1
        System.out.println("Singer1:");
        System.out.println("Singer1's id:" + singer1.getId());
        System.out.println("Singer1's name:" + singer1.getName());
        System.out.println("Singer1's address:" + singer1.getAddress());
        System.out.println("Date of birth:" + singer1.getDateOfBirth());
        System.out.println("Number of albums published:" + singer1.getAlbumsPublished());

        //Create Singer2 with all argument
        Singers singer2 = new Singers();
        //Set the value of singer2
        singer2.setId(1);
        singer2.setName("Pak Yin Wong");
        singer2.setAddress("North York, Toronto");
        singer2.setDateOfBirth(LocalDate.of(1991, 8, 30));
        singer2.setAlbumsPublished(10);
        //Display the values of Singer2
        System.out.println("Singer2:");
        System.out.println("Singer2's id:" + singer2.getId());
        System.out.println("Singer2's name:" + singer2.getName());
        System.out.println("Singer2's address:" + singer2.getAddress());
        System.out.println("Date of birth:" + singer2.getDateOfBirth());
        System.out.println("Number of albums published:" + singer2.getAlbumsPublished());
    }
}

