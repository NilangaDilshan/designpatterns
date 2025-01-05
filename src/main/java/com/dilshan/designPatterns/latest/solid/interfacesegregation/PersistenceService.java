package com.dilshan.designPatterns.latest.solid.interfacesegregation;

public interface PersistenceService<T extends Entity> {
    void save(T entity);

    void delete(T entity);

    T findById(Long id);
}
