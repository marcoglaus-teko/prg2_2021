package ch.teko.prg2.day01.solution.aufgabe5;

public class Ticketautomat {
    private int fabrikationsnummer;
    private int softwarerelease;

    public Ticketautomat(final int fabrikationsnummer, final int softwarerelease) {
        this.fabrikationsnummer = fabrikationsnummer;
        this.softwarerelease = softwarerelease;
    }

    public double calculatePrice(int parkTimeInMinutes) {
        //Lokale Variablen zum Vergleichen
        int dayInMinutes = 1440;
        int weekInMinutes = 10080;

        //Parkpreis
        double parkingPrice = 0.0;

        //Wenn Parkzeit >= 1 Woche
        if (parkTimeInMinutes >= weekInMinutes) {
            while (parkTimeInMinutes >= weekInMinutes) {
                parkingPrice += 70;
                parkTimeInMinutes -= weekInMinutes;
            }

            while (parkTimeInMinutes >= dayInMinutes) {
                parkingPrice += 20;
                parkTimeInMinutes -= dayInMinutes;
            }

            while (parkTimeInMinutes >= 60) {
                parkingPrice += 1.0;
                parkTimeInMinutes -= 60;
            }
        }

        //Wenn Parkzeit >= 1 Tag
        else if (parkTimeInMinutes >= dayInMinutes) {
            while (parkTimeInMinutes >= dayInMinutes) {
                parkingPrice += 12;
                parkTimeInMinutes -= dayInMinutes;
            }

            while (parkTimeInMinutes >= 60) {
                parkingPrice += 1.0;
                parkTimeInMinutes -= 60;
            }
        }

        //Wenn Parkzeit <= 1 Tag
        else {
            //Kurzparken
            if (parkTimeInMinutes < 30) {
                parkingPrice = 0.0;
            } else if (parkTimeInMinutes <= 90) {
                parkingPrice = 1.5;
            } else if (parkTimeInMinutes <= 120) {
                parkingPrice = 2.0;
            }
            //Ab 120 Minuten
            else {
                parkTimeInMinutes -= 120;
                parkingPrice += 3.5;

                while (parkTimeInMinutes >= 60) {
                    parkingPrice += 1.0;
                    parkTimeInMinutes -= 60;
                }
            }
        }

        return parkingPrice;
    }

    public int getFabrikationsnummer() {
        return fabrikationsnummer;
    }

    public void setFabrikationsnummer(int fabrikationsnummer) {
        this.fabrikationsnummer = fabrikationsnummer;
    }

    public int getSoftwarerelease() {
        return softwarerelease;
    }

    public void setSoftwarerelease(int softwarerelease) {
        this.softwarerelease = softwarerelease;
    }

    public static void main(String[] args) {
        Ticketautomat t1 = new Ticketautomat(1233, 123123);
        System.out.println(t1.calculatePrice(20160));
        System.out.println(t1.calculatePrice(20220));
        System.out.println(t1.calculatePrice(21600));
        System.out.println(t1.calculatePrice(11520));
        System.out.println(t1.calculatePrice(10080));
        System.out.println(t1.calculatePrice(10081));
        System.out.println(t1.calculatePrice(10140));
        System.out.println(t1.calculatePrice(8640));
        System.out.println(t1.calculatePrice(8700));
        System.out.println(t1.calculatePrice(180));
        System.out.println(t1.calculatePrice(121));
        System.out.println(t1.calculatePrice(120));
    }

}
