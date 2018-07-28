package com.sda.mvc.controller;

import com.sda.mvc.model.Fatigue;
import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.model.Nourishment;
import com.sda.mvc.view.GiantView;

public class GiantController {
    private GiantModel giantModel;
    private GiantView giantView;

    public GiantController(GiantModel giantModel, GiantView giantView) {
        this.giantModel = giantModel;
        this.giantView = giantView;

    }
    public Health getHealth(){
        return this.giantModel.getHealth();
    }
    public void setHealth(Health health){
        this.giantModel.setHealth(health);
    }
    public Fatigue getFatigue(){
        return this.giantModel.getFatigue();
    }
    public void setFatigue(Fatigue fatigue){
        this.giantModel.setFatigue(fatigue);
    }
    public Nourishment getNourishment(){
        return this.giantModel.getNourishment();
    }
    public void setNourishment(Nourishment nourishment){
        this.giantModel.setNourishment(nourishment);
    }
    public void updateView(){
        this.giantView.displayGiant(giantModel);
    }

}
