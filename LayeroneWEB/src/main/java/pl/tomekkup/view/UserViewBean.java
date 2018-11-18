/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tomekkup.view;

import com.ocpsoft.pretty.faces.annotation.URLMapping;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import pl.tomekkup.model.User;
import pl.tomekkup.service.interfaces.UserManagerLocal;

@Named
@ViewScoped
@URLMapping(id="userView", pattern="/user/#{userViewBean.userId}", viewId="/faces/user/details.xhtml")
public class UserViewBean implements Serializable{
    
    @EJB
    private UserManagerLocal userManager;
    
    private Integer userId;

    public User getUser() {
        return userManager.getUser(userId);
    }
    
    public List<User> getAll() {
        return userManager.loadAll();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
}
