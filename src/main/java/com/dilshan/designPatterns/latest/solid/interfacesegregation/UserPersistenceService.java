package com.dilshan.designPatterns.latest.solid.interfacesegregation;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class UserPersistenceService implements PersistenceService<User> {

    private static final Map<Long, User> USERS = new ConcurrentHashMap<>();

    @Override
    public void save(User entity) {
        USERS.put(entity.getId(), entity);
    }

    @Override
    public void delete(User entity) {
        USERS.remove(entity.getId());
    }

    @Override
    public User findById(Long id) {
        return USERS.get(id);
    }

    public List<User> findByName(String name) {
        return USERS.values().stream().filter(user -> user.getName().equals(name)).collect(Collectors.toList());
    }
}
