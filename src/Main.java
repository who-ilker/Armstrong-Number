import java.util.Scanner;
// 124 = 1^3 + 2^3 + 4^3
public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = inp.nextInt();
        int digitsNum = digitsNumber(num), resultSumArmstrong;

        /*int number = 3;       // Pow calculation
        int result = 1;
        for (int k = 1; k <= 3; ++k) {
            result = result * number;
            System.out.println("result: "+result);
        }*/

        int tempNum = num, result = 0;
        while (tempNum != 0){
            int base = tempNum % 10;
            int resultDigit = 1;
            for (int i = 1; i <= digitsNum; ++i){
                resultDigit = resultDigit * base;
            }
            result += resultDigit;
            tempNum = tempNum / 10;
        }

        if(result == num){
            System.out.println("The number you entered is an armstrong number");
        }
        else{
            System.out.println("This is not.. result: "+result);
        }

    }

    static int digitsNumber(int number){
        int digitsNum = 0;
        while (number != 0){
            digitsNum++;
            number /= 10;
        }
        return digitsNum;
    }
    static int sumDigitsNumber (int number){
        int digitsNumber = digitsNumber(number), sumDigitsNumber = 0;
        for(int i = 1; i <= digitsNumber; ++i){
            sumDigitsNumber += number % 10;
            number /= 10;
        }
        return sumDigitsNumber;
    }
    /*static int powNumber(int base, int pow){
        return 1;
    }*/
}