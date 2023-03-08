package org.andercabrera.modelo;

public class ventas {
    private int id_cliente;
    private int id_producto;
    private int cantidad;
    private int total;
    private String fecha_compra;

    //singleton
    private static ventas ventas = null;

    public static ventas getInstance() {
        if (ventas == null) {
            ventas = new ventas();
        }
        return ventas;
    }

    public ventas() {
    }

    public ventas(int id_cliente, int id_producto, int cantidad, int total, String fecha_compra) {
        this.id_cliente = id_cliente;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.total = total;
        this.fecha_compra = fecha_compra;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    // @Override
    // public String toString() {
    //     return "ventas{" + "id_cliente=" + id_cliente + ", id_producto=" + id_producto + ", cantidad=" + cantidad + ", total=" + total + ", fecha_compra=" + fecha_compra + '}';
    // }    
}
