package com.example.client.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "client")
@Data
@NoArgsConstructor
@Setter
@Getter
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;

    // getter, setters, contructors
}
