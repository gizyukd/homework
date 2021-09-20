package fourth.seasons;

public enum ENUMSEASONS {
    JANUARY("winter"),
    FEBRUARY("winter"),
    MARCH("spring"),
    APRIL("spring"),
    MAY("spring"),
    JUNE("summer"),
    JULY("summer"),
    AUGUST("summer"),
    SEPTEMBER("autumn"),
    OCTOBER("autumn"),
    NOVEMBER("autumn"),
    DECEMBER("winter");

    private String month;

    ENUMSEASONS(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void findSeason(ENUMSEASONS month){
        switch (month){
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("winter");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("spring");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("summer");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("autumn");
                break;
            //  case FEBRUARY.name().toLowerCase(Locale.ROOT): (почему идея ругается)
            default:
                System.out.println("A mistake in month's name");

        }

    }

}
