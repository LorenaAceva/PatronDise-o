package com.example.demo.Entity;

import com.example.demo.Prototype.ComidaPrototypeI;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Continuación Patrón Diseño Prototype
 * Inicio Patrón Diseño Builder
 *
 * @author Lorena
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comida implements ComidaPrototypeI {
    private String name;
    private String ingrediente1;
    private String ingrediente2;
    private double costeElaboracion;
    private double costeVenta;


    /**
     * Generamos Getter y Setter
     * @return del nombre
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public double getCosteElaboracion() {
        return costeElaboracion;
    }

    public void setCosteElaboracion(double costeElaboracion) {
        this.costeElaboracion = costeElaboracion;
    }

    public double getCosteVenta() {
        return costeVenta;
    }

    public void setCosteVenta(double costeVenta) {
        this.costeVenta = costeVenta;
    }

    public static ComidaBuilder builder() {
        return new ComidaBuilder();

    }

    public static class ComidaBuilder{
        private String name;
        private String ingrediente1;
        private String ingrediente2;
        private double costeElaboracion;
        private double costeVenta;

        public ComidaBuilder(String name, String ingrediente1, String ingrediente2, double costeElaboracion, double costeVenta) {
            this.name = name;
            this.ingrediente1 = ingrediente1;
            this.ingrediente2 = ingrediente2;
            this.costeElaboracion = costeElaboracion;
            this.costeVenta = costeVenta;
        }
        public Comida build (){
            return new Comida(this);
        }

    }
    //Implementación del método de la interfaz
    @Override
    public ComidaPrototypeI getClone() {
        return null;
    }
    /**
     * Fin Diseño Patron Prototype
     */
}
