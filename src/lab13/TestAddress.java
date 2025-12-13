package lab13;

public class TestAddress {
    public static void main(String[] args) {
        String[] addresses1 = {"Бразилия, Сан-Паулу, Сан-Паулу, Авенида Паулиста, 1000, Б, 25"};
        String[] addresses2 = {
                "Япония, Токио, Токио, Сибуя, 15, А, 8",                          // Без дефисов в числах
                "Италия, Ломбардия. Милан; Виа Монтенаполеоне, 12, Б, 3"          // Только запятые
        };
        for (String addr : addresses1) {
            try {
                toStringAdress a = new toStringAdress();
                a.Splittt(addr);
                System.out.println(a);
            } catch (Exception e) {
                System.out.println("Ошибка " + addr);
            }
        }
        System.out.println("-----------------------------");
        for (String addr : addresses2) {
            try {
                toStringAdress a = new toStringAdress();
                a.Ttokenizer(addr);
                System.out.println(a);
            } catch (Exception e) {
                System.out.println("Ошибка " + addr);
            }
        }
    }
}
