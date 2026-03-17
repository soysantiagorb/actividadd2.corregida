package empresa.Agricola;
import java.util.ArrayList;
public class fruta {


        private String NombreFruta;
        private double Hectareas;
        private double CostoProduccionTon;
        private double PrecioVentaTon;
        private ArrayList<periodoCosecha> Periodos;

        public fruta(String nombreFruta, double hectareas, double costoProduccionTon, ArrayList<periodoCosecha> periodos, double precioVentaTon) {
            this.NombreFruta = nombreFruta;
            this.Hectareas = hectareas;
            this.CostoProduccionTon = costoProduccionTon;
            this.Periodos = periodos;
            this.PrecioVentaTon = precioVentaTon;
        }

        public String getNombreFruta() {
            return NombreFruta;
        }

        public void setNombreFruta(String nombreFruta) {
            NombreFruta = nombreFruta;
        }

        public double getHectareas() {
            return Hectareas;
        }

        public void setHectareas(double hectareas) {
            Hectareas = hectareas;
        }

        public double getCostoProduccionTon() {
            return CostoProduccionTon;
        }

        public void setCostoProduccionTon(double costoProduccionTon) {
            CostoProduccionTon = costoProduccionTon;
        }

        public double getPrecioVentaTon() {
            return PrecioVentaTon;
        }

        public void setPrecioVentaTon(double precioVentaTon) {
            PrecioVentaTon = precioVentaTon;
        }

        public ArrayList<periodoCosecha> getPeriodos() {
            return Periodos;
        }

        public void agregarPeriodo(periodoCosecha periodo){
            Periodos.add(periodo);
        }

        public void eliminarPeriodo(periodoCosecha periodo){
            Periodos.remove(periodo);
        }
        public double gananciaPeriodo(periodoCosecha p){
            return p.gananciaTotal(Hectareas, CostoProduccionTon, PrecioVentaTon);
        }

        @Override
        public String toString(){
            return "Fruta: " + NombreFruta +
                    "\nHectareas: " + Hectareas +
                    "\nCosto Produccion Ton: " + CostoProduccionTon +
                    "\nPrecio Venta Ton: " + PrecioVentaTon;
        }
    }

