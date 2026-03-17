package fabrica.Ropa;

public class prenda {
        private String Modelo;
        private String Tela;
        private double PrecioVentaPZ;
        private double PrecioVentaLote;
        private String Genero;
        private String Temporada;

        public prenda(String modelo, String tela, double precioVentaPZ, double precioVentaLote, String genero, String temporada) {
            this.Modelo = modelo;
            this.Tela = tela;
            this.PrecioVentaPZ = precioVentaPZ;
            this.PrecioVentaLote = precioVentaLote;
            this.Genero = genero;
            this.Temporada = temporada;
        }

        public String getModelo() {
            return Modelo;
        }

        public void setModelo(String modelo) {
            Modelo = modelo;
        }

        public String getTela() {
            return Tela;
        }

        public void setTela(String tela) {
            Tela = tela;
        }

        public String getGenero() {
            return Genero;
        }

        public void setGenero(String genero) {
            Genero = genero;
        }

        public String getTemporada() {
            return Temporada;
        }

        public void setTemporada(String temporada) {
            Temporada = temporada;
        }

        public double precioVentaPZ() {
            return PrecioVentaPZ*1.15;
        }
        public double precioventaLote(){
            return PrecioVentaPZ * 1.05;
        }

        @Override
        public String toString() {
            return "prenda{" +
                    "modelo='" + Modelo + '\'' +
                    ", Tela='" + Tela + '\'' +
                    ", precioventaPZ=" + PrecioVentaPZ +
                    ", precioVentaLote=" + PrecioVentaLote +
                    ", genero='" + Genero + '\'' +
                    ", temporada='" + Temporada + '\'' +
                    '}';
        }
    }

