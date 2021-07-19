/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author User
 */
public class Gas {
    
    private int consumo;
    private double unidad;
    private int estrato;
    private double consumototal;
    private double desconsumo;
    private double impuesto;

    public Gas(int consumo, double unidad, int estrato, double consumototal, double desconsumo, double impuesto) {
        this.consumo = consumo;
        this.unidad = unidad;
        this.estrato = estrato;
        this.consumototal = consumototal;
        this.desconsumo = desconsumo;
        this.impuesto = impuesto;
    }

   
      public void verdatos() {
        System.out.println("El consumo fue:" + consumo);
        System.out.println("Valor de la unidad:" + unidad);
        System.out.println("Estrato del inmueble:" + estrato);
        System.out.println("Costo Total:" + consumototal);
        System.out.println("Descuento o sobrecosto:" + desconsumo);
        System.out.println("Impuesto por infraestructura:" + impuesto);
        System.out.println("TOTAL A PAGAR:"+(desconsumo+impuesto+consumototal) );
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getUnidad() {
        return unidad;
    }

    public void setUnidad(double unidad) {
        this.unidad = unidad;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public double getConsumototal() {
        return consumototal;
    }

    public void setConsumototal(double consumototal) {
        this.consumototal = consumototal;
    }

    public double getDesconsumo() {
        return desconsumo;
    }

    public void setDesconsumo(double desconsumo) {
        this.desconsumo = desconsumo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
      
    
}
