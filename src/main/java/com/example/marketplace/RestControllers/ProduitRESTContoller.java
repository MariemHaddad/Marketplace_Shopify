package com.example.marketplace.RestControllers;

import com.example.marketplace.Entities.Boutique;
import com.example.marketplace.Entities.Categorie;
import com.example.marketplace.Entities.Produit;
import com.example.marketplace.Repositories.ProduitRepository;
import com.example.marketplace.Services.ProduitService;
import com.example.marketplace.Services.ProduitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.stream.Collectors;

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




    @PostMapping("/Create/{iduser}")
    @ResponseBody
    public void createProduit(@RequestBody Produit produit, @PathVariable("iduser") Long id) {
        produitService.saveProduit(produit, id);
    }
    @PostMapping("/CreateCategorie")
    @ResponseBody
    public Categorie createCategorie (@RequestBody Categorie categorie) {
        return produitService.saveCategorie(categorie);
    }
    @PostMapping("/CreateBou")
    @ResponseBody
    public Boutique createBoutique (@RequestBody Boutique boutique) {
        return produitService.saveBoutique(boutique);
    }


    @PutMapping("/Update/{idProduit}")
    @ResponseBody
    public Produit updateProduit(@RequestBody Produit produit,@PathParam("idProduit") Long idProduit) {
        return produitService.updateProduit(produit);
    }
    @PutMapping("/Update/{idbou}")
    @ResponseBody
    public Boutique updateBoutique(@RequestBody Boutique boutique,@PathParam("idbou") Long idbou) {
        return produitService.updateBoutique(boutique);
    }
    @PutMapping("/UpdateCategorie/{idCategorie}")
    @ResponseBody
    public Categorie updateCategorie(@RequestBody Categorie categorie,@PathParam("idCategorie") Long idCategorie) {
        return produitService.updateCategorie(categorie);
    }

    @DeleteMapping("/delete/{idProduit}")

    public void deleteProduit(@PathVariable("idProduit") Long idProduit)
    {
        produitService.deleteProduitById(idProduit);
    }
    @GetMapping(value="getAllProduits")
    public List<Produit> findAllProduits(){
        return produitServiceImpl.findAllProduits();
    }
    @GetMapping(value="getAllCategories")
    public List<Categorie> findAllCategories(){
        return produitServiceImpl.findAllCategories();
    }
    @PostMapping("/addproducttocat/{idCategorie}")
    @ResponseBody
    public void assignProductToCategorie(@RequestBody Produit produit,@PathVariable("idCategorie") Long idCategorie )
    {
        produitService.affectprodtocat(produit, idCategorie);
    }
    @PostMapping("/addcattobou/{idbou}")
    @ResponseBody
    public void assignCategorieToBoutique(@RequestBody Categorie categorie,@PathVariable("idbou") Long idbou )
    {
        produitService.affectcattobou(categorie, idbou);
    }
@GetMapping("/filter/{minPrixProduit}/{maxPrixProduit}")
    public List<Produit> filterProduit(@PathVariable ("minPrixProduit")float minPrixProduit, @PathVariable ("maxPrixProduit")float maxPrixProduit) {
        return produitService.filterProduit(minPrixProduit, maxPrixProduit);
    }
}
/*@GetMapping("filter/{minP}/{maxP}/{minC}/{maxC}/{type}")
    public List<Activity> filterActivity(@PathVariable("minP") double minPrice, @PathVariable("maxP") double maxPrice, @PathVariable("minC") int minCapacity, @PathVariable("maxC") int maxCapacity,@PathVariable("type") ActivityType activityType) {
        return iActivityService.filterActivity(minPrice, maxPrice, minCapacity, maxCapacity,activityType);
    }*/

//bilan periodique for the owners od the shops