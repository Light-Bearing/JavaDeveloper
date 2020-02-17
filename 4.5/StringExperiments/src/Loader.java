
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        //попытался в чистую через индексы, нашел пробел, и понял что дальше он искать будет индекс с этого места, получается без +1 на чистых индексах не выйти...
        int monyVasya = Integer.parseInt(text.substring(text.indexOf("л ")+"л ".length(),text.indexOf(" руб")));
        int monyMasha = Integer.parseInt(text.substring(text.indexOf("Маша - ")+"Маша - ".length(),text.lastIndexOf(" ")));
        System.out.println("Вася и Маша заработали: "+(monyVasya+monyMasha));
    }
}