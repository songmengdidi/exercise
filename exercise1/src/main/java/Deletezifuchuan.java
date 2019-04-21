import java.util.Scanner;
public class Deletezifuchuan {
    public static void main(String[] args){
        System.out.println("请输入字符串:");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("请输入要删除的字符串:");
        String str2=sc.nextLine();
        for(int i=0;i<str2.length();i++){
            str1=str1.replaceAll(str2.substring(i,i+1),"");
        }
        System.out.println("删除后的字符串"+str1);
    }
}
