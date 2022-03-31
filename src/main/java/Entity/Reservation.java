package Entity;
/*
 *Reservation.java
 * VuyolwethuKalolo
 * 214015637
 * 31-03-2022
 */

public class Reservation {
        private int reserveId;
        private String reserveName;

     // Constructor

        private Reservation(Builder builder) {
            this.reserveId = builder.reserveId;
            this. reserveName= builder.reserveName;
        }

        public int getReserveId() {
            return reserveId;
        }

        public void setReserveId(int reserveId) {
            this.reserveId = reserveId;
        }

        public String getReserveName() {
            return reserveName;
        }

        public void setReserveName(String reserveName) {
            this.reserveName = reserveName;
        }

        @Override
        public String toString() {
            return "Reservation{" +
                    "reserveId=" + reserveId +
                    ", reserveName='" + reserveName + '\'' +
                    '}';
        }

        public static class Builder {
            private int reserveId ;
            private String reserveName;


            public Builder setReserveId(int reserveId) {
                this.reserveId= reserveId;
                return this;
            }

            public Reservation.Builder setReserveName(String reserveName) {
                this.reserveName =reserveName ;
                return this;
            }

            public Reservation.Builder copy(Reservation reservation) {

                this.reserveId = reservation.reserveId;
                this.reserveName = reservation.reserveName;
                return this;
            }

            public Reservation build(){
                return new Reservation(this);
            }
        }
}
