package view;

import model.Good;
import controller.SupermarketController;

import java.util.Collection;
import java.util.Scanner;
import java.util.regex.Matcher;

public class ConsoleView {
    private static Scanner scanner = new Scanner(System.in);

    public static void Start() {
        while (true) {
            String command = scanner.nextLine().trim();
            if (ConsoleCommand.EXIT.getStringMatcher(command).matches()) {
                break;
            } else if (ConsoleCommand.ADD_GOOD.getStringMatcher(command).matches()) {
                addGood(command);
            } else if (ConsoleCommand.NEW_ORDER.getStringMatcher(command).matches()) {
                //GO ON
            } else if (ConsoleCommand.END_ORDER.getStringMatcher(command).matches()) {
                //GO ON
            } else if (ConsoleCommand.GOODS_LIST.getStringMatcher(command).matches()) {
                //GO ON
            } else if (ConsoleCommand.TOTAL_SALES.getStringMatcher(command).matches()) {
                //GO ON
            } else if (ConsoleCommand.TOTAL_PROFIT.getStringMatcher(command).matches()) {
                //GO ON
            } else {
                System.out.println("Invalid command");
            }
        }
    }
    private static void addGood(String command) {
        Matcher matcher = ConsoleCommand.ADD_GOOD.getStringMatcher(command);
        if (matcher.find()) {
            String goodName = matcher.group(2);
            boolean isCountable = matcher.group(1).equalsIgnoreCase("countable");
            int count = 0;
            double amount = 0;
            if (isCountable) {
                System.out.println("countable");
            } else {
                System.out.println("uncountable");
            }
        }
    }



    private static void printGoodList() {
        Collection<Good> goods = SupermarketController.getInstance().getGoods();
        System.out.print("+-----------------+------------+------------+\n");
        System.out.print("| Good name       | Inventory  | Price(IRR) |\n");
        System.out.print("+-----------------+------------+------------+\n");
        for (Good good : goods) {
            if (good.isCountable()) {
                System.out.format("| %-15s | %-5d item | %-10d |%n", good.getName(), good.getCount(), good.getSellPrice());
            } else {
                System.out.format("| %-15s | %-7.02f kg | %-10d |%n", good.getName(), good.getAmount(), good.getSellPrice());
            }
        }
        System.out.println("+-----------------+------------+------------+");
    }
}
