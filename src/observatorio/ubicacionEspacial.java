package observatorio;

public class ubicacionEspacial {

        private double Latitud;
        private String HemisferioLatitud;
        private double Longitud;
        private String HemisferioLongitud;

        public ubicacionEspacial(double latitud, String hemisferioLatitud, String hemisferioLongitud, double longitud) {
            this.Latitud = latitud;
            this.HemisferioLatitud = hemisferioLatitud;
            this.HemisferioLongitud = hemisferioLongitud;
            this.Longitud = longitud;
        }

        public double getLatitud() {
            return Latitud;
        }

        public void setLatitud(double latitud) {
            Latitud = latitud;
        }

        public String getHemisferioLatitud() {
            return HemisferioLatitud;
        }

        public void setHemisferioLatitud(String hemisferioLatitud) {
            HemisferioLatitud = hemisferioLatitud;
        }

        public double getLongitud() {
            return Longitud;
        }

        public void setLongitud(double longitud) {
            Longitud = longitud;
        }

        public String getHemisferioLongitud() {
            return HemisferioLongitud;
        }

        public void setHemisferioLongitud(String hemisferioLongitud) {
            HemisferioLongitud = hemisferioLongitud;
        }

        public double calcularDesplazamiento(ubicacionEspacial otra){
            double dx = this.Latitud - otra.Latitud;
            double dy = this.Longitud - otra.Longitud;
            return Math.sqrt(dx*dx + dy*dy);
        }

        @Override
        public String toString() {
            return "ubicacionEspacial{" +
                    "longitud=" + Longitud +
                    ", latitud=" + Latitud +
                    '}';
        }
    }