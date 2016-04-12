package lesson20_simplenotepad;

public class NotepadDemo {

	public static void main(String[] args) {
		
		String title = "Vasko da Gama from Rupcha village";
		String text = "adventurous kids series";
		
		
		String t1 = "\nLorem ipsum dolor sit amet, consectetur .. adipisicing elit sed do eiusmod tempor incididunt";
		String t2 = "Lor emte,xt";
		String t3 = "Lorem text3";
		
		Page page1 = new Page(title, text);
		Page page2 = new Page(title, t2);
		Page page3 = new Page(title, t3);
		
		SimpleNotepad pad = new SimpleNotepad();
		pad.addText(1, t3);
		pad.addText(2, t2);
		pad.addText(4, "asdf asdf asdfa cdf");
		
		pad.addText(3, t3);
		pad.deleteTextOnPage(3);
		
		pad.previewNotepad();
		System.out.println(page1.searchWord("kids"));

		// check for digits
		t2 = t2.replaceAll(" ", "");
		t2 = t2.replaceAll(",", "");
		t2 = t2.replaceAll(".", "");
		
		page2.deleteText();
		page2.addText(t2);
		
		page2.preview();
		// returns false if there is at least 1 digit, and true if there are only letters
		System.out.println(page2.containsDigits());
		
		System.out.println("********");
		pad.printAllPagesWithDigits();
		
		
		// ElectronicSecuredNotepad 
		
		ElectronicSecuredNotepad ied = new ElectronicSecuredNotepad("dfs");
		ied.addText(2, "555");

		// asks for password on SecuredNotepad
		INotepad secured = new SecuredNotepad("bca");
		secured.addText(4, t2);
		
	}
}
