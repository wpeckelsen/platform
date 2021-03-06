package nl.wessel.platform.B.BusinessLogic.DTO.Publisher;

import nl.wessel.platform.B.BusinessLogic.Model.Deal;
import nl.wessel.platform.B.BusinessLogic.Model.Market;
import nl.wessel.platform.B.BusinessLogic.Model.Order;

import java.util.List;

public class CreatedPublisher {
    private Long publisherID;
    private String name;
    private String email;
    private String password;
    private List<Deal> deals;
    private List<Order> orders;
    private List<Market> markets;

    public Long getPublisherID() {
        return publisherID;
    }
    public void setPublisherID(Long publisherID) {
        this.publisherID = publisherID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<Deal> getDeals() {
        return deals;
    }
    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    public List<Market> getMarkets() {
        return markets;
    }
    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }
}