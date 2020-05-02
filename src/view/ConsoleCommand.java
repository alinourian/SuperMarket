package view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ConsoleCommand {
    EXIT("(?i)exit"),
    ADD_GOOD("(?i)add\\s+(countable|uncountable)\\s+good\\s+(\\w+)"),
    NEW_ORDER("(?!)new\\s+order\\s+from\\s+(\\w+)"),
    END_ORDER("(?!)end\\s+order"),
    GOODS_LIST("(?!)goods\\s+list"),
    TOTAL_SALES("(?!)total\\s+sales(\\s+(--cash|--credit))?"),
    TOTAL_PROFIT("(?!)total\\s+profit");

    private Pattern commandPattern;

    ConsoleCommand(String commandPatternString) {
        this.commandPattern = Pattern.compile(commandPatternString);
    }

    public Matcher getStringMatcher(String input) {
        return commandPattern.matcher(input);
    }


}
