package com.example.marketplace.Services;

import com.example.marketplace.Entities.Facture;
import java.util.List;

public interface IFactureService {
    Facture getFactureById(Long id);
    List<Facture> getAllFactures();
    void saveFacture(Facture facture);
    void updateFacture(Facture facture);
    void deleteFacture(Long id);
    Facture addFacture (Facture facture);
}
