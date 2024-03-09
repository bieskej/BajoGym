package com.example.bajogym.models;
import jakarta.persistence.*;
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false, length = 50)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, length = 30)
    private String firstname;
    @Column(nullable = false, length = 30)
    private String lastname;

    public String getPassword() {return password;
    }

    public String getEmail() {return email;
    }

    public String getFirstname() { return firstname;
    }

    public String getLastname() { return lastname;
    }
}
