abstract public class bird{
    abstract public double getSpeed();
    //  .....
}

public class blue extends bird{
    public double getSpeed()
    {
        return calculateBase();
    }
}

public class red extends bird{
    public double getSpeed()
    {
        return calculateBase()*6.2;
    }
}

public class yellow extends bird{
    public double getSpeed()
    {
        return calculateBase()*89.23;
    }
}


public class Switch{
    public static void Main(String[] args)
    {
        bird bird=new blue();
        bird.getSpeed();   // will execute getspeed() logic for blue bird

        bird=new yellow();
        bird.getSpeed();   // will execute getspeed() logic for yellow bird
    }
}