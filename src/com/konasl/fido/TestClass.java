/**
 * 
 */
package com.konasl.fido;

import javax.xml.bind.DatatypeConverter;

/**
 * @author LeNoVo
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Hex = "073E073E073E073E";
		byte[] bytes = DatatypeConverter.parseHexBinary(Hex);
		System.out.println("Byte Length " + bytes.length);
		int x = java.nio.ByteBuffer.wrap(bytes).order(java.nio.ByteOrder.LITTLE_ENDIAN).getInt();
		System.out.println("Little Endian : " + x);
		
		int x1 = java.nio.ByteBuffer.wrap(bytes).getInt();
		System.out.println("Big Endian : " + x1);

	}

}
