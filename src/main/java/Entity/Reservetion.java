package Entity;

public class Reservetion {
    public  int reserveId;
    public String reserveName;

 // Contructor

    public Reservetion(Builder builder) {
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
        return "Reservetion{" +
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

        public Reservetion.Builder setReserveName(String reserveName) {
            this.reserveName =reserveName ;
            return this;
        }

        public Reservetion.Builder copy(Reservetion reservetion) {

            this.reserveId = reservetion.reserveId;
            this.reserveName = reservetion.reserveName;
            return this;
        }

        public Reservetion build(){
            return new Reservetion(this);
        }
    }
}
