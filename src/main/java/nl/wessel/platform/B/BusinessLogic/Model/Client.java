package nl.wessel.platform.B.BusinessLogic.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;


@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientID;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String email;

    @Column(length = 500)
    private String password;

    @OneToMany(mappedBy = "client")
    @LazyCollection(LazyCollectionOption.FALSE)
    @JsonIgnore
    private Collection<Deal> deals;

    @OneToMany
    private List<Order> orders;

    @ManyToMany
    private List<Market> markets;

    public Long getClientID() {
        return clientID;
    }
    public void setClientID(Long clientID) {
        this.clientID = clientID;
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
    public Collection<Deal> getDeals() {
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
