package ifsc.projeto.pesquisa.sd.ws.utilidades;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static Date criarData(int dia, int mes, int ano) {
		Calendar lCalendar = Calendar.getInstance();
		lCalendar.set(Calendar.YEAR, ano);
		lCalendar.set(Calendar.MONTH, mes);
		lCalendar.set(Calendar.DAY_OF_MONTH, dia);
		return lCalendar.getTime();
	}
}
