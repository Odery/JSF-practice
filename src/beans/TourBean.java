package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "tour")
public class TourBean {
    private String tour;

    public TourBean() {
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    public String chosenTour() {
        if (!(tour == null) && tour.equals("city")) {
            return "city_tour";
        } else {
            return "country_tour";
        }
    }
}
