package com.skillbox.inheritance;

public class Table extends Furniture {
    private String typeTable;
    private String countertopMaterial;

    public String getCountertopMaterial() {
        return countertopMaterial;
    }

    public void setCountertopMaterial(String countertopMaterial) {
        this.countertopMaterial = countertopMaterial;
    }

    public String getTypeTable() {
        return typeTable;
    }

    public void setTypeTable(String typeTable) {
        this.typeTable = typeTable;
    }

    @Override
    public String getTypeFurniture() {
        return "Table";
    }
}
