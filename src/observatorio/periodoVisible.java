package observatorio;

public class periodoVisible {
        private String Periodo;
        private ubicacionEspacial Ubicacion;

        public periodoVisible(String periodo, ubicacionEspacial ubicacion) {
            Periodo = periodo;
            Ubicacion = ubicacion;
        }

        public String getPeriodo() {
            return Periodo;
        }

        public void setPeriodo(String periodo) {
            Periodo = periodo;
        }

        public ubicacionEspacial getUbicacion() {
            return Ubicacion;
        }

        public void setUbicacion(ubicacionEspacial ubicacion) {
            Ubicacion = ubicacion;
        }

        @Override
        public String toString() {
            return "periodoVisible{" +
                    "periodo='" + Periodo + '\'' +
                    ", ubicacion=" + Ubicacion +
                    '}';
        }
    }

