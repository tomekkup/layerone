/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tomekkup.service;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.tomekkup.model.User;
import pl.tomekkup.service.interfaces.UserManagerLocal;

/**
 *
 * @author tomasz.kuprowski
 */
@Service("userManager")
@Transactional
public class UserManager implements UserManagerLocal {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public User getUser(long id) {
        return sessionFactory.getCurrentSession().load(User.class, id);
    }

    @Override
    public List<User> loadAll() {
        return sessionFactory.getCurrentSession().createNamedQuery("User.listAll", User.class).getResultList();
    }
    
}
