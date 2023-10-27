package lab_09;

import java.security.SecureRandom;

public class AnimalWithBuilder {
    protected int speed;
    protected String name;
    protected boolean isFlyable;

    private AnimalWithBuilder(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.isFlyable = builder.isFlyable;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public boolean isFlyable() {
        return isFlyable;
    }

    public static class Builder {
        protected int speed;
        protected String name;
        protected boolean isFlyable;

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            isFlyable = flyable;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            int randomSpeed = new SecureRandom().nextInt(maxSpeed);
            this.speed = randomSpeed;
            return this;
        }

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }
    }

}