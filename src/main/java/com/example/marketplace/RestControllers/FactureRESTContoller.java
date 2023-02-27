package com.example.marketplace.RestControllers;

import com.example.marketplace.Entities.Facture;
import com.example.marketplace.Services.FactureServiceImpl;
import com.example.marketplace.Services.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FactureRESTContoller {
    @Autowired
    IFactureService factureService;

    @PostMapping("/facture")
    public  Facture savefacture (@RequestBody Facture facture){
       return factureService.addFacture(facture);


    }
    @DeleteMapping ("/delete/{idFacture}")

    public void deleteFacture(@PathVariable("idFacture") Long idFacture)
    {
        factureService.deleteFactureById(idFacture);
    }}

