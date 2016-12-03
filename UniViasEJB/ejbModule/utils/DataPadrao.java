package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataPadrao {
	
	public static String formatoDataPadrao(Date data){
		if (data != null) {
			return new SimpleDateFormat("dd/MM/yyyy").format(data);
		} else {
			return "";
		}
	}
	
}
