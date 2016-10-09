
package cz.upol.inf.pja.lecture02;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "helloWorld")
@RequestScoped
public class Hello {

    private String name = "unknown user";
    
    public Hello() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
