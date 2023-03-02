package LocalDATE_TIME;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class MainLocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LocalDateTime ahora=LocalDateTime.now();
        System.out.println(ahora);
        DateTimeFormatter formto=DateTimeFormatter.ofPattern("dd-MM-yyyy' Hora: 'hh:mm:ss");
        System.out.println(ahora.format(formto));
        DateTimeFormatter formato1=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.SHORT).withLocale(Locale.getDefault());
        System.out.println(ahora.format(formato1));
        
	}

}
