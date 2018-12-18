import java.io.*;
public class Cenzor {

    public static String runCensor(String sourceText){
        String [] newString = sourceText.split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");
        String cenzure = "";
        for (String str: newString) {
            if (str.contains("гайк") | str.contains("Гайк") | str.contains("гаек")) {
                str = "вырезано цензурой";
            }
            if (str.matches("(?U)[\\\\p{Punct}&&[^@',&]]")) {
                cenzure += str;
            } else {
                cenzure += " " + str;
                //System.out.println(str);
            }
        }
        return cenzure = cenzure.replaceAll("\\s+(?=\\p{Punct})", "");

    }

    public static void main(String[] args) {
        String book = "...\n"+ "Седьмого числа сего июля железнодорожный сторож Иван Семенов Акинфов,\n" +
                "проходя утром по линии, на 141-й версте, застал тебя за отвинчиванием\n" +
                "гайки, коей рельсы прикрепляются к шпалам. Вот она, эта гайка!.. С каковою\n" +
                "гайкой он и задержал тебя. Так ли это было?\n" +
                "— Чаво?\n" +
                "— Так ли всё это было, как объясняет Акинфов?\n" +
                "— Знамо, было.\n" +
                "— Хорошо; ну, а для чего ты отвинчивал гайку?\n" +
                "— Чаво?\n" +
                "— Ты это свое «чаво» брось, а отвечай на вопрос! для чего ты отвинчивал\n" +
                "гайку?\n" +
                "— Коли б не нужна была, не отвинчивал бы, — хрипит Денис, косясь на\n" +
                "потолок.\n" +
                "— Для чего же тебе понадобилась эта гайка?\n" +
                "— Гайка-то? Мы из гаек грузила делаем...\n" +
                "— Кто это — мы?\n" +
                "— Мы, народ... Климовские мужики, то есть.\n" +
                "— Послушай, братец, не прикидывайся ты мне идиотом, а говори толком.\n" +
                "Нечего тут про грузила врать!\n" +
                "...";
        System.out.println(runCensor(book));
    }
}
