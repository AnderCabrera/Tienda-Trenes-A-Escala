/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.modelo;

/**
 *
 * @author informatica
 */
public class productos {
    private int id_producto;
    private String marca;
    private String modelo;
    private String escala;
    private int precio;

    public productos() {
    }

    public productos(String marca, String modelo, String escala, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.escala = escala;
        this.precio = precio;
    }

    // singleton 
    private static productos instance = null;
    
    public static productos getInstance() {
        if (instance == null) {
            instance = new productos();
        }
        return instance;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
