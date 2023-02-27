package com.example.marketplace.Services;

import com.example.marketplace.Entities.Facture;
import com.example.marketplace.Repositories.IFactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FactureServiceImpl implements IFactureService{
    @Autowired
    IFactureRepository factureRepository;
    @Override
    public Facture getFactureById(Long id) {
        return null;
    }

    @Override
    public List<Facture> getAllFactures() {
        return null;
    }

    @Override
    public void saveFacture(Facture facture) {

    }

    @Override
    public void updateFacture(Facture facture) {

    }

    @Override
    public void deleteFacture(Long id) {

    }

    @Override
    public Facture addFacture(Facture facture) {
        return  factureRepository.save(facture);
    }
}
