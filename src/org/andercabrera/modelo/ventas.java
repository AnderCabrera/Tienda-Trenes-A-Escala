/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.modelo;

/**
 *
 * @author informatica
 */
public class ventas {
    private int id_cliente;
    private String fecha_compra;

    public ventas() {
    }

    public ventas(int id_cliente, String fecha_compra) {
        this.id_cliente = id_cliente;
        this.fecha_compra = fecha_compra;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    
}
