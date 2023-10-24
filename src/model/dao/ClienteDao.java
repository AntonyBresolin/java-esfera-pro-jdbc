package model.dao;

import model.entities.Cliente;

import java.util.List;

public interface ClienteDao {
    void insert(Cliente obj);
    void update(Cliente obj);
    void deleteById(Integer id);
    Cliente findById(Integer id);
    Cliente findByName(String name);
    List<Cliente> findAll();
}
