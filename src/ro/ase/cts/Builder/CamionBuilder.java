package ro.ase.cts.Builder;

public class CamionBuilder implements Builder {

        private String sasiu;
        private String producator;
        private int roti;
        private String interior;

        @Override
        public Builder buildSasiu() {
            this.sasiu="WAULC68E92";
            return this;
        }

        @Override
        public Builder buildProducator() {
            this.producator="Iveco";
            return this;
        }

        @Override
        public Builder buildRoti() {
            this.roti=6;
            return this;
        }


        @Override
        public Builder buildInterior() {
            this.interior="tapitat";
            return this;
        }

        @Override
        public Automobil getAutomobil() {
            return new Automobil(sasiu,producator,roti,interior);
        }
    }


