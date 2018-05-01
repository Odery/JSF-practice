package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "student")
public class StudentBean {
    private String firstName;
    private String lastName;

    public StudentBean() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String credits(){
        return firstName + " " + lastName;
    }
}
