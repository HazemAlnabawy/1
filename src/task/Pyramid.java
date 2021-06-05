package task;


/**
 *
 * @author HazemAlnabawy
 */

public class Pyramid {

    private String pharaoh;
    private String modern_name;
    private String site;
    private double height_m;

    public Pyramid(String pharaoh, String modern_name, String site, double height_m){
        this.height_m = height_m;
        this.pharaoh = pharaoh;
        this.modern_name = modern_name;
        this.site = site ;
    }

    public double getHeight_m() {
        return height_m;
    }

    public void setHeight_m(double height_m) {
        this.height_m = height_m;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public String getModern_name() {
        return modern_name;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

}
