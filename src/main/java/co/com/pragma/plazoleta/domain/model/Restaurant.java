package co.com.pragma.plazoleta.domain.model;

public class Restaurant {
    private String name;
    private String nit;
    private String address;
    private String telephone;
    private String urlLogo;
    private String idOwner;

    public Restaurant(String name, String nit, String address, String telephone, String urlLogo, String idOwner) {
        this.name = name;
        this.nit = nit;
        this.address = address;
        this.telephone = telephone;
        this.urlLogo = urlLogo;
        this.idOwner = idOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public String getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(String idOwner) {
        this.idOwner = idOwner;
    }
}
