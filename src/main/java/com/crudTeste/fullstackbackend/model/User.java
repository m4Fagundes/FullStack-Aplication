package com.crudTeste.fullstackbackend.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;


/* Autor - Matheus Fagundes */
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String name;
    private String email;
    @OneToOne
    @JoinColumn(name = "codigoMundo", referencedColumnName = "id")
    private Mundo mundo;



    public long getId() {return id;}

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
