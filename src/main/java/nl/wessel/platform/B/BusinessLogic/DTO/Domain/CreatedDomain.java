package nl.wessel.platform.B.BusinessLogic.DTO.Domain;

import nl.wessel.platform.B.BusinessLogic.Model.Publisher;

public class CreatedDomain {


    private Long domainID;
    private String name;
    private String TLD;
    private String category;
    private int price;

//   TODO
    private Publisher publisher;


    public Long getDomainID() {
        return domainID;
    }

    public void setDomainID(Long domainID) {
        this.domainID = domainID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTLD() {
        return TLD;
    }

    public void setTLD(String TLD) {
        this.TLD = TLD;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
