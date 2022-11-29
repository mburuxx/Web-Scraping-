public class Lottery {
    public static void main(String[] args) {
    
    int lotteryDigit1, lotteryDigit2, lotteryDigit3, lotteryDigit4, lotteryDigit5, lotteryDigit6;
    int lotteryBonus;
    
    for(int i=0; i<1; i++) {
    lotteryDigit1 = (int)(Math.random() * 59 + 1);
    lotteryDigit2 = (int)(Math.random() * 59 + 1);
    lotteryDigit3 = (int)(Math.random() * 59 + 1);
    lotteryDigit4 = (int)(Math.random() * 59 + 1);
    lotteryDigit5 = (int)(Math.random() * 59 + 1);
    lotteryDigit6 = (int)(Math.random() * 59 + 1);
    
    lotteryBonus = (int)(Math.random() * 20 + 1);
    
    System.out.println("Lottery Numbers:");
    System.out.println(lotteryDigit1 + " " + lotteryDigit2 + " " + lotteryDigit3 + " " + lotteryDigit4 + " " + lotteryDigit5 + " " + lotteryDigit6);
    System.out.println("Bonus Number: " + lotteryBonus);
    
    }
    }
}