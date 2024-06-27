import java.util.ArrayList;
import java.util.List;

interface Role {
    void action();
}

class Warrior implements Role {
    @Override
    public void action() {
        System.out.println("Attacks with a sword!");
    }
}

class Mage implements Role {
    @Override
    public void action() {
        System.out.println("Casts a fireball!");
    }
}

class Healer implements Role {
    @Override
    public void action() {
        System.out.println("Heals a teammate!");
    }
}



class Player {
    private String name;
    private List<Role> roles;

    public Player(String name) {
        this.name = name;
        this.roles = new ArrayList<>();
    }

    public void addRole(Role role) {
        roles.add(role);
    }

    public void removeRole(Role role) {
        roles.remove(role);
    }

    public void performAction() {
        for (Role role : roles) {
            role.action();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Hero");

        Role warriorRole = new Warrior();
        Role mageRole = new Mage();
        Role healerRole = new Healer();

        player.addRole(warriorRole);
        player.addRole(mageRole);

        System.out.println("Player's actions:");
        player.performAction();
        // Output:
        // Attacks with a sword!
        // Casts a fireball!

        player.removeRole(warriorRole);

        System.out.println("Player's actions after removing Warrior role:");
        player.performAction();
        // Output:
        // Casts a fireball!
    }
}


