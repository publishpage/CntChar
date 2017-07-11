import java.util.Arrays;
import java.util.Scanner;


public class CntChar {
  public static void main (String[] args) {
        
    System.out.println("文字を入力して下さい。入力後エンターキー");

    Scanner scan = new Scanner(System.in);

    String str = scan.next();

    System.out.println(str);

    // char型配列に変換
    char[] charAry = str.toCharArray();

    // 配列ソート
    Arrays.sort(charAry);

    int cnt=1;//出現回数
    int t=0;//検索する文字

    for(int i=1;i<charAry.length;i++){
      if(charAry[t]==charAry[i]){
        cnt++;
      }else{
        System.out.println (charAry[t] +" は "+cnt+"回");
        cnt=1;
        t=i;
      }
    }
    // 配列最終要素の出力
    System.out.println (charAry[t] +" は "+cnt+"回");	
  }
}