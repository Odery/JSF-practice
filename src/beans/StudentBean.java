package beans;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "student")
public class StudentBean {
    private String firstName;
    private String lastName;
    private String country;
    private List<String> countries;

    public StudentBean() {
        countries = new ArrayList<>();
        countries.add("Ukraine");
        countries.add("US");
        countries.add("Canada");
        countries.add("Brazil");
        countries.add("UK");
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getCountries() {
        return countries;
    }

    public String credits(){
        return firstName + " " + lastName;
    }
}
