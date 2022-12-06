package com.example.projetfactures.model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "client", schema = "bdd_projet_facture")
public class ClientEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_client")
    private int idClient;
    @Basic
    @Column(name = "adress_client")
    private String adressClient;
    @Basic
    @Column(name = "name_client")
    private String nameClient;
    @Basic
    @Column(name = "tel_client_")
    private String telClient;
    @Basic
    @Column(name = "email_client")
    private String emailClient;
    @Basic
    @Column(name = "postal_code_client")
    private Integer postalCodeClient;
    @Basic
    @Column(name = "city_client")
    private String cityClient;
    @Basic
    @Column(name = "id_users")
    private int idUsers;
    @ManyToOne
    @JoinColumn(name = "id_users", referencedColumnName = "id_users", insertable = false, updatable = false)
    private UsersEntity usersByIdUsers;
    @OneToMany(mappedBy = "clientByIdClient")
    private Collection<InvoiceEntity> invoicesByIdClient;

    public ClientEntity() {
    }

    public ClientEntity(int idClient, String adressClient, String nameClient, String telClient, String emailClient, Integer postalCodeClient, String cityClient, int idUsers) {
        this.idClient = idClient;
        this.adressClient = adressClient;
        this.nameClient = nameClient;
        this.telClient = telClient;
        this.emailClient = emailClient;
        this.postalCodeClient = postalCodeClient;
        this.cityClient = cityClient;
        this.idUsers = idUsers;


    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getAdressClient() {
        return adressClient;
    }

    public void setAdressClient(String adressClient) {
        this.adressClient = adressClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getTelClient() {
        return telClient;
    }

    public void setTelClient(String telClient) {
        this.telClient = telClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public Integer getPostalCodeClient() {
        return postalCodeClient;
    }

    public void setPostalCodeClient(Integer postalCodeClient) {
        this.postalCodeClient = postalCodeClient;
    }

    public String getCityClient() {
        return cityClient;
    }

    public void setCityClient(String cityClient) {
        this.cityClient = cityClient;
    }

    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientEntity client = (ClientEntity) o;

        if (idClient != client.idClient) return false;
        if (idUsers != client.idUsers) return false;
        if (adressClient != null ? !adressClient.equals(client.adressClient) : client.adressClient != null)
            return false;
        if (nameClient != null ? !nameClient.equals(client.nameClient) : client.nameClient != null) return false;
        if (telClient != null ? !telClient.equals(client.telClient) : client.telClient != null) return false;
        if (emailClient != null ? !emailClient.equals(client.emailClient) : client.emailClient != null) return false;
        if (postalCodeClient != null ? !postalCodeClient.equals(client.postalCodeClient) : client.postalCodeClient != null)
            return false;
        if (cityClient != null ? !cityClient.equals(client.cityClient) : client.cityClient != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idClient;
        result = 31 * result + (adressClient != null ? adressClient.hashCode() : 0);
        result = 31 * result + (nameClient != null ? nameClient.hashCode() : 0);
        result = 31 * result + (telClient != null ? telClient.hashCode() : 0);
        result = 31 * result + (emailClient != null ? emailClient.hashCode() : 0);
        result = 31 * result + (postalCodeClient != null ? postalCodeClient.hashCode() : 0);
        result = 31 * result + (cityClient != null ? cityClient.hashCode() : 0);
        result = 31 * result + idUsers;
        return result;
    }

    public UsersEntity getUsersByIdUsers() {
        return usersByIdUsers;
    }

    public void setUsersByIdUsers(UsersEntity usersByIdUsers) {
        this.usersByIdUsers = usersByIdUsers;
    }

    public Collection<InvoiceEntity> getInvoicesByIdClient() {
        return invoicesByIdClient;
    }

    public void setInvoicesByIdClient(Collection<InvoiceEntity> invoicesByIdClient) {
        this.invoicesByIdClient = invoicesByIdClient;
    }
}
