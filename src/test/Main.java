package test;

class Buyer{
	private int MyMoney;
	private int AppleCnt;
	
	public Buyer(int myMoney, int appleCnt) {
		MyMoney = myMoney;
		AppleCnt = appleCnt;
	}
	
	public void Payment(Seller seller, int money){
		MyMoney -= money;
		int cnt = seller.Receive(money);
		AppleCnt+=cnt;
	}
	public void ShowInfo() {

		System.out.println("--------구매자정보--------");
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
		
	}
}
class Seller{
	private int MyMoney;
	private int AppleCnt;
	public int Price;
	
	public Seller(int myMoney, int appleCnt, int price) {
		MyMoney = myMoney;
		AppleCnt = appleCnt;
		Price = price;
	}
	public int Receive(int money) {
		MyMoney+=money;
		int revcnt=money/Price;
		AppleCnt-=revcnt;

		return revcnt;
	}
	public void ShowInfo() {

		System.out.println("--------판매자정보--------");
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
		System.out.println("개당 가격 : " + Price);
	}
}
public class Main {
	public static void main(String[] args) {
		Seller 사과장수1 = new Seller(1000000,100,1000);	
		Buyer 홍길동 = new Buyer(10000,0);		
		Buyer 유진 = new Buyer(20000,0);		
		Buyer 경민 = new Buyer(30000,0);		
		홍길동.Payment(사과장수1, 2000);
		유진.Payment(사과장수1,5000);
		경민.Payment(사과장수1, 3000);
		사과장수1.ShowInfo();
		홍길동.ShowInfo();
		유진.ShowInfo();
		경민.ShowInfo();
	}
}
