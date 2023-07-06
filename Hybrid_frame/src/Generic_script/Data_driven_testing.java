package Generic_script;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_driven_testing {
		public static String gatData(String sh,int r,int c)
		{
			String value=null;
			try {
				FileInputStream fis=new FileInputStream("./Excell/Hybrid.xlsx");
				Workbook book=WorkbookFactory.create(fis);
				Sheet sheet = book.getSheet(sh);
				Row row = sheet.getRow(r);
				Cell cell = row.getCell(c);
			   value=cell.toString();
			}
			// updates
			//extra
			//hjfjf
			catch(Exception e)
			{
				System.out.println(e);
			}
			return value;
		}
		
		

	}



