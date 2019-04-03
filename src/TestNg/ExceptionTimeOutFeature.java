package TestNg;

import org.testng.annotations.Test;

public class ExceptionTimeOutFeature {
	@Test(invocationTimeOut=1)// if we dont proivide invocationTimeOut then it will run forever but if we use invocationTimeOut =2 it will stop afetr 1 sec 
    public void infinityLoop(){
		int i=1;
		while(i==1){
		System.out.println("@Test - infinityLoop"+ 1);
		}
	}

}
