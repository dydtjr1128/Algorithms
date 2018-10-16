
import java.util.HashMap;
import java.util.Stack;

public class Main {
	public static boolean isHTML(String str) {
		String string = str.trim();
		Stack<String> stack = new Stack<>();
		HashMap<String, Integer> tagPriority = new HashMap<>();
		String openTag[] = { "<document>", "<header>", "<body>", "<footer>", "<p>", "<br>", };
		String closeTag[] = { "</document>", "</header>","</body>", "</footer>", "</p>", "</br>" };
		int priority[] = {1, 2, 3, 2, 4, 4};
		//System.out.println(string);
		for(int i=0; i<openTag.length; i++) {
			tagPriority.put(openTag[i], priority[i]);
			tagPriority.put(closeTag[i], priority[i]);
		}
		
		
		if (string.startsWith(openTag[0]) && string.endsWith(closeTag[0])) {
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == '<') {
					String temp = string.substring(i, string.indexOf('>', i) + 1);
					if(1<temp.length() && temp.charAt(1) == '/') {
						if(temp.equals("</br>")) {
							continue;
						}
						else if(temp.replace("</", "").replace(">", "").equals(stack.peek().replace("<", "").replace(">", ""))) {
							stack.pop();
						}
						else {
							return false;
						}
					}
					else {	
						if(temp.equals("<br>"))
							continue;						
						else if(stack.size()==0 || tagPriority.get(stack.peek())+2 >= tagPriority.get(temp)) {
/*							if(stack.size()>0) {
								System.out.println(tagPriority.get(stack.peek()) +" " +  tagPriority.get(temp));
							}					*/								
							stack.push(temp);
						}
						else
							return false;
					}					
					//System.out.println(temp);				
				}
			}
		}
		else {
			
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isHTML("<document>\r\n" + "<header>한글과 컴퓨터</header>\r\n" + "<body>\r\n"
				+ "<p>한컴오피스 2018</p>\r\n" + "<br></br>\r\n" + "<p>음성인식 기능으로 말로 문서를 작성하고</p>\r\n" + "</br>\r\n"
				+ "<p>모바일과 pc를 넘나들며 입력과 편집을 할수 있는</p>\r\n" + "</br>\r\n" + "<p>한컴오피스 2018을 만나보세요.</p>\r\n"
				+ "</body>\r\n" + "<footer>2018-10-09</footer>\r\n" + "</document>"));
	}

}