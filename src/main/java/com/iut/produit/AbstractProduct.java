package com.iut.produit;

abstract  class AbstractProduct {

    private String prname;
    private double prcost;

    protected AbstractProduct(String name, double cost) {
        this.prname = name;
        this.prcost = cost;
    }

    public double getCost() {
        return prcost;
    }

    public double calculatePrice() {
        // Exception non gérée (division par zéro)
        if(prcost != 0 ){
            return prcost / 2.0;
        }
        else {
            //Leve d'exception
            throw new ArithmeticException("Division par zero impossible");
        }
    }

}
