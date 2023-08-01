import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.JapaneseChronology;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SetLocal {

	// 令和xx年xx月xx日 形式に変換
	public static String setLocalDate(LocalDate localDate) {
		
		if (localDate == null) {
			return "";
		}
		
		DateTimeFormatter japaneseEraDtf = DateTimeFormatter.ofPattern("Gyy年MM月dd日")
				.withChronology(JapaneseChronology.INSTANCE)
				.withLocale(Locale.JAPAN);

		String formattedDate = localDate.format(japaneseEraDtf);

		return formattedDate;
	}

	// 令和xx年xx月xx日 xx時xx分 形式に変換
	public static String setLocalDateTime(LocalDateTime localDateTime) {

		if (localDateTime == null) {
			return "";
		}
		
		DateTimeFormatter japaneseEraDtf = DateTimeFormatter.ofPattern("Gyy年MM月dd日HH時mm分")
				.withChronology(JapaneseChronology.INSTANCE)
				.withLocale(Locale.JAPAN);

		String formattedDateTime = localDateTime.format(japaneseEraDtf);

		return formattedDateTime;
	}
}
