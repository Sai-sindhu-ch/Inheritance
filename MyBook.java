abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle() {
		return title;
	}
}
class MyBook extends Book{
		void setTitle(String s) {
			System.out.println("the title is:" +s);
		}
		public static void main(String args[]) {
			MyBook mb=new MyBook();
			mb.setTitle("a tale of two cities");
		}
	
}