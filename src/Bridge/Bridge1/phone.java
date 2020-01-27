package Bridge.Bridge1;

public abstract class phone {
    // aggregation brand
    private brand brand;

    // constructor
    public phone(Bridge.Bridge1.brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }

}
