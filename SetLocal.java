import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.JapaneseChronology;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SetLocal {

	public static String setLocalDate(LocalDate localDate) {

		// 令和xx年xx月xx日 形式に変換
		DateTimeFormatter japaneseEraDtf = DateTimeFormatter.ofPattern("Gyy年MM月dd日")
				.withChronology(JapaneseChronology.INSTANCE)
				.withLocale(Locale.JAPAN);

		String formattedDate = localDate.format(japaneseEraDtf);

		return formattedDate;
	}

	public static String setLocalDateTime(LocalDateTime localDateTime) {

		// 令和xx年xx月xx日 xx時xx分 形式に変換
		DateTimeFormatter japaneseEraDtf = DateTimeFormatter.ofPattern("Gyy年MM月dd日HH時mm分")
				.withChronology(JapaneseChronology.INSTANCE)
				.withLocale(Locale.JAPAN);

		String formattedDateTime = localDateTime.format(japaneseEraDtf);

		return formattedDateTime;
	}
}
