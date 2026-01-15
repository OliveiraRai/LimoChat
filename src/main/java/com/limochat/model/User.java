package com.limochat.model;

import jakarta.persistence.*;

@Entity // next class will be an entity
@Table(name = "user") // changes table name to your likes
public class User {

    @Id // next variable is an id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private Long id;

    @Column(nullable = false) // value cannot be null
    private String username;

    // empty constructor
    public User() {}

    // getters and setters

}
