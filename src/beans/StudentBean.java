package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "student")
public class StudentBean {
    private String firstName;
    private String lastName;
    private String country;
    private String email;
    private byte age;
    private short postalCode;
    private String[] languages;
    private String gender;

    public StudentBean() {
        country = "US";
        gender = "Male";
        languages = new String[]{"Java"};
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public short getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(short postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String credits(){
        return firstName + " " + lastName;
    }
}
