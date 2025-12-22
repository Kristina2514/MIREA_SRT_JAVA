package lab04;

public class SeasonTest {
    public static void main(String[] args) {
        /// 1)
        Seasons favs = Seasons.SUMMER;
        System.out.println("Мое любимое время года: " + favs);
        System.out.println("Температура: " + favs.getSrt() + "°C");
        System.out.println("Описание: " + favs.getDescription());
        System.out.println();

        System.out.println("Проверка метода fav:");
        Seasons.fav(favs);
        System.out.println();
        /// 6)
        System.out.println("Все времена года:");
        for (Seasons season : Seasons.values()) {
            System.out.printf("%s: %.1f°C - %s%n",
                    season,
                    season.getSrt(),
                    season.getDescription());
        }
    }
    
}
