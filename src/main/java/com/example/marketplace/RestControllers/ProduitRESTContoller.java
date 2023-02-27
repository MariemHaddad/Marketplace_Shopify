package com.example.marketplace.RestControllers;

import com.example.marketplace.Entities.Produit;
import com.example.marketplace.Repositories.CategorieRepository;
import com.example.marketplace.Services.ProduitServiceImpl;
import com.example.marketplace.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

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

   // @PutMapping("/Update/{idProduit}")
    //@ResponseBody
    //public Produit updateProduit(@RequestBody Produit produit,@PathParam("idProduit") Long idProduit) {
     //   return produitService.updateProduit(produit);
    //}

    @DeleteMapping ("delete")
    @ResponseBody
    public String deleteProduit(@RequestParam Long idProduit)
    {
        produitServiceImpl.deleteProduit(idProduit);

        return "Produit supprimé";
    }}

