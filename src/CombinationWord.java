import java.util.Scanner;


public class CombinationWord {	

public static void main(String[] args) throws Exception {
    
	
	Scanner input = new Scanner(System. in) ;
	System.out.print ("Input Word: ");
	String word = input.nextLine();
	
    StringBuffer strBuf = new StringBuffer(word);
    doPerm(strBuf,0);
}

private static void doPerm(StringBuffer word, int index){

    if(index == word.length())
        System.out.println(word);            
    else {
        doPerm(word, index+1);
        for (int i = index+1; i < word.length(); i++) {
            swap(word,index, i);
            doPerm(word, index+1);
            swap(word,i, index);
        }
    }
}

private  static void swap(StringBuffer word, int pos1, int pos2){
    char t1 = word.charAt(pos1);
    word.setCharAt(pos1, word.charAt(pos2));
    word.setCharAt(pos2, t1);
}
}   