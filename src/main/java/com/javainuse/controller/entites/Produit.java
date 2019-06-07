package com.javainuse.controller.entites;

import java.io.Serializable;
import java.util.Date;



public class Produit implements Serializable{

    private String nom;
    private String variete;
    private String code_barre;
    private String code;
    private String description;
    private Date date_peremption;

    private Double quantite;
    private Double prix;
    private Double prix_moyen;
    private Double prix_vente;
  
    public Produit() {
    }

    public Produit(String nom, String variete, String code_barre, String code, String description, Date date_peremption, Double quantite, Double prix, Double stock_alerte) {
        this.nom = nom;
        this.variete = variete;
        this.code_barre = code_barre;
        this.code = code;
        this.description = description;
        this.date_peremption = date_peremption;
        this.quantite = quantite;
        this.prix = prix;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVariete() {
        return variete;
    }

    public void setVariete(String variete) {
        this.variete = variete;
    }

    public String getCode_barre() {
        return code_barre;
    }

    public void setCode_barre(String code_barre) {
        this.code_barre = code_barre;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_peremption() {
        return date_peremption;
    }

    public void setDate_peremption(Date date_peremption) {
        this.date_peremption = date_peremption;
    }

    public Double getQuantite() {
        return quantite;
    }

    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
  
    public Double getPrix_moyen() {
        return prix_moyen;
    }

    public void setPrix_moyen(Double prix_moyen) {
        this.prix_moyen = prix_moyen;
    }

    public Double getPrix_vente() {
        return prix_vente;
    }

    public void setPrix_vente(Double prix_vente) {
        this.prix_vente = prix_vente;
    }

    @Override
    public String toString() {
        return "Produit{" + "nom=" + nom + ", variete=" + variete + ", code_barre=" + code_barre + ", code=" + code + ", description=" + description + ", date_peremption=" + date_peremption + ", quantite=" + quantite + ", prix=" + prix + ", prix_moyen=" + prix_moyen + ", prix_vente=" + prix_vente + '}';
    }    
}