package com.depoisdosim.depoisdosim.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = Gift.TABLE_NAME)
public class Gift {
    public interface CreateGift {}
    public interface UpdateGift {}

    public static final String TABLE_NAME = "gift";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "name", length = 100, nullable = false, unique = true)
    @NotBlank(groups = {CreateGift.class, UpdateGift.class})
    @Size(groups = {CreateGift.class, UpdateGift.class}, min = 2, max = 100)
    private String name;

    @Column(name = "description", length = 255, nullable = false)
    @NotBlank(groups = {CreateGift.class, UpdateGift.class})
    @Size(groups = {CreateGift.class, UpdateGift.class}, min = 1, max = 255)
    private String description;

    @Column(name = "available")
    private Boolean available = true;

    @Column(name = "price", nullable = false)
    @DecimalMin(groups = {CreateGift.class, UpdateGift.class}, value = "0.0")
    private Double price;

    @Column(name = "image", nullable = false)
    private String image;

    @ManyToOne
    @JoinColumn(name = "wedding_id", nullable = false)
    private Wedding wedding;


    public Gift() {
    }

    public Gift(Long id, String name, String description, Boolean available, Double price, Wedding wedding, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.available = available;
        this.price = price;
        this.wedding = wedding;
        this.image = image;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isAvailable() {
        return this.available;
    }

    public Boolean getAvailable() {
        return this.available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Wedding getWedding() {
        return this.wedding;
    }

    public void setWedding(Wedding wedding) {
        this.wedding = wedding;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Gift id(Long id) {
        setId(id);
        return this;
    }

    public Gift name(String name) {
        setName(name);
        return this;
    }

    public Gift description(String description) {
        setDescription(description);
        return this;
    }

    public Gift available(Boolean available) {
        setAvailable(available);
        return this;
    }

    public Gift price(Double price) {
        setPrice(price);
        return this;
    }

    public Gift wedding(Wedding wedding) {
        setWedding(wedding);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Gift)) {
            return false;
        }
        Gift gift = (Gift) o;
        return Objects.equals(id, gift.id) && Objects.equals(name, gift.name) && Objects.equals(description, gift.description) && Objects.equals(available, gift.available) && Objects.equals(price, gift.price) && Objects.equals(wedding, gift.wedding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, available, price, wedding);
    }
    
}
