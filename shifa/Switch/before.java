public class bird{
    //  ..... others
    public double getSpeed()
    {
        switch(type) 
        {
            case "blue": 
                return calculateBase();
            case "red":
                return calculateBase()*6.2;
            case "yellow":
                return calculateBase()*89.23;
        }
    }
}