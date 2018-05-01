package beans;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "data")
public class DataBean {
    private List<String> countries;
    private List<String> languages;
    private List<String> genders;

    public DataBean(){
        setCountries();
        setLanguages();
        setGenders();
    }

    private void setGenders() {
        genders = new ArrayList<>();
        genders.add("Male");
        genders.add("Female");
    }

    private void setCountries(){
        countries = new ArrayList<>();
        countries.add("Ukraine");
        countries.add("US");
        countries.add("Canada");
        countries.add("Brazil");
        countries.add("UK");
    }

    private void setLanguages(){
        languages = new ArrayList<>();
        languages.add("Java");
        languages.add("PHP");
        languages.add("Ruby");
        languages.add("C#");
        languages.add("C++");
    }

    public List<String> getLanguages() {
        return languages;
    }

    public List<String> getCountries() {
        return countries;
    }

    public List<String> getGenders() {
        return genders;
    }
}
