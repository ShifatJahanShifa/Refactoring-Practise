public class Animal{
    // ....

    public void haveLegs()
    {
        // habijabi kisu
    }
}

// only chair
public class Chair{
    private Animal animal;

    // constructor
    Chair()
    {
        animal=new Animal();
    }

    public void Legs()
    {
        animal.haveLegs();
    }
}