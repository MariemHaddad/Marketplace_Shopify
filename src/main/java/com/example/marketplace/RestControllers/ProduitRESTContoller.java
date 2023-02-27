package com.example.marketplace.RestControllers;

import com.example.marketplace.Entities.Categorie;
import com.example.marketplace.Entities.Produit;
import com.example.marketplace.Repositories.CategorieRepository;
import com.example.marketplace.Services.ProduitServiceImpl;
import com.example.marketplace.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProduitRESTContoller {
   // @Autowired
    //CategorieRepository categorieRepository;
    // @RequestMapping(method= RequestMethod.GET)
    //public List<Categorie> getAllCategories()
    //{
    //  return categorieRepository.findAll();
    //}
    //@RequestMapping(value="/{id}",method = RequestMethod.GET)
    //public Categorie getCategorieById(@PathVariable("id") Long id) {
    //  return categorieRepository.findById(id).get();
    //}

    @Autowired
    ProduitService produitService;
    @Autowired
    ProduitServiceImpl produitServiceImpl;


    @PostMapping("/Create")
    @ResponseBody
    public Produit createProduit(@RequestBody Produit produit) {
        return produitService.saveProduit(produit);
    }
    @PostMapping("/CreateCategorie")
    @ResponseBody
    public Categorie createCategorie (@RequestBody Categorie categorie) {
        return produitService.saveCategorie(categorie);
    }


    @PutMapping("/Update/{idProduit}")
    @ResponseBody
    public Produit updateProduit(@RequestBody Produit produit,@PathParam("idProduit") Long idProduit) {
        return produitService.updateProduit(produit);
    }
    @PutMapping("/UpdateCategorie/{idCategorie}")
    @ResponseBody
    public Categorie updateCategorie(@RequestBody Categorie categorie,@PathParam("idCategorie") Long idCategorie) {
        return produitService.updateCategorie(categorie);
    }

    @DeleteMapping ("/delete/{id}")
    @ResponseBody
    public void deleteProduit(@PathVariable("id") Long id)
    {
        produitService.deleteProduitById(id);
    }
@GetMapping(value="getAllProduits")
    public List<Produit> findAllProduits(){
    return produitServiceImpl.findAllProduits();
}
@GetMapping(value="getAllCategories")
    public List<Categorie> findAllCategories(){
    return produitServiceImpl.findAllCategories();
}}