public class Main {
    public static void main(String[] args) {

        Numeric numeric =new Numeric();
        int num=27;
        int num2=60;

        System.out.println("The Given Number is "+numeric.DetectIfNumberIsOddOrNot(num));
        System.out.println("The Given Number2 is "+numeric.DetectIfNumberIsOddOrNot(num2));
        System.out.println("The square of "+num+" is "+numeric.Square(num));
        System.out.println("The square of "+num2+" is "+numeric.Square(num2));
        System.out.println("The cube of "+num+" is "+numeric.cube(num));
        System.out.println("The cube of "+num2+" is "+numeric.cube(num2));
    }
}
