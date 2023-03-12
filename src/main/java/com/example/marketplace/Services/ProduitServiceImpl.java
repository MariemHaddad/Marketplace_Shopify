package com.example.marketplace.Services;

import com.example.marketplace.Entities.Boutique;
import com.example.marketplace.Entities.Categorie;
import com.example.marketplace.Entities.Produit;
import com.example.marketplace.Entities.User;
import com.example.marketplace.Repositories.BoutiqueRepository;
import com.example.marketplace.Repositories.CategorieRepository;
import com.example.marketplace.Repositories.ProduitRepository;
import com.example.marketplace.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProduitServiceImpl implements ProduitService{
    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    CategorieRepository categorieRepository;
    @Autowired
    BoutiqueRepository boutiqueRepository;
    @Autowired
    JavaMailSender javaMailSender;
    @Override
    public void affectprodtocat(Produit produit,Long idCategorie) {
        Categorie categorie = categorieRepository.findById(idCategorie).orElse(null);
        produit.setCategorie(categorie);

        produitRepository.save(produit);
    }
    @Override
    public void affectcattobou(Categorie categorie, Long idbou) {
        Boutique boutique = boutiqueRepository.findById(idbou).orElse(null);
        categorie.setBoutique(boutique);

        categorieRepository.save(categorie);
    }
    @Override
    public List<Produit> findAllProduits(){
        return (List<Produit>) produitRepository.findAll();
    }

    @Override
    public List<Categorie> findAllCategories() {
        return (List<Categorie>) categorieRepository.findAll();
    }

    //@Override
    //public void addProd(Produit produit, MultipartFile image) {
      //  if(!image.isEmpty()){
        //}
    //}

    @Override
    public List<Produit> filterProduit(float minPrixProduit, float maxPrixProduit) {
        //List<Produit> allProduit = produitRepository.findAll();
        /*List<Produit> allProduit= (List<Produit>) produitRepository.findAll();
        List<Produit> filterProduit = allProduit.stream().filter(p -> p.getPrixProduit() >= minPrixProduit && p.getPrixProduit() <= maxPrixProduit).collect(Collectors.toList());
        return filterProduit;*/
        return produitRepository.findByPrixProduitBetween(minPrixProduit,maxPrixProduit);

    }



    @Override
    public void  saveProduit(Produit p, Long id) {

        System.out.println(id);
        User u = userRepository.findById(id).orElse(null);
        p.setUser(u);
        produitRepository.save(p);
        this.sendEmail(u.getEmailUser(),"a new product has been added");
    }
    public void sendEmail(String Recipient,String nomUser) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(Recipient);
        message.setSubject("Product added");
        message.setText("bonjour,"+ nomUser + "!\n\n ceci est un exemple de template.");

        javaMailSender.send(message);

    }


    @Override
    public Categorie saveCategorie(Categorie c) {
        return categorieRepository.save(c);
    }
    @Override
    public Boutique saveBoutique(Boutique b) { return boutiqueRepository.save(b);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }
    @Override
    public Categorie updateCategorie(Categorie c) {
        return categorieRepository.save(c);
    }
    @Override
    public Boutique updateBoutique(Boutique b) {
        return boutiqueRepository.save(b);
    }




    @Override
    public void deleteProduit(Produit p) {
        produitRepository.delete(p);
    }

    @Override
    public void deleteProduitById(Long idProduit) {
        produitRepository.deleteById(idProduit);
    }
    @Autowired
    private UserRepository userRepository;

    /*public void sendNotification(User seller, Produit produit) {
        List<User> usersToNotify = userRepository.findUsersByFollowedSellers(seller);
        for (User user : usersToNotify) {
            String message = String.format("Seller %s has added a new tool: %s", seller.getName(), tool.getName());
            Notification notification = new Notification(user, message);
            // Send notification using email, SMS, push notifications, etc.
            // ...
        }*/
    }





