package io.github.ha.restudy.java.generic.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractCrudService<T extends JpaRepository<E, ID>, E, ID> {
    private T dao;
    public AbstractCrudService(T dao) {
        this.dao = dao;
    }

    public List<E> findAll() {
        return this.dao.findAll();
    }

    public Optional<E> findById(ID id) {
        return this.dao.findById(id);
    }

    public E save(E e) {
        return this.dao.save(e);
    }

    public void deleteById(ID id) {
        this.dao.deleteById(id);
    }
}
