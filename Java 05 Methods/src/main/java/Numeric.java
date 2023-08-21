public class Numeric {

    public String DetectIfNumberIsOddOrNot(int number){
        if (number %2==0){
            return "even";
        }else {
            return "odd";
        }
    }

    public int Square(int number){
        return number*number;
    }
    public int cube(int number){
        return (number*number)*(number);
    }
}
