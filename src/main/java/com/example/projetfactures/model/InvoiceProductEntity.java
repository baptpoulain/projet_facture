package com.example.projetfactures.model;

import jakarta.persistence.*;

@Entity
@Table(name = "invoice_product", schema = "bdd_projet_facture")
@IdClass(InvoiceProductEntityPK.class)
public class InvoiceProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_invoice")
    private int idInvoice;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_product")
    private int idProduct;
    @ManyToOne
    @JoinColumn(name = "id_invoice", referencedColumnName = "id_invoice", nullable = false)
    private InvoiceEntity invoiceByIdInvoice;
    @ManyToOne
    @JoinColumn(name = "id_product", referencedColumnName = "id_product", nullable = false)
    private ProductEntity productByIdProduct;

    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvoiceProductEntity that = (InvoiceProductEntity) o;

        if (idInvoice != that.idInvoice) return false;
        if (idProduct != that.idProduct) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idInvoice;
        result = 31 * result + idProduct;
        return result;
    }

    public InvoiceEntity getInvoiceByIdInvoice() {
        return invoiceByIdInvoice;
    }

    public void setInvoiceByIdInvoice(InvoiceEntity invoiceByIdInvoice) {
        this.invoiceByIdInvoice = invoiceByIdInvoice;
    }

    public ProductEntity getProductByIdProduct() {
        return productByIdProduct;
    }

    public void setProductByIdProduct(ProductEntity productByIdProduct) {
        this.productByIdProduct = productByIdProduct;
    }
}
