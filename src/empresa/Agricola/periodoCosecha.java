package empresa.Agricola;

public class periodoCosecha {

        private String NombrePeriodo;
        private double CantidadToneladas;

        public periodoCosecha(String nombrePeriodo, double cantidadToneladas) {
            this.NombrePeriodo = nombrePeriodo;
            this.CantidadToneladas = cantidadToneladas;
        }

        public String getNombrePeriodo() {
            return NombrePeriodo;
        }

        public void setNombrePeriodo(String nombrePeriodo) {
            NombrePeriodo = nombrePeriodo;
        }

        public double getCantidadToneladas() {
            return CantidadToneladas;
        }

        public void setCantidadToneladas(double cantidadToneladas) {
            CantidadToneladas = cantidadToneladas;
        }

        public double ProduccionTotal(double Hectareas) {
            return CantidadToneladas*Hectareas;

        }
        public double CostoProduccion(double Hectareas, double CostoTonleadas){
            return ProduccionTotal(Hectareas)*CostoTonleadas;
        }

        public double gananciaTotal(double Hectareas,double CostoToneladas, double precioVenta){
            double produccion=ProduccionTotal(Hectareas);
            return (produccion*precioVenta)- (produccion*CostoToneladas);
        }

        @Override
        public String toString() {
            return "PeriodoCosecha{" +
                    "NombrePeriodo='" + NombrePeriodo + '\'' +
                    ", CantidadToneladas=" + CantidadToneladas +
                    '}';
        }
    }

