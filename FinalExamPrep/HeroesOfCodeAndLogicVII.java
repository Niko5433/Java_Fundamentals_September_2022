package FinalExamPrep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> mapHp = new LinkedHashMap<>();
        Map<String, Integer> mapMana = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String heroesPowerHp = scanner.nextLine(); //Solmyr 85 120
            String hero = heroesPowerHp.split(" ")[0];
            int hitPoints = Integer.parseInt(heroesPowerHp.split(" ")[1]);
            int mana = Integer.parseInt(heroesPowerHp.split(" ")[2]);

            if(hitPoints <= 100) {
                mapHp.put(hero, hitPoints);
            }

            if(mana <= 200) {
                mapMana.put(hero, mana);
            }
        }

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("End")) {
            String[] commandArr = commandInput.split(" - ");
            String command = commandArr[0];
            String heroName = commandArr[1];

            switch (command) {
                case "CastSpell":
                    //"CastSpell – {hero name} – {MP needed} – {spell name}"
                    int neededMana = Integer.parseInt(commandArr[2]);
                    String spellName = commandArr[3];
                    if (mapMana.get(heroName) >= neededMana) {
                        mapMana.put(heroName, mapMana.get(heroName) - neededMana);
                        int leftMana = mapMana.get(heroName);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, leftMana);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    //"TakeDamage – {hero name} – {damage} – {attacker}"
                    int damage = Integer.parseInt(commandArr[2]);
                    String attacker = commandArr[3];
                    mapHp.put(heroName, mapHp.get(heroName) - damage);
                    int leftHp = mapHp.get(heroName);

                    if (mapHp.get(heroName) > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, leftHp);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        mapHp.remove(heroName);
                        mapMana.remove(heroName);
                    }
                    break;
                case "Recharge":
                    //"Recharge – {hero name} – {amount}"
                    int amountToRecharge = Integer.parseInt(commandArr[2]);
                    int currentMana = mapMana.get(heroName);
                    int totMana = currentMana + amountToRecharge;
                    int rechargedMana = 0;

                    if (totMana >= 200) {
                        rechargedMana = 200 - mapMana.get(heroName);
                        mapMana.put(heroName, 200);
                    } else {
                        rechargedMana = amountToRecharge;
                        mapMana.put(heroName, totMana);
                    }
                    System.out.printf("%s recharged for %d MP!%n", heroName, rechargedMana);

                    break;
                case "Heal":
                    //"Heal – {hero name} – {amount}"
                    int amountToHeal = Integer.parseInt(commandArr[2]);
                    int currentHp = mapHp.get(heroName);
                    int totHp = currentHp + amountToHeal;
                    int rechargedHp = 0;

                    if (totHp >= 100) {
                        rechargedHp = 100 - mapHp.get(heroName);
                        mapHp.put(heroName, 100);
                    } else {
                        rechargedHp = amountToHeal;
                        mapHp.put(heroName, totHp);
                    }
                    System.out.printf("%s healed for %d HP!%n", heroName, rechargedHp);
                    break;
            }
            commandInput = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : mapHp.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("  HP: " + entry.getValue());
            System.out.println("  MP: " + mapMana.get(entry.getKey()));
        }


    }
}
