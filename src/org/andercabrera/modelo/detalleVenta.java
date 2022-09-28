/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.modelo;

/**
 *
 * @author informatica
 */
public class detalleVenta {
    private int id_venta;
    private int id_producto;
    private int cantidad_;

    public detalleVenta() {
    }

    public detalleVenta(int id_venta, int id_producto, int cantidad_) {
        this.id_venta = id_venta;
        this.id_producto = id_producto;
        this.cantidad_ = cantidad_;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad_() {
        return cantidad_;
    }

    public void setCantidad_(int cantidad_) {
        this.cantidad_ = cantidad_;
    }
    
}
