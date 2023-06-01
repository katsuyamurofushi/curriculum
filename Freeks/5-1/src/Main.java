import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
			//      問① 下記例の配列をString型しか格納できないように修正してください。
			//		現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
			//	       例List<Object> array = new ArrayList<>();
			//		また、arrayには[hoge, pos, foo]の文字列３要素を入れてください。
			//	    <以下記述>
			List<String> arrList = new ArrayList<String>();
			arrList.add("hoge");
			arrList.add("pos");
			arrList.add("foo");
			//			System.out.println(arrList.get(1));
			//      問② arrayの二つ目の要素を"bar"にしましょう。
			arrList.set(1, "bar");
			//			System.out.println(arrList.get(1));
			//	　<以下記述>
			//      問③ fooが格納されているインデックスを出力してください。
			//	　<以下記述>
			System.out.println(arrList.get(2) + "のインデックス:" + 2);
		}

		{
			//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
			Map<String, Object> map = new HashMap<>();
			//	　<以下記述>
			map.put("first", "1番");
			map.put("furits", "果物");
			map.put("language", "日本語");

			//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
			//	    <以下記述>
			//		System.out.println(map.get("furits"));
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				System.out.println("Key:" + entry.getKey());
			}
			//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
			//	    <以下記述>
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				System.out.println("value:" + entry.getValue());
			}
		}
		{
			//      問⑦ Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
			Calendar cal = Calendar.getInstance();
			//	    <以下記述>
			Integer Y = cal.get(Calendar.YEAR);
			Integer M = cal.get(Calendar.MONTH) + 1;
			Integer D = cal.get(Calendar.DATE);
			Integer arrayDate[] = { Y, M, D };

			//			List<Integer>arrayDate = new ArrayList<Integer>();
			//			arrayDate.add(cal.get(Calendar.YEAR));
			//			arrayDate.add(cal.get(Calendar.MONTH)+1);
			//			arrayDate.add(cal.get(Calendar.DATE));
			//      問⑧ 配列arrayDateをList型に置換しましょう。
			//      ヒント：asListメソッドはプリミティブ型のデータ型のみ扱えます。
			//	    <以下記述>
			List<Integer> list = Arrays.asList(arrayDate);
			//					List<int[]>list = Arrays.asList(arrayDate);
			//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
			//	    <以下記述>
			
			for (Integer arr : list) {
				System.out.println(arr);
			}
		}
	}

}