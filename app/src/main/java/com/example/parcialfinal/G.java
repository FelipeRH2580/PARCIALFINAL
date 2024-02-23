package com.example.parcialfinal;public class G {

    // Interfaz Animal
    interface FACTURA {
        void PAGA();
    }

    // Clase base o Superclase
    class completo implements FACTURA {
        protected String nombre;

        // Constructor
        public completo(String nombre) {
            this.nombre = nombre;
        }

        // Método de la interfaz Animal
        public void PAGA() {
            System.out.println(nombre + "EL DIA DE HOY ");
        }
    }

    // Clase derivada o Subclase
    class Subfactura extends completo {
        // Constructor
        public Subfactura(String nombre) {
            super(nombre);
        }

        // Sobrecarga del método comer
        public void PAGA(String TOTAL) {
            System.out.println(nombre + " REALIZADO DEL " + TOTAL);
        }

        // Método adicional
        public void REALIZADO() {
            System.out.println(nombre + "EL PAGO");
        }
    }


}


