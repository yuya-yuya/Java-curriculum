package study;

/**
 *
 * 本課題では、継承・オーバーロードメソッドの基本的な使い方を学んでいきましょう。
 * 課題は問①から問③まであります。
 * 指定された値と変数名を守って記述してください。
 *
 * @author s.nanaumi
 */
public class Main {

    public static void main(String[] args) {

        // ③ Taskクラスのインスタンスを生成し、「doTask()」メソッドを呼び出しなさい。
    	Task task = new Task();
    	int taskvalue1 = task.Calculatorplus(10);
    	int taskvalue2 = task.Calculatorplus(15,15);
    	int taskvalue3 = task.Calculatorplus(20,20,20);

    	System.out.println(taskvalue1);
    	System.out.println(taskvalue2);
    	System.out.println(taskvalue3);

    }

}