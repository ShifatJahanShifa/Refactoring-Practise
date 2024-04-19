class Order{
    // replace the method with method call
    public double price()
    {
        new CalculatePrice(this).compute();
    }
}

class CalculatePrice()
{
    private Order order;
    private double primaryBasePrice;
    private double secondaryBasePrice;
    private double tertiaryBasePrice;

    CalculatePrice(double primaryBasePrice,double secondaryBasePrice,double tertiaryBasePrice)
    {
        //  .... initialize
    }

    public double compute() {
        // Perform long computation.
    }
}