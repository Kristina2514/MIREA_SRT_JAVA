package lab04;

public enum Seasons {
    /// 3)
    WINTER(-5, "Холодное время года") {
        public String getDescription() {
            return "Холодное время года";
        }
    },

    SPRING(10, "Холодное время года") {
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SUMMER(25, "Теплое время года") {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(8, "Холодное время года") {
        public String getDescription() {
            return "Холодное время года";
        }
    };
    private final String description;
    /// 4)
    private final double srt;

    Seasons(double srt, String description) {
        this.description = description;
        this.srt = srt;
    }

    public double getSrt() {
        return srt;
    }

    /// 2)
    public static void fav(Seasons season) {
        switch (season) {
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
    }

    /// 5)
    public String getDescription() {
        return description;
    }

}

