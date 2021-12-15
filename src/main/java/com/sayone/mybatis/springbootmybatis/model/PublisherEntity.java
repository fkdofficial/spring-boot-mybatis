package com.sayone.mybatis.springbootmybatis.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
//import org.mybatis.spring.annotation.MapperScan;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//@MapperScan
@Entity
@Table(name = "publisher")
public class PublisherEntity implements Serializable {

    private static final long serialVersionUID = -8603612970020919581L;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, length = 120)
    private String email;

    @Column(nullable = false, length = 25)
    private int phoneNumber;

//    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pid", orphanRemoval = true)
    private List<BookEntity> book = new ArrayList<>();

    @Column(nullable = false)
    private String role;

    public PublisherEntity() {
    }

    public PublisherEntity(String firstName, String lastName, String email, int phoneNumber, String address, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<BookEntity> getBook() {
        return book;
    }

    public void setBook(List<BookEntity> book) {
        this.book = book;
    }
}
