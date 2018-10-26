package pl.tomekkup;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import org.springframework.stereotype.Component;

@Component("homeBean")
@ViewScoped
public class HomeBean implements Serializable {

    public void showMessage() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Hello Faces & Primefaces World!"));
    }
    
    @PostConstruct
    public void initialize() {
        System.out.println("HomeBean initialized");
    }

}
