package com.codegym.repository.impl;

import com.codegym.model.Customer;
import com.codegym.repository.IGeneralRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CustomerRepository implements IGeneralRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findOne(Long id) {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c where  c.id=:id", Customer.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }


    @Override
    public void save(Customer customer) {
        if (customer.getId() != null) {
            em.merge(customer);
        } else {
            em.persist(customer);
        }
    }

    @Override
    public void remove(Long id) {
        Customer customer = findOne(id);
        if (customer != null) {
            em.remove(customer);
        }
    }
}
