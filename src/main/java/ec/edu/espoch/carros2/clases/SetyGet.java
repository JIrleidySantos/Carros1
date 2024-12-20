/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.carros2.clases;

import ec.edu.espoch.carros2.enumeraciones.automovil;
import ec.edu.espoch.carros2.enumeraciones.colores;
import ec.edu.espoch.carros2.enumeraciones.combustible;

/**
 *
 * @author mundo
 */
public class SetyGet {
    
    private String marca;
    private double modelo;
    private double motor;
    private combustible tipoGasolina;
    private automovil tipoAutomovil;
    private int numeroPuertas;
    private int numeroAsientos;
    private double velocidadMax;
    private colores color;
    private double velocidadAct;

    public SetyGet() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getModelo() {
        return modelo;
    }

    public void setModelo(double modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public combustible getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(combustible tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public automovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(automovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public colores getColor() {
        return color;
    }

    public void setColor(colores color) {
        this.color = color;
    }

    public double getVelocidadAct() {
        return velocidadAct;
    }

    public void setVelocidadAct(double velocidadAct) {
        this.velocidadAct = velocidadAct;
    }    
    
    public void acelerar (int aumento) {
    
        if (velocidadAct + aumento >velocidadMax ){
        
            System.out.println("No supera la velocidad maxima de: " +velocidadMax + " kilometro/hora ");
        } else {
        
            velocidadAct+= aumento;
            System.out.println("Aceleramiento de velocidad: " +velocidadAct + " kilometro / hora ");
        }
    }
    
    public void desacelerar (int disminuir) {
    
        if (velocidadAct - disminuir < 0 ){
        
            System.out.println("No se acelera bajo 0 kilometro / hora");
            velocidadAct = 0;
        }
    }
    
    public void frenar() {
    
        velocidadAct =  0;
        System.out.println("Velocidad actual que se va a frenar: por 0 kilometro / hora ");
    }
    
    public double tiempoLlegada(double distancia) {
        if (velocidadAct == 0) {
            System.out.println("Vehículo estacionado. No se puede calcula el tiempo de llegada.");
            return -1;
        }
        double tiempo = distancia / velocidadAct;
        System.out.println("El tiempo de llegada es: " + tiempo + " horas.");
        return tiempo;
    }
    
     public void mostrarDatos() {
        System.out.println("Mostrar datos del Automóvil:");
        System.out.println("La marca del automovil: " + marca);
        System.out.println("El modelo del automovil es: " + modelo);
        System.out.println("Color del automovil es: " + color);
        System.out.println("Motor: " + motor + " litros ");
        System.out.println("Tipo de gasolina es: " + tipoGasolina);
        System.out.println("Tipo de Automóvil: " + tipoAutomovil);
        System.out.println("El número de puertas: " + numeroPuertas);
        System.out.println("El numero de asientos: " + numeroAsientos);
        System.out.println("La velocidad máxima del automovil es: " + velocidadMax + " kilometro / hora ");
        System.out.println("La velocidad actual del automovil es: " + velocidadAct + " kilometro / hora ");
    }
}
