package com.sergiojavierre.modelos;

public class Coche {

    private String matricula;
    private Cliente cliente;

    private Boolean marcha;
    private int fuel;

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getFuel() {
        return fuel;
    }

    public void reposta(int fuel) {
        this.fuel += fuel;
    }

    public Boolean conduceHastaDestino(int fuelConsumo) {
        if (fuelConsumo > fuel) {
            fuel = 0;
            return false;
        } else {
            fuel -= fuelConsumo;
            return true;
        }
    }

}
