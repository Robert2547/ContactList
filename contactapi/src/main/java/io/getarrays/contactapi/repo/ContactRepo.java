package io.getarrays.contactapi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // This annotation is used to indicate that the class provides the mechanism for
            // storage, retrieval, search, update, and delete operation on objects
public interface ContactRepo<Contact> extends JpaRepository<Contact, String> {
    Optional<Contact> findById(String id); // Optional allow this method to return a value or null
}
