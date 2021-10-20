package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    int registro;
    static int cantidadCreados;
    Motor motor;

    int  cantidadAsientos () {
        int total = 0;
        for (Asiento x : this.asientos) {
            if (x != null) {
                total++;
            }
        }
        return total;
    }
    String verificarIntegridad() {
        for (Asiento asiento: this.asientos){
            if (asiento != null && asiento.registro != this.registro){
                return "Las piezas no son originales";
            }
        }
        if (this.registro != motor.registro) {return "Las piezas no son originales";} else {return "Auto original";}

    }
}
