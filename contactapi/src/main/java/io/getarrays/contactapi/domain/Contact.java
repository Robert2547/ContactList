package io.getarrays.contactapi.domain;

import org.hibernate.annotations.UuidGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // JPA annotation to make this class ready for storage in a JPA-based data store
@Table(name = "contacts") // Name of the table in the database
@Getter // Lombok annotation to generate getters
@Setter // Lombok annotation to generate setters
@NoArgsConstructor // This annotation generates a no-args constructor, which means a constructor
                   // with no arguments
@AllArgsConstructor // This annotation generates a constructor with all the fields in the class
@JsonInclude(JsonInclude.Include.NON_DEFAULT) // This will ignore all fields with default values
public class Contact {
    @Id
    @UuidGenerator // (primary key)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private String id;
    private String name;
    private String phone;
    private String email;
    private String title;
    private String address; // More complex application, Address class should be created
    private String status; // More complex application, Status enum should be created, enum Status {
                           // ACTIVE, INACTIVE }
    private String photoURL;
}
