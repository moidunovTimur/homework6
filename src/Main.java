public class Main {
    public static void main(String[] args) {
Boss boss = new Boss();
boss.setBossHealth(400);
boss.setBossDamage(55);
boss.weapon.setCOLDWeapon(WeaponType.COLDWeapon);
        System.out.println(boss.getBossHealth());
        System.out.println(boss.getBossDamage());
        System.out.println(boss.getWeapon());
    }
}