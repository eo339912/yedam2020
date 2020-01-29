package referenceType;

public class GetMaxValueExample {
	public static void main(String[] args) {
		
		int [] intAry = {8, 7, 10, 5, 9};
		int par = 0;
		
		for(int i = 0; i < intAry.length; i++) {
			//System.out.println(intAry[i]);
			
			if(par < intAry[i]) {
				par = intAry[i];
			}
		}
		System.out.println("최대값은 :" + par);
		
		int [] int2Ary = {18, 17, 10, 15, 19};
		par = max(int2Ary);
		System.out.println("최대값은 :" + par);
		
	}
	
	public static int max(int[] ary) {
		int par = 0;
		
		for(int i = 0; i < ary.length; i++) {
			//System.out.println(ary[i]);
			
			if(par < ary[i]) {
				par = ary[i];
			}
		}
		return par;
	}
	
}
