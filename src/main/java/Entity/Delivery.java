package Entity;

public class Delivery {

    private int deliveryId ;
    private int orderId ;

// private constructor
    private Delivery (Builder builder){
        this.deliveryId = builder.deliveryId;
        this.orderId = builder.orderId;
    }



    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", orderId=" + orderId +
                '}';
    }


    public static class Builder{
        private int deliveryId ;
        private int orderId ;

        public Builder setDeliveryId(int deliveryId) {
            this.deliveryId = deliveryId;
            return this;
        }

        public Builder setOrderId(int orderId) {
            this.orderId = orderId;
            return this;
        }


        public Builder copy(Delivery delivery){
            this.deliveryId = deliveryId;
            this.orderId = orderId;
            return this;
        }

        public Delivery build(){
            return new Delivery(this);
        }













    }







}
