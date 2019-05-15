/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorunidades;

/**
 *
 * @author daw109
 */
public class Lonxitude {
    double distancia;
    double multiplicador;
    double Kms;
    double Millas;
    double Pulgadas;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getKms() {
        return Kms;
    }

    public void setKms(double Kms) {
        this.Kms = Kms;
    }

    public double getMillas() {
        return Millas;
    }

    public void setMillas(double Millas) {
        this.Millas = Millas;
    }

    public double getPulgadas() {
        return Pulgadas;
    }

    public void setPulgadas(double Pulgadas) {
        this.Pulgadas = Pulgadas;
    }
    
    public double Kms_a_Millas(){
        distancia = this.Millas * 0.621371;
        
        return distancia;
    }
}
