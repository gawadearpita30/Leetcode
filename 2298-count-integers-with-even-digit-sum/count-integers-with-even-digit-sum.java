class Solution {
    public int countEven(int num) {
        int count =0;
        int i = 1;
		while(i <= 9 && i <= num)
		{
			if(i%2 == 0)
			{
				count++;
			}
			i++;
		}
		while(i > 9 && i <= num)
		{
			int sum = 0;
			int temp = i ;
			while(temp != 0) //1
			{
				sum += temp % 10; //sum = 1
				temp/=10; //1
			}
			if(sum % 2 == 0)
			{
				count++;
			}
			i++;
		}
		return count;
    }
}