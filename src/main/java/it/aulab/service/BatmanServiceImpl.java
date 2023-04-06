package it.aulab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.aulab.repository.BatmanRepository;

@Component("batmanService")
public class BatmanServiceImpl implements BatmanService {

    @Autowired
    private BatmanRepository repository;


    public BatmanServiceImpl() {
        System.out.println("Create service");
    }
        




    public BatmanRepository getRepository() {
        return repository;
    }

    public void setRepository(BatmanRepository repository) {
        this.repository = repository;
    }

    @Override
    public void attack() {
        if (this.repository.getBatman() != null) 
        System.out.println("Batman attack color: " + this.repository.getBatman().getSuit());
    }

    @Override
    public void climb() {
        if (this.repository.getBatman() != null) 
        System.out.println("Batman climb");
    }

    @Override
    public void glide() {
        if (this.repository.getBatman() != null) 
        System.out.println("Batman glide");
    }

    @Override
    public void goForwardWithBatmobile() {
        if (this.repository.getBatman() != null) 
        System.out.println("Batman go forward with Batmobile");
    }

    @Override
    public void goBackWithBatmobile() {
        if (this.repository.getBatman() != null) 
        System.out.println("Batman go back with Batmobile");
    }
    
}
