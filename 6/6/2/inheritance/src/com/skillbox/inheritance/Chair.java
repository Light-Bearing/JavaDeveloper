package com.skillbox.inheritance;

public class Chair extends Furniture {
    private String upholsteryMaterial;

    public String getUpholsteryMaterial() {
        return upholsteryMaterial;
    }

    public void setUpholsteryMaterial(String upholsteryMaterial) {
        this.upholsteryMaterial = upholsteryMaterial;
    }


    @Override
    public String getTypeFurniture() {
        return "Chair";
    }


}
