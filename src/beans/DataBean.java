package beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "data")
@ApplicationScoped
public class DataBean {
    private List<String> countries;
    private List<String> languages;
    private List<String> genders;
    private List<StudentBean> students;

    public DataBean(){
        setCountries();
        setLanguages();
        setGenders();
        setStudents();
    }

    private void setStudents() {
        students = new ArrayList<>();
        students.add(new StudentBean("Steve", "Rock", "kan@lan.ua"));
        students.add(new StudentBean("John", "Doe", "John@doe.us"));
        students.add(new StudentBean("Jack", "Reaper", "reaper@london.gb"));
        students.add(new StudentBean("Hue", "Jakson", "hue@gmail.com"));
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

    public List<StudentBean> getStudents() {
        return students;
    }

    public void checkCode(FacesContext context, UIComponent component, Object object) throws ValidatorException {
        if (object == null){
            return;
        }

        if (!((String)object).startsWith("S2eve")){
            FacesMessage message = new FacesMessage("Code must start with 'S2eve'!");
            throw new ValidatorException(message);
        }
    }
}
