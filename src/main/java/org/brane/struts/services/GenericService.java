package org.brane.struts.services;

import org.brane.struts.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

abstract class GenericService<T, ID> {

    @PersistenceContext
    protected EntityManager em;
    protected final Class<T> eClass;

    protected GenericService(Class<T> eClass) {
        this.eClass = eClass;
    }

    @Transactional(readOnly = true)
    public T get(ID id) {
        return em.find(eClass, id);
    }

    @Transactional(readOnly = true)
    public List<T> all() {
        return em.createQuery("select b from Book b", eClass).getResultList();
    }
}
