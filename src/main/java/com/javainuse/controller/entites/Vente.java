package com.javainuse.controller.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


public class Vente implements Serializable{

    private String description;

    private Double prix_total_vente;

    
    List<LigneVente> ligneVentes;

    public Vente() {
    }

    public Vente(String description,Double prix_total_vente) {
        this.description = description;
        this.prix_total_vente = prix_total_vente;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Double getPrix_total_vente() {
        return prix_total_vente;
    }

    public void setPrix_total_vente(Double prix_total_vente) {
        this.prix_total_vente = prix_total_vente;
    }

    public List<LigneVente> getLigneVentes() {
        return ligneVentes;
    }

    public void setLigneVentes(List<LigneVente> ligneVentes) {
        this.ligneVentes = ligneVentes;
    }

    public boolean contains(Object o) {
        return ligneVentes.contains(o);
    }

    public boolean add(LigneVente e) {
        return ligneVentes.add(e);
    }

    public boolean remove(Object o) {
        return ligneVentes.remove(o);
    }

    public boolean addAll(Collection<? extends LigneVente> c) {
        return ligneVentes.addAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return ligneVentes.removeAll(c);
    }

    public LigneVente set(int index, LigneVente element) {
        return ligneVentes.set(index, element);
    }

    public void add(int index, LigneVente element) {
        ligneVentes.add(index, element);
    }

    public LigneVente remove(int index) {
        return ligneVentes.remove(index);
    }
    
    
}