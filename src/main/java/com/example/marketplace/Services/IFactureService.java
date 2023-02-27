package com.example.marketplace.Services;

import com.example.marketplace.Entities.Facture;
import java.util.List;

public interface IFactureService {
    Facture getFactureById(Long id);
    List<Facture> getAllFactures();

    void updateFacture(Facture facture);
    void deleteFacture(Facture f);

    void deleteFactureById(Long idFacture);
    Facture addFacture (Facture facture);
}
