import java.util.Scanner;
class Bank{
	double bal = 24582.2;
	public void callInner(double ci){
		String pswd;
		System.out.println("Input the password : ");
		Scanner sc = new Scanner(System.in);
		pswd = sc.nextLine();
		if(pswd.equals("password")){
			Inner in = new Inner();
			in.updateInner(ci);
		}else{
			System.out.println("UnAuthorized entry");
		}
	}
	private class Inner{
		public void updateInner(double ci){
			bal+=bal*(ci/100);
			System.out.println("Balance after adding "+ci+" is "+bal);
		}
	}
}
class MainBank{
	public static void main(String... args){
		Bank out = new Bank();
		out.callInner(10);
	}
}