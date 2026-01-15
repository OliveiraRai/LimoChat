package com.limochat.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity // next class is a db entity
@Table(name = "message") // changes table name to your likes
public class Message {

    @Id // next variable is an id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private Long id;

    @ManyToOne // many messages can be associated to one sender
    @JoinColumn(name = "sender_id", nullable = false) // foreign key
    private User sender; // "Users" points to primary key

    @ManyToOne // many messages can be associated to one receiver
    @JoinColumn(name = "receiver_id", nullable = false) // foreign key
    private User receiver; // "Users" points to primary key

    @Column(nullable = false) // value can't be null
    private String content;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    private Message() {} // constructor

}
