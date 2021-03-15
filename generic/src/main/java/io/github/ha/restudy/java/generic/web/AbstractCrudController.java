package io.github.ha.restudy.java.generic.web;

import io.github.ha.restudy.java.generic.service.ICrudService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class AbstractCrudController<T extends ICrudService<E, ID>, E, ID> {
    private T service;
    public AbstractCrudController(T service) {
        this.service = service;
    }

    @GetMapping
    @ResponseBody
    public List<E> fetch() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    @ResponseBody
    public E get(@PathVariable("id") ID id) {
        // 由于是示例这里就不考虑没有数据的情况了
        return this.service.findById(id).get();
    }

    @PostMapping
    @ResponseBody
    public E create(@RequestBody E e) {
        return this.service.save(e);
    }

    @PutMapping("{id}")
    @ResponseBody
    public E update(@RequestBody E e) {
        return this.service.save(e);
    }

    @DeleteMapping("{id}")
    @ResponseBody
    public E delete(@PathVariable("id") ID id) {
        E e = this.service.findById(id).get();
        this.service.deleteById(id);
        return e;
    }
}
