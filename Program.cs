namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console. WriteLine("\nHow much does the dog weigh: ");
            d1. weight = Double . Parse(Console . ReadLine()) ;
            Console. WriteLine("\nWhat is the dog's name: ");

            name = Console. ReadLine();
            d1 . rename (name) ;
            Console. WriteLine("\nWhat color is the dog: ");
            d1. furColor = Console. ReadLine();
        }
    }
}