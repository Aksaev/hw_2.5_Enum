package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private float engineVolume;

    public Transport(String brand, String model, float engineVolume) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        setEngineVolume(engineVolume);

    }

    // Метод начать движение
    public abstract void startMovement();

    // Метод закончить движение
    public abstract void stopMovement();
    public abstract void printType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
    }

}
