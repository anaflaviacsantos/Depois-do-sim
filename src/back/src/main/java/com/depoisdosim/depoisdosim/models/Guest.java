package com.depoisdosim.depoisdosim.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
// import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = Guest.TABLE_NAME)
public class Guest {
    private static final String TABLE_NAME = "guest";

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100, nullable = false)
    @NotBlank
    @Size(min = 2, max = 100)
    private String name;

    @Email
    @Column(name = "email", length = 100, nullable = false, unique = true)
    @NotBlank
    @Size(min = 2, max = 100)
    private String email;

    @ManyToOne
    @JoinColumn(name = "wedding_id", nullable = false)
    private Wedding wedding;

    public Guest() {
    }

    public Guest(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Guest id(Long id) {
        setId(id);
        return this;
    }

    public Guest name(String name) {
        setName(name);
        return this;
    }

    public Guest email(String email) {
        setEmail(email);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Guest)) {
            return false;
        }
        Guest guest = (Guest) o;
        return Objects.equals(id, guest.id) && Objects.equals(name, guest.name) && Objects.equals(email, guest.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
    
}