
package WorkingWithAbstraction_Exercise_01.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        var bag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            long amount = Long.parseLong(safe[i + 1]);

            String gem = "";

            if (name.length() == 3) {
                gem = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                gem = "Gem";
            } else if (name.equalsIgnoreCase("gold")) {
                gem = "Gold";
            }

            if (gem.equals("")) {
                continue;
            } else if (input < bag.values().stream()
                    .map(Map::values)
                    .flatMap(Collection::stream)
                    .mapToLong(e -> e).sum() + amount) {
                continue;
            }

            switch (gem) {
                case "Gem":
                    if (!bag.containsKey(gem)) {
                        if (chekingAmountBiggerThanGold(bag, "Gold", amount)) continue;
                    } else if (bag.get(gem).values()
                            .stream()
                            .mapToLong(e -> e)
                            .sum() + amount > bag.get("Gold").values()
                                                                .stream()
                                                                .mapToLong(e -> e)
                                                                .sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(gem)) {
                        if (chekingAmountBiggerThanGold(bag, "Gem", amount)) continue;
                    } else if (bag.get(gem).values()
                            .stream()
                            .mapToLong(e -> e).sum() + amount > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(gem)) {
                bag.put((gem), new LinkedHashMap<>());
            }

            if (!bag.get(gem).containsKey(name)) {
                bag.get(gem).put(name, 0L);
            }
            bag.get(gem).put(name, bag.get(gem).get(name) + amount);
        }

        bag.forEach((key, value) -> {
            Long sumValues = value.values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s", key, sumValues);
            System.out.println();

            value.entrySet().stream()
                    .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                    .forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        });
    }

    private static boolean chekingAmountBiggerThanGold(LinkedHashMap<String, LinkedHashMap<String, Long>> bag, String Gold, long amount) {
        if (bag.containsKey(Gold)) {
            return amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum();
        } else {
            return true;
        }
    }
}