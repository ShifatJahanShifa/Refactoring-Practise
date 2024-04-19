public class ShoppingCart
{
    private List<Item> items;

    // ... other methods ...

    public decimal CalculateTotalPrice()
    {
        decimal totalPrice = 0;

        foreach (var item in items)
        {
            // Extracted method for calculating item price
            decimal itemPrice = CalculateItemPrice(item);

            totalPrice += itemPrice;
        }

        return totalPrice;
    }

    private decimal CalculateItemPrice(Item item)
    {
        // Complex logic for calculating item price
        decimal itemPrice = item.Price * item.Quantity;

        // Additional logic, perhaps applying discounts or taxes
        itemPrice = ApplyDiscounts(itemPrice);
        itemPrice = ApplyTaxes(itemPrice);

        return itemPrice;
    }

    private decimal ApplyDiscounts(decimal price)
    {
        // Complex logic for applying discounts
        // ...

        return price;
    }

    private decimal ApplyTaxes(decimal price)
    {
        // Complex logic for applying taxes
        // ...

        return price;
    }
}