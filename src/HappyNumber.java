
public class HappyNumber {
	public boolean isHappy(int n) {
        int sum = 2;
        int count=0;
        while (n != 1 && count < 100 ){
            sum = 0;
            int length = String.valueOf(n).length();
            for(int i=0; i < length; i++){
                sum+= (n%10)*(n%10);
                n = n/10;
            }
            n=sum;
            sum=0;
            count++;
        }
        
        if (n == 1)
            return true;
        return false;
    }
}
