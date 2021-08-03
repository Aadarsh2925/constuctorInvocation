package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        DayScholar dayScholar=new DayScholar(12,'D',"Aadarsh",5,"oop",16000,"NO 32/3 Vijayanagar");
        System.out.println("FeePerMonth : "+dayScholar.calculateFeePerMonth());
    }
}
