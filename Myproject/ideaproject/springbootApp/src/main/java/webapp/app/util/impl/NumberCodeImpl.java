package webapp.app.util.impl;

import java.util.Random;

import org.springframework.stereotype.Component;
import webapp.app.util.interfaces.ICode;

@Component
public class NumberCodeImpl   implements ICode {

	private String[]  numberCodes= {"0","1","2","3","4","5","6","7","8","9"};
	
	@Override
	public String createCode() {
		// TODO Auto-generated method stub
		System.out.println("NumberCodeImpl  is  createCode  ... ");
		
		StringBuilder sb  = new StringBuilder();
		
		Random  r = new Random();
		for(int i=0;i<ICode.CODE_LEN;i++)
		{
			sb.append(numberCodes[r.nextInt(numberCodes.length)]);
		}
		System.out.println("数字验证码:"+sb.toString());
		
		//验证码不能重复???
		return sb.toString();
	}

}
