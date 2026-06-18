package com.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {
	
	public static void main(String[] args) throws Exception {
		
		File src = new File("\"C:\\ApacheTestData\\Namsheet1.xlsx\"");
		FileInputStream fls = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fls);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data form Excel is........." + data0);
		
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data form Excel is........." + data1);
		
		wb.close();
		
	}
	
	
}
