package com.javainuse.controller.entites;

import java.io.Serializable;

public class LigneVente implements Serializable{
    private Double quantite;
    private Double prix_u_vente;

    private Produit produit;
    private Vente vente;

    public LigneVente() {
    }

    public LigneVente(Produit produit, Double quantite, Double prix_u_vente) {
        this.produit = produit;
        this.quantite = quantite;
        this.prix_u_vente = prix_u_vente;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Double getQuantite() {
        return quantite;
    }

    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }

    public Double getPrix_u_vente() {
        return prix_u_vente;
    }

    public void setPrix_u_vente(Double prix_u_vente) {
        this.prix_u_vente = prix_u_vente;
    }

    public Vente getVente() {
        return vente;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }

    @Override
    public String toString() {
        return "LigneVente{" + "quantite=" + quantite + ", prix_u_vente=" + prix_u_vente + ", produit=" + produit + ", vente=" + vente + '}';
    }
    
    
}