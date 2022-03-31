package Entity;
/*
 *Owner.java
 * VuyolwethuKalolo
 * 214015637
 * 31-03-2022
 */

public class Owner {
        private int ownerId;
        private String ownerName;


        //Construtor

        private Owner(Builder builder) {
            this.ownerId = builder.ownerId;
            this. ownerName= builder.ownerName;

        }

        public int getOwnerId() {
            return ownerId;
        }

        public void setOwnerId(int ownerId) {
            this.ownerId = ownerId;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            ownerName = ownerName;
        }

        @Override
        public String toString() {
            return "Owner{" +
                    "ownerId=" + ownerId +
                    ", OwnerName='" + ownerName + '\'' +
                    '}';
        }

        public static class Builder {
            private int ownerId;
            private String ownerName;

            public Builder setOwnwerId(int ownerId) {
                this.ownerId= ownerId;
                return this;
            }

            public Builder setOwnerName(String ownerName) {
                this.ownerName =ownerName ;
                return this;
            }

            public Builder copy(Owner owner) {

                this.ownerId = owner.ownerId;
                this.ownerName = owner.ownerName;
                return this;
            }

            public Owner build(){
                return new Owner(this);
            }



        }



}
