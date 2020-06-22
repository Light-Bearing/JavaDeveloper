import java.util.regex.Pattern;

public class TextControl {
    public static final String PATTERN_SURNAME = "[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]*-?[а-яё]*";
    public static final String PATTERN_NAME = "[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]*";
    public static final String PATTERN_PATRONYMIC = "[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]*";
    public static final String PATTERN_FIO = "[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]*-?[а-яё]*(\\s++[А-ЯЁ&&[^ЪЬЫ]]{0,1}[а-яё]*){0,2}";

    public static boolean valideInput(String pattern, String input) {
        return Pattern.compile(pattern).matcher(input).matches();
    }
}
