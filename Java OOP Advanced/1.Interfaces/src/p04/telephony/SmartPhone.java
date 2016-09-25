package p04.telephony;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ELISAV on 7.9.2016 г..
 */
public class SmartPhone implements Callable, Searchable {

    private List<String> numbers;
    private List<String> urls;

    public SmartPhone(List<String> numbers, List<String> urls) {


        setNumbers(numbers);
        setUrls(urls);
    }

    private void setNumbers(List<String> numbers) {
        this.numbers = new LinkedList<>();
        this.numbers = numbers;
    }


    private void setUrls(List<String> urls) {
        this.urls = new LinkedList<>();
        this.urls = urls;

    }

    @Override
    public String call() {
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("[^0-9]+");
        for (String number : numbers) {
            Matcher matcher = pattern.matcher(number);
            if (matcher.find()) {
                stringBuilder.append("Invalid number!")
                        .append(System.lineSeparator());
            } else {
                stringBuilder.append("Calling... ")
                        .append(number)
                        .append(System.lineSeparator());
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String search() {
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("[0-9]+");
        for (String url : urls) {
            Matcher matcher = pattern.matcher(url);
            if (matcher.find()) {
                stringBuilder.append("Invalid URL!")
                        .append(System.lineSeparator());
            } else {
                stringBuilder.append("Browsing: ")
                        .append(url)
                        .append("!")
                        .append(System.lineSeparator());
            }
        }
        return stringBuilder.toString();
    }
}
