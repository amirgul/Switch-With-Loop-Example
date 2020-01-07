public class Main
{

    public static void main(String[] args)
    {

        for(int i = 1; i<= 3; i++)
        {
            switch (i)
            {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                    default:
                        System.out.println("Default case");
                        break;
            }
        }
        System.out.println("After the loop");
    }
}
