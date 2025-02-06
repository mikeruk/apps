package tema12ArraysExerciseMore;

import java.util.Scanner;

public class P01EncryptSortAndPrintArrayJavaFundamentalsDrVariant {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
        int numberInput=Integer.parseInt(sc.nextLine());
        String[] arrayStr=new String[numberInput];
        int[] arrayInt=new int[numberInput];
        //
        for (int i = 0; i <numberInput ; i++) {
            arrayStr[i]=sc.nextLine();
 
            int sum=0;
            for (int j = 0; j <arrayStr[i].length() ; j++) {
 
                char ch=arrayStr[i].charAt(j);
                if ((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')) {
                    switch (ch) {
                        case 'a':
                        case 'o':
                        case 'i':
                        case 'u':
                        case 'e':
                        case 'A':
                        case 'O':
                        case 'I':
                        case 'U':
                        case 'E':
                            sum += ((int) ch * arrayStr[i].length());
                            break;
                        default:
                            sum += ((int) ch / arrayStr[i].length());
 
                    }
                }
            }
            arrayInt[i]=sum;
  
        }
         //sort
        for (int i = 0; i <arrayInt.length-1; i++) {
            for (int j = i+1; j <arrayInt.length ; j++) {
                if (arrayInt[i]>arrayInt[j]){
                        int temp=arrayInt[i];
                        arrayInt[i]=arrayInt[j];
                        arrayInt[j]=temp;
                }
            }
 
        }
        //print
        for (int i = 0; i <arrayInt.length ; i++) {
            System.out.println(arrayInt[i]);
 
        }

	}

}
