package ch.teko.prg2.day02.solution.aufgabe3.ticketautomat;

public class Ticketautomat implements ITicketautomat {
    private int fabrikationsnummer;
    private int softwarerelease;

    public Ticketautomat(final int fabrikationsnummer, final int softwarerelease) {
        this.fabrikationsnummer = fabrikationsnummer;
        this.softwarerelease = softwarerelease;
    }

    @Override
    public double calculateParkingPrice(int parkTimeInMinutes) {
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
        System.out.println(t1.calculateParkingPrice(20160));
        System.out.println(t1.calculateParkingPrice(20220));
        System.out.println(t1.calculateParkingPrice(21600));
        System.out.println(t1.calculateParkingPrice(11520));
        System.out.println(t1.calculateParkingPrice(10080));
        System.out.println(t1.calculateParkingPrice(10081));
        System.out.println(t1.calculateParkingPrice(10140));
        System.out.println(t1.calculateParkingPrice(8640));
        System.out.println(t1.calculateParkingPrice(8700));
        System.out.println(t1.calculateParkingPrice(180));
        System.out.println(t1.calculateParkingPrice(121));
        System.out.println(t1.calculateParkingPrice(120));
    }

}
