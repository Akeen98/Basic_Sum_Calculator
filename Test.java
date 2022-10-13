public class Test{
	public static void main(String[] args){
		double d = method(10,21);
		float z = (float) d;

		System.out.print(z);

	}
	static double method(int x, int y){
		double avg =(x+y)/2;
		return avg;

	}
}