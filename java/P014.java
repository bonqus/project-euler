
public class P014 {
	public static void main (String[] args){
		long i;
		long count=0;
		long maxCount=0;
		for(long n=1000000; n>=500000; n--){
			i=n;
			count=0;
			while (i!=1){
				if (i%2==0){
					i/=2;
				}else{
					i=3*i+1;
				}
				count+=1;
			}
			if (count>=maxCount){
				maxCount=count;
				System.out.println(n +" "+ maxCount);
			}
			
		}
	}
}
