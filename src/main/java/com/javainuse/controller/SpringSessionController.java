package com.javainuse.controller;

import com.javainuse.controller.entites.LigneVente;
import com.javainuse.controller.entites.Produit;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringSessionController {

    /*@GetMapping("/home")
     public String home(Model model, HttpSession session) {
     @SuppressWarnings("unchecked")
     List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");

     if (messages == null) {
     messages = new ArrayList<>();
     }
     model.addAttribute("sessionMessages", messages);

     return "index";
     }*/
    @GetMapping("/vente")
    public String homeVentes(Model model, HttpSession session) {
        @SuppressWarnings("unchecked")
        List<LigneVente> sessionligneVentes = (List<LigneVente>) session.getAttribute("MY_SESSION_VENTES");
        if (sessionligneVentes == null) {
            sessionligneVentes = new ArrayList<>();
        }
        Produit p = new Produit();
        p.setNom("my name" + Math.random());
        p.setCode("code" + Math.random());
        p.setCode_barre(Math.random() + "*");
        p.setPrix(100.0);
        p.setQuantite(200.0);
        LigneVente ligneVente = new LigneVente(p, 0.0, 0.0);
        model.addAttribute("ligneVente", ligneVente);
        model.addAttribute("sessionligneVentes", sessionligneVentes);

        return "index";
    }

    @PostMapping("/persistMessage")
    public String persistMessage(@RequestParam("msg") String msg, HttpServletRequest request) {
        @SuppressWarnings("unchecked")
        List<String> msgs = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
        if (msgs == null) {
            msgs = new ArrayList<>();
            request.getSession().setAttribute("MY_SESSION_MESSAGES", msgs);
        }
        msgs.add(msg);
        request.getSession().setAttribute("MY_SESSION_MESSAGES", msgs);
        return "redirect:/";
    }

    @PostMapping("/persistVente")
    public String persistVente(@RequestParam("produit.nom") String nom, @RequestParam("produit.code_barre") String code_barre,
            @RequestParam("produit.date_peremption") String date_peremption, @RequestParam("produit.quantite") Double quantite,
            @RequestParam("produit.prix") Double prix, @RequestParam("prix_u_vente") Double prixv, @RequestParam("quantite") Double quantiteV,
            Model model, HttpServletRequest request) {

        LigneVente ligneVente = new LigneVente(new Produit(nom, nom, code_barre, nom, date_peremption, null, quantite, prix, quantite), quantiteV, prixv);
        System.err.println(": >>"+ligneVente.toString());
        @SuppressWarnings("unchecked")
        List<LigneVente> sessionligneVentes = (List<LigneVente>) request.getSession().getAttribute("MY_SESSION_VENTES");
        if (sessionligneVentes == null) {
            sessionligneVentes = new ArrayList<>();
            request.getSession().setAttribute("MY_SESSION_VENTES", sessionligneVentes);
        }
        //ajout de la nouvelle ligne de vente
        sessionligneVentes.add(ligneVente);
        //mise en session de la nouvelle ligne de vente
        request.getSession().setAttribute("MY_SESSION_VENTES", sessionligneVentes);
        return "redirect:/vente";
    }

    @PostMapping("/destroy")
    public String destroySession(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/vente";
    }
}
