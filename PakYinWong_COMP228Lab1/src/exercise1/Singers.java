package exercise1;

import java.time.LocalDate;

public class Singers {
    //Instance variable declarations
    private int id;
    private String name;
    private String address;
    private LocalDate dateOfBirth;
    private int albumsPublished;

    //Constructors
    public Singers() {
        this.id = 0;
        this.name = "default";
        this.address = "default";
        this.dateOfBirth = null;
        this.albumsPublished = 0;
    }

    public Singers(int id) {
        this.id = id;
        this.name = "default";
        this.address = "default";
        this.dateOfBirth = null;
        this.albumsPublished = 0;
    }

    public Singers(int id, String name) {
        this.id = id;
        this.name = name;
        this.address = "default";
        this.dateOfBirth = null;
        this.albumsPublished = 0;
    }

    public Singers(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = null;
        this.albumsPublished = 0;
    }

    public Singers(int id, String name, String address, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = 0;
    }

    public Singers(int id, String name, String address, LocalDate dateOfBirth, int albumsPublished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = albumsPublished;
    }
    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setAlbumsPublished(int albumsPublished) {
        this.albumsPublished = albumsPublished;
    }
    public void setAll(int id, String name, String address, LocalDate dateOfBirth, int albumsPublished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = albumsPublished;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public int getAlbumsPublished() {
        return albumsPublished;
    }
}

