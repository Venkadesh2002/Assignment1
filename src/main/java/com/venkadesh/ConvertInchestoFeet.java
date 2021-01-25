package com.venkadesh;

public class ConvertInchestoFeet {
    
	public void convert(int inches)
	{
		int a=inches/12;
		int b=inches%12;
		StringBuilder sb=new StringBuilder();
		sb.append("The convertion of ");
		sb.append(inches);
		sb.append("\"");
		sb.append(" is ");
		sb.append(a);
		sb.append("\' ");
		sb.append(b);
		sb.append("\"");
		sb.append(".");
		System.out.println(sb);
	}
}
