//package lab2final;
import java.util.Scanner;
public class E15385lab01q2 {


//package lab02;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
System.out.print("Enter the color : "); //tell user to give input
int col1=keyboard.nextInt();//take input from the user
int col2=keyboard.nextInt();//take input from the user
int col3=keyboard.nextInt();//take input from the user
int com1=255-col1; //calculate the value of the complementary colour
int com2=255-col2;  //calculate the value of the complementary colour
int com3=255-col3;  //calculate the value of the complementary colour
int grey=0;
if(Math.abs(col1-com1)<=32){//com1=col1+128;
	grey++;//check the difference between the given colour and the recieved value
//if(com1>255){com1=col1-128;}
}              // if value difference overflows 32 change the value of the inverted color
if(Math.abs(col2-com2)<=32){grey++;//com2=col2+128;
//if(com2>255){com2=col2-128;}
}
if(Math.abs(col3-com3)<=32){//com3=col3+128;
	grey++;
//if(com3>255){com3=col3-128;}
}
//CHECK WEATHER GIVEN THREE COLORS ARE GREY IF SO procedd as given in thr lab task.
if(grey==3){
	com1=col1+128;
	if(com1>255){com1=col1-128;}
	com2=col2+128;
	if(com2>255){com2=col2-128;}
	com3=col3+128;
	if(com3>255){com3=col3-128;}
}
System.out.println("The complement : "+com1+" "+com2+" "+com3); //print the 
keyboard.close();
	}

}
