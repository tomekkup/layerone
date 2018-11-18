/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tomekkup.service.interfaces;

import java.io.Serializable;
import java.util.List;
import pl.tomekkup.model.User;

/**
 *
 * @author tomasz.kuprowski
 */
public interface UserManagerLocal extends Serializable {
    
    User getUser(long id);
    
    List<User> loadAll();
}
