package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Property;
import com.example.demo.repository.PropertyRepository;

import java.util.Optional;

/**
 * Service class for managing {@link Property} entities.
 * This class contains the business logic for property management,
 * including creating, retrieving, updating, and deleting properties.
 */
@Service
public class PropertyService {

    private final PropertyRepository propertyRepository;

    /**
     * Constructs a PropertyService with the specified PropertyRepository.
     *
     * @param propertyRepository the repository used for property management
     */
    @Autowired
    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    /**
     * Creates a new property and saves it to the repository.
     *
     * @param property the property to be created
     * @return the created property
     */
    public Property createProperty(Property property) {
        return propertyRepository.save(property);
    }

    /**
     * Retrieves a property by its unique identifier.
     *
     * @param id the unique identifier of the property
     * @return an Optional containing the found property, or empty if not found
     */
    public Optional<Property> getPropertyById(Long id) {
        return propertyRepository.findById(id);
    }

    /**
     * Retrieves all properties from the repository.
     *
     * @return an iterable collection of all properties
     */
    public Iterable<Property> getAllProperties() {
        return propertyRepository.findAll();
    }

    /**
     * Updates an existing property with the specified id.
     *
     * @param id       the unique identifier of the property to be updated
     * @param property the property data to update
     * @return the updated property
     */
    public Property updateProperty(Long id, Property property) {
        property.setId(id);
        return propertyRepository.save(property);
    }

    /**
     * Deletes a property by its unique identifier.
     *
     * @param id the unique identifier of the property to be deleted
     */
    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }
}
