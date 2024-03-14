import java.io.LineNumberReader;
import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("<1 uzduotis>");
        // 1 uzduotis Sukurkite 4 kintamuosius, kurie saugotų jūsų vardą, pavardę, gimimo metus ir
        // šiuos metus (nebūtinai tikrus). Parašykite kodą, kuris pagal gimimo metus paskaičiuotų jūsų
        // amžių ir naudodamas vardo ir pavardės kintamuosius atspausdintų tokį sakinį :
        //"Aš esu Vardenis Pavardenis. Man yra XX metai(ų)".
        String vardas = "Beatričė";
        String pavarde = "Gaškienė";
        int siandien = 2024;
        int gimimas = 1998;

        System.out.println("As esu " + vardas + " " + pavarde + ". Man " + (siandien - gimimas) + " metai");

        System.out.println("<2 uzduotis>");
        // 2 uzduotis. Sukurkite du kintamuosius ir naudodamiesi funkcija Math.random() jiems priskirkite
        // atsitiktines reikšmes nuo 0 iki 4. Didesnę reikšmę padalinkite iš mažesnės. Atspausdinkite rezultatą
        // jį suapvalinę iki 2 skaičių po kablelio.
        double num1 = Math.random() * 4.0;
        double num2 = Math.random() * 4.0;
        System.out.println(num1 + " " + num2);
        if (num1 != 0 && num2 != 0) {
            if (num1 < num2) {
                System.out.println(Math.round(100.0 * num2 / num1) / 100.0);
            } else {
                System.out.println(Math.round(100.0 * num1 / num2) / 100.0);
            }
        } else {
            System.out.println("Dalyba iš 0 negalima");
        }

        System.out.println("<3 uzduotis>");
        // 3 uzduotis. Naudokite funkcija Math.random(). Sukurkite tris kintamuosius ir naudodamiesi funkcija
        // Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 25. Raskite ir atspausdinkite
        // kintąmąjį turintį vidurinę reikšmę.

        double rand1 = (double) Math.round(0 + Math.random() * 25);
        double rand2 = (double) Math.round(0 + Math.random() * 25);
        double rand3 = (double) Math.round(0 + Math.random() * 25);

        System.out.println(rand1 + " " + rand2 + " " + rand3);

        if ((rand2 < rand1 && rand1 < rand3) || (rand3 < rand1 && rand1 < rand2)) {
            System.out.println("vidurinis skaicius yra " + rand1);
        }
        if ((rand1 < rand2 && rand2 < rand3) || (rand3 < rand2 && rand2 < rand1)) {
            System.out.println("vidurinis skaicius yra " + rand2);
        }
        if ((rand1 < rand3 && rand3 < rand2) || (rand2 < rand3 && rand3 < rand1)) {
            System.out.println("vidurinis skaicius yra " + rand3);
        }
        if (rand1 == rand2 || rand2 == rand3 || rand1 == rand3) {
            System.out.println("vidurinio skaičiaus nėra");
        }

        System.out.println("<4 uzduotis>");
        //4 uzduotis. Įvedami skaičiai - a, b, c –kraštinių ilgiai, trys kintamieji (naudojame int)
        // (naudokite Math.random() funkcija nuo 1 iki 10). Parašykite Java programą, kuri nustatytų,
        // ar galima sudaryti trikampį ir atsakymą atspausdintų.

        int krA = (int) Math.round(1 + Math.random() * (10 - 1));
        int krB = (int) Math.round(1 + Math.random() * (10 - 1));
        int krC = (int) Math.round(1 + Math.random() * (10 - 1));

        System.out.println(krA + " " + krB + " " + krC);
        int krAB = krA + krB;
        int krAC = krA + krC;
        int krBC = krB + krC;

        if (krAB <= krC || krBC <= krA || krAC <= krB) {
            System.out.println("Trikampio suformuoti negalima");
        } else {
            System.out.println("Galima suformuoti trikampį");
        }

        System.out.println("<5 uzduotis>");
//5 uzduotis. Sukurkite keturis kintamuosius ir Math.random() funkcija sugeneruokite jiems
//reikšmes nuo 0 iki 2. Suskaičiuokite kiek yra nulių, vienetų ir dvejetų. (sprendimui masyvo nenaudoti).

        int sk1 = (int) Math.round(Math.random() * 2);
        int sk2 = (int) Math.round(Math.random() * 2);
        int sk3 = (int) Math.round(Math.random() * 2);
        int sk4 = (int) Math.round(Math.random() * 2);
        System.out.println(sk1 + " " + sk2 + " " + sk3 + " " + sk4);

        int countZeros = 0;
        int countOnes = 0;
        int countTwos = 0;


        if (sk1 == 0) {
            countZeros++;
        }
        if (sk1 == 1) {
            countOnes++;
        }
        if (sk1 == 2) {
            countTwos++;
        }

        if (sk2 == 0) {
            countZeros++;
        }
        if (sk2 == 1) {
            countOnes++;
        }
        if (sk2 == 2) {
            countTwos++;
        }

        if (sk3 == 0) {
            countZeros++;
        }
        if (sk3 == 1) {
            countOnes++;
        }
        if (sk3 == 2) {
            countTwos++;
        }

        if (sk4 == 0) {
            countZeros++;
        }
        if (sk4 == 1) {
            countOnes++;
        }
        if (sk4 == 2) {
            countTwos++;
        }

        System.out.println("nuliai: " + countZeros);
        System.out.println("vienetai: " + countOnes);
        System.out.println("dvejetai: " + countTwos);

        System.out.println("<6 uzduotis>");
//6 uzduotis. Naudokite funkcija Math.random(). Sukurkite ir atspausdinkite 3 skaičius nuo -10 iki 10.
// Skaičiai mažesni už 0 turi būti  laužtiniuose skliaustuose [], 0 -  (), didesni už 0 {}.
// [-4],  (0),  {7}
        int min = -10;
        int max = 10;
        int rn1 = (int) (min + Math.round(Math.random() * (max - min)));
        int rn2 = (int) (min + Math.round(Math.random() * (max - min)));
        int rn3 = (int) (min + Math.round(Math.random() * (max - min)));
        System.out.println(rn1 + " " + rn2 + " " + rn3);
        if (rn1 > 0) {
            System.out.println("{" + rn1 + "}");
        }
        if (rn1 == 0) {
            System.out.println("(" + rn1 + ")");
        }
        if (rn1 < 0) {
            System.out.println("[" + rn1 + "]");
        }
        if (rn2 > 0) {
            System.out.println("{" + rn2 + "}");
        }
        if (rn2 == 0) {
            System.out.println("(" + rn2 + ")");
        }
        if (rn2 < 0) {
            System.out.println("[" + rn2 + "]");
        }
        if (rn3 > 0) {
            System.out.println("{" + rn3 + "}");
        }
        if (rn3 == 0) {
            System.out.println("(" + rn3 + ")");
        }
        if (rn3 < 0) {
            System.out.println("[" + rn3 + "]");
        }

        System.out.println("<7 uzduotis>");
        // Įmonė parduoda žvakes po 1 EUR. Perkant daugiau kaip 1000 vienetų taikoma 3 % nuolaida,
        // daugiau kaip 2000 vienetų- 4 % nuolaida. Parašykite programą, kuri skaičiuos žvakių kainą
        // ir atspausdintų atsakymą kiek žvakių ir kokia kaina perkama. Žvakių kiekį generuokite Math.random()
        // funkcija nuo 5 iki 3000.

        min = 5;
        max = 3000;
        int zvk = (int) (min + Math.round(Math.random() * (max - min)));
        int kaina = 1;
        System.out.println("žvakių skaičius: " + zvk);
        if (zvk <= 1000) {
            System.out.println("žvakių kaina: " + zvk * kaina);
        }
        if (zvk > 1000 && zvk <= 2000) {
            System.out.println("žvakių kaina: " + zvk * 0.97 * kaina);
        }
        if (zvk > 2000) {
            System.out.println("žvakių kaina: " + zvk * 0.96 * kaina);
        }

        System.out.println("<8 uzduotis>");
        //Naudokite funkcija Math.random(). Sukurkite tris kintamuosius su atsitiktinėm reikšmėm nuo 0 iki 100.
        // Paskaičiuokite jų aritmetinį vidurkį. Ir aritmetinį vidurkį atmetus tas reikšmes, kurios yra
        // mažesnės nei 10 arba didesnės nei 90. Abu vidurkius atspausdinkite. Rezultatus apvalinkite
        // iki sveiko skaičiaus.

        min = 0;
        max = 100;
        int kin1 = (int) (min + Math.round(Math.random() * (max - min)));
        int kin2 = (int) (min + Math.round(Math.random() * (max - min)));
        int kin3 = (int) (min + Math.round(Math.random() * (max - min)));
        System.out.println(kin1 + " " + kin2 + " " + kin3);
        System.out.println("vidurkis su: " + (kin1 + kin2 + kin3) / 3);
        if (kin1 < 10 || kin1 > 90) {
            kin1 = 0;
        }
        if (kin2 < 10 || kin2 > 90) {
            kin2 = 0;
        }
        if (kin3 < 10 || kin3 > 90) {
            kin3 = 0;
        }
        System.out.println(kin1 + " " + kin2 + " " + kin3);
        if (kin1 == 0 || kin2 == 0 || kin3 == 0) {
            System.out.println("vidurkis be: " + (kin1 + kin2 + kin3) / 2);
        } else {
            System.out.println("vidurkis yra tik su visais 3 skaičiais");
        }

        System.out.println("<9 uzduotis>");
        // Padarykite skaitmeninį laikrodį, rodantį valandas, minutes ir sekundes.
        // Valandom, minutėm ir sekundėm sugeneruoti panaudokite funkciją Math.random().
        // Sugeneruokite skaičių nuo 0 iki 300. Tai papildomos sekundės. Skaičių pridėkite prie
        // jau sugeneruoto laiko. Atspausdinkite laikrodį prieš ir po sekundžių pridėjimo ir pridedamų
        // sekundžių skaičių.


        int valandos = (int) (0 + Math.round(Math.random() * 24));
        int minutes = (int) (0 + Math.round(Math.random() * 59));
        int sekundes = (int) (0 + Math.round(Math.random() * 59));
        String sekunde1 = String.format("%02d", sekundes );
        String minute1 = String.format("%02d", minutes );
        String valanda1 = String.format("%02d", valandos );
        System.out.println(valanda1 + ":" + minute1 + ":" + sekunde1);

        int papsek = (int) (Math.round(Math.random() * 300));
        int nauj = (int) sekundes + papsek;
        if (nauj < 59) {
            sekundes = nauj ;
        }
        if (nauj > 59 && nauj < 119) {
            sekundes = nauj - 1*60 ;
        }
        if (nauj > 119 && nauj < 179) {
            sekundes = nauj - 2*60 ;
        }
        if (nauj > 179 && nauj < 239) {
            sekundes = nauj - 3*60 ;
        }
        if (nauj > 239 && nauj < 299) {
            sekundes = nauj - 4*60 ;
        }
        if (nauj > 299 && nauj < 359) {
            sekundes = nauj - 5*60 ;
        }


        if (nauj > 59 && nauj < 119) {
            minutes = minutes + 1 ;
        }
        if (nauj > 119 && nauj < 179) {
            minutes = minutes + 2 ;
        }
        if (nauj > 179 && nauj < 239) {
            minutes = minutes + 3 ;
        }
        if (nauj > 239 && nauj < 299) {
            minutes = minutes + 4 ;
        }
        if (nauj > 299 && nauj < 359) {
            minutes = minutes + 5 ;
        }


        if (minutes > 59) {
            valandos = valandos + 1 ;
        }
        System.out.println("pridedamos sekundės: " + papsek + " sek");
        String sekunde2 = String.format("%02d", sekundes );
        String minute2 = String.format("%02d", minutes );
        String valanda2 = String.format("%02d", valandos );
        System.out.println(valanda2 + ":" + minute2 + ":" + sekunde2);

        System.out.println("<10 uzduotis>");
//      Naudokite funkcija Math.random(). Sugeneruokite 6 kintamuosius su atsitiktinem reikšmėm
//      nuo 1000 iki 9999. Atspausdinkite reikšmes viename strige, išrūšiuotas
//      nuo didžiausios iki mažiausios, atskirtas tarpais. Naudoti ciklų ir masyvų NEGALIMA.

        min=1000;
        max=9999;
        int a1 = (int) (0 + Math.round(Math.random() * (max - min)));
        int a2 = (int) (0 + Math.round(Math.random() * (max - min)));
        int a3 = (int) (0 + Math.round(Math.random() * (max - min)));
        int a4 = (int) (0 + Math.round(Math.random() * (max - min)));
        int a5 = (int) (0 + Math.round(Math.random() * (max - min)));
        int a6 = (int) (0 + Math.round(Math.random() * (max - min)));

        System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6);

        if (a1 < a2 && a1 < a3 && a1 < a4 && a1 < a5 && a1 < a6) {
            System.out.println("1: " + a1);
        }
        if (a2 < a1 && a2 < a3 && a2 < a4 && a2 < a5 && a2 < a6) {
            System.out.println("1: " + a2);
        }
        if (a3 < a2 && a3 < a1 && a3 < a4 && a3 < a5 && a3 < a6) {
            System.out.println("1: " + a3);
        }
        if (a4 < a2 && a4 < a3 && a4 < a1 && a4 < a5 && a4 < a6) {
            System.out.println("1: " + a4);
        }
        if (a5 < a2 && a5 < a3 && a5 < a4 && a5 < a1 && a5 < a6) {
            System.out.println("1: " + a5);
        }
        if (a6 < a2 && a6 < a3 && a6 < a4 && a6 < a5 && a6 < a1) {
            System.out.println("1: " + a6);
        }

        if (      a1 > a2 && a1 < a3 && a1 < a4 && a1 < a5 && a1 < a6
                ||a1 > a3 && a1 < a2 && a1 < a4 && a1 < a5 && a1 < a6
                ||a1 > a4 && a1 < a2 && a1 < a3 && a1 < a5 && a1 < a6
                ||a1 > a5 && a1 < a2 && a1 < a3 && a1 < a4 && a1 < a6
                ||a1 > a6 && a1 < a2 && a1 < a3 && a1 < a4 && a1 < a5) {
            System.out.println("2: " + a1);
        }
        if (      a2 > a1 && a2 < a3 && a2 < a4 && a2 < a5 && a2 < a6
                ||a2 > a3 && a2 < a1 && a2 < a4 && a2 < a5 && a2 < a6
                ||a2 > a4 && a2 < a1 && a2 < a3 && a2 < a5 && a2 < a6
                ||a2 > a5 && a2 < a1 && a2 < a3 && a2 < a4 && a2 < a6
                ||a2 > a6 && a2 < a1 && a2 < a3 && a2 < a4 && a2 < a5) {
            System.out.println("2: " + a2);
        }
        if (      a3 > a2 && a3 < a1 && a3 < a4 && a3 < a5 && a3 < a6
                ||a3 > a4 && a3 < a1 && a3 < a2 && a3 < a5 && a3 < a6
                ||a3 > a5 && a3 < a1 && a3 < a2 && a3 < a4 && a3 < a6
                ||a3 > a6 && a3 < a1 && a3 < a2 && a3 < a4 && a3 < a5
                ||a3 > a1 && a3 < a2 && a3 < a6 && a3 < a4 && a3 < a5) {
            System.out.println("2: " + a3);
        }
        if (      a4 > a2 && a4 < a3 && a4 < a1 && a4 < a5 && a4 < a6
                ||a4 > a3 && a4 < a2 && a4 < a1 && a4 < a5 && a4 < a6
                ||a4 > a5 && a4 < a2 && a4 < a1 && a4 < a3 && a4 < a6
                ||a4 > a6 && a4 < a2 && a4 < a1 && a4 < a3 && a4 < a5
                ||a4 > a1 && a4 < a2 && a4 < a6 && a4 < a3 && a4 < a5) {
            System.out.println("2: " + a4);
        }
        if (a5 > a2 && a5 < a3 && a5 < a4 && a5 < a1 && a5 < a6
                ||a5 > a3 && a5 < a2 && a5 < a4 && a5 < a1 && a5 < a6
                ||a5 > a4 && a5 < a2 && a5 < a3 && a5 < a1 && a5 < a6
                ||a5 > a6 && a5 < a2 && a5 < a3 && a5 < a1 && a5 < a4
                ||a5 > a1 && a5 < a2 && a5 < a3 && a5 < a6 && a5 < a4) {
            System.out.println("2: " + a5);
        }
        if (      a6 > a2 && a6 < a3 && a6 < a4 && a6 < a5 && a6 < a1
                ||a6 > a3 && a6 < a2 && a6 < a4 && a6 < a5 && a6 < a1
                ||a6 > a4 && a6 < a2 && a6 < a3 && a6 < a5 && a6 < a1
                ||a6 > a5 && a6 < a2 && a6 < a3 && a6 < a4 && a6 < a1
                ||a6 > a1 && a6 < a2 && a6 < a3 && a6 < a4 && a6 < a5) {
            System.out.println("2: " + a6);
        }



        if (      a1 > a2 && a1 > a3 && a1 < a4 && a1 < a5 && a1 < a6
                ||a1 > a2 && a1 > a4 && a1 < a3 && a1 < a5 && a1 < a6
                ||a1 > a2 && a1 > a5 && a1 < a3 && a1 < a4 && a1 < a6
                ||a1 > a2 && a1 > a6 && a1 < a3 && a1 < a4 && a1 < a5

                ||a1 > a3 && a1 > a4 && a1 < a2 && a1 < a5 && a1 < a6
                ||a1 > a3 && a1 > a5 && a1 < a2 && a1 < a4 && a1 < a6
                ||a1 > a3 && a1 > a6 && a1 < a2 && a1 < a4 && a1 < a5

                ||a1 > a4 && a1 > a5 && a1 < a2 && a1 < a3 && a1 < a6
                ||a1 > a4 && a1 > a6 && a1 < a2 && a1 < a3 && a1 < a5

                ||a1 > a5 && a1 > a6 && a1 < a2 && a1 < a3 && a1 < a4

        ) {
            System.out.println("3: " + a1);
        }
        if (      a2 > a1 && a2 > a3 && a2 < a4 && a2 < a5 && a2 < a6
                ||a2 > a1 && a2 > a4 && a2 < a3 && a2 < a5 && a2 < a6
                ||a2 > a1 && a2 > a5 && a2 < a3 && a2 < a4 && a2 < a6
                ||a2 > a1 && a1 > a6 && a2 < a3 && a2 < a4 && a2 < a5

                ||a2 > a3 && a2 > a4 && a2 < a1 && a2 < a5 && a2 < a6
                ||a2 > a3 && a2 > a5 && a2 < a1 && a2 < a4 && a2 < a6
                ||a2 > a3 && a2 > a6 && a2 < a1 && a2 < a4 && a2 < a5

                ||a2 > a4 && a2 > a5 && a2 < a1 && a2 < a3 && a2 < a6
                ||a2 > a4 && a2 > a6 && a2 < a1 && a2 < a3 && a2 < a5

                ||a2 > a5 && a2 > a6 && a2 < a1 && a2 < a3 && a2 < a4
        ) {
               System.out.println("3: " + a2);
        }
        if (      a3 > a1 && a3 > a2 && a3 < a4 && a3 < a5 && a3 < a6
                ||a3 > a1 && a3 > a4 && a3 < a2 && a3 < a5 && a3 < a6
                ||a3 > a1 && a3 > a5 && a3 < a2 && a3 < a4 && a3 < a6
                ||a3 > a1 && a3 > a6 && a3 < a2 && a3 < a4 && a3 < a5

                ||a3 > a2 && a3 > a4 && a3 < a1 && a3 < a5 && a3 < a6
                ||a3 > a2 && a3 > a5 && a3 < a1 && a3 < a4 && a3 < a6
                ||a3 > a2 && a3 > a6 && a3 < a1 && a3 < a4 && a3 < a5

                ||a3 > a4 && a3 > a5 && a3 < a1 && a3 < a2 && a3 < a6
                ||a3 > a4 && a3 > a6 && a3 < a1 && a3 < a2 && a3 < a5

                ||a3 > a5 && a3 > a6 && a3 < a1 && a3 < a2 && a3 < a4
        ) {
                System.out.println("3: " + a3);
        }
        if (      a4 > a1 && a4 > a2 && a4 < a3 && a4 < a5 && a4 < a6
                ||a4 > a1 && a4 > a3 && a4 < a2 && a4 < a5 && a4 < a6
                ||a4 > a1 && a4 > a5 && a4 < a2 && a4 < a3 && a4 < a6
                ||a4 > a1 && a4 > a6 && a4 < a2 && a4 < a3 && a4 < a5

                ||a4 > a2 && a4 > a3 && a4 < a1 && a4 < a5 && a4 < a6
                ||a4 > a2 && a4 > a5 && a4 < a1 && a4 < a3 && a4 < a6
                ||a4 > a2 && a4 > a6 && a4 < a1 && a4 < a3 && a4 < a5

                ||a4 > a3 && a4 > a5 && a4 < a1 && a4 < a2 && a4 < a6
                ||a4 > a3 && a4 > a6 && a4 < a1 && a4 < a2 && a4 < a5

                ||a4 > a5 && a4 > a6 && a4 < a1 && a4 < a2 && a4 < a3
        ) {
                System.out.println("3: " + a4);
        }
        if (      a5 > a1 && a5 > a2 && a5 < a3 && a5 < a4 && a5 < a6
                ||a5 > a1 && a5 > a3 && a5 < a2 && a5 < a4 && a5 < a6
                ||a5 > a1 && a5 > a4 && a5 < a2 && a5 < a3 && a5 < a6
                ||a5 > a1 && a5 > a6 && a5 < a2 && a5 < a3 && a5 < a4

                ||a5 > a2 && a5 > a3 && a5 < a1 && a5 < a4 && a5 < a6
                ||a5 > a2 && a5 > a4 && a5 < a1 && a5 < a3 && a5 < a6
                ||a5 > a2 && a5 > a6 && a5 < a1 && a5 < a3 && a5 < a4

                ||a5 > a3 && a5 > a4 && a5 < a1 && a5 < a2 && a5 < a6
                ||a5 > a3 && a5 > a6 && a5 < a1 && a5 < a2 && a5 < a4

                ||a5 > a4 && a5 > a6 && a5 < a1 && a5 < a2 && a5 < a3
        ) {

                System.out.println("3: " + a5);
        }
        if (      a6 > a1 && a6 > a2 && a6 < a3 && a6 < a4 && a6 < a5
                ||a6 > a1 && a6 > a3 && a6 < a2 && a6 < a5 && a6 < a4
                ||a6 > a1 && a6 > a4 && a6 < a2 && a6 < a3 && a6 < a5
                ||a6 > a1 && a6 > a5 && a6 < a2 && a6 < a3 && a6 < a4

                ||a6 > a2 && a6 > a3 && a6 < a1 && a6 < a4 && a6 < a5
                ||a6 > a2 && a6 > a4 && a6 < a1 && a6 < a3 && a6 < a5
                ||a6 > a2 && a6 > a5 && a6 < a1 && a6 < a3 && a6 < a4

                ||a6 > a3 && a6 > a4 && a6 < a1 && a6 < a2 && a6 < a5
                ||a6 > a3 && a6 > a5 && a6 < a1 && a6 < a2 && a6 < a4

                ||a6 > a4 && a6 > a6 && a6 < a1 && a6 < a2 && a6 < a3
        ) {
            System.out.println("3: " + a6);
        }
//        a2<a3<a4< a1 <a5<a6
//        a5<a3<a4< a1 <a2<a6
//        a2<a5<a4< a1 <a3<a6
//        a2<a3<a5< a1 <a4<a6
//
//        a6<a3<a4< a1 <a2<a5
//        a2<a6<a4< a1 <a3<a5
//        a6<a3<a2< a1 <a4<a5
//
//        a5<a3<a6< a1 <a2<a4
//        a2<a5<a6< a1 <a3<a4
//
//        a5<a3<a4< a1 <a2<a3

        if (      a2 < a1 && a3 < a1 && a4 < a1 && a1 > a5 && a1 > a6
                ||a5 < a1 && a3 < a1 && a4 < a1 && a1 > a2 && a1 > a6
                ||a2 < a1 && a5 < a1 && a4 < a1 && a1 > a3 && a1 > a6
                ||a2 < a1 && a3 < a1 && a5 < a1 && a1 > a4 && a1 > a6

                ||a6 < a1 && a3 < a1 && a4 < a1 && a1 > a2 && a1 > a5
                ||a2 < a1 && a6 < a1 && a4 < a1 && a1 > a3 && a1 > a5
                ||a6 < a1 && a3 < a1 && a2 < a1 && a1 > a4 && a1 > a5

                ||a5 < a1 && a3 < a1 && a6 < a1 && a1 > a2 && a1 > a4
                ||a2 < a1 && a5 < a1 && a6 < a1 && a1 > a3 && a1 > a4

                ||a5 < a1 && a3 < a1 && a4 < a1 && a1 > a2 && a1 > a3

        ) {
            System.out.println("4: " + a1);
        }
        if (
                a1 < a2 && a3 < a2 && a4 < a2 && a2 > a5 && a2 > a6
              ||a5 < a2 && a3 < a2 && a4 < a2 && a2 > a1 && a2 > a6
              ||a1 < a2 && a5 < a2 && a4 < a2 && a2 > a3 && a2 > a6
              ||a1 < a2 && a3 < a2 && a5 < a2 && a2 > a4 && a2 > a6

              ||a6 < a2 && a3 < a2 && a4 < a2 && a2 > a1 && a2 > a5
              ||a1 < a2 && a6 < a2 && a4 < a2 && a2 > a3 && a2 > a5
              ||a6 < a2 && a3 < a2 && a1 < a2 && a2 > a4 && a2 > a5

              ||a5 < a2 && a3 < a2 && a6 < a2 && a2 > a1 && a2 > a4
              ||a1 < a2 && a5 < a2 && a6 < a2 && a2 > a3 && a2 > a4

              ||a5 < a2 && a3 < a2 && a4 < a2 && a2 > a1 && a2 > a3) {

            System.out.println("4: " + a2);
        }
        if (
                          a1 < a3 && a2 < a3 && a4 < a3 && a3 > a5 && a3 > a6
                        ||a5 < a3 && a2 < a3 && a4 < a3 && a3 > a1 && a3 > a6
                        ||a1 < a3 && a5 < a3 && a4 < a3 && a3 > a2 && a3 > a6
                        ||a1 < a3 && a2 < a3 && a5 < a3 && a3 > a4 && a3 > a6

                        ||a6 < a3 && a2 < a3 && a4 < a3 && a3 > a1 && a3 > a5
                        ||a1 < a3 && a6 < a3 && a4 < a3 && a3 > a2 && a3 > a5
                        ||a6 < a3 && a2 < a3 && a1 < a3 && a3 > a4 && a3 > a5

                        ||a5 < a3 && a2 < a3 && a6 < a3 && a3 > a1 && a3 > a4
                        ||a1 < a3 && a5 < a3 && a6 < a3 && a3 > a2 && a3 > a4

                        ||a5 < a3 && a2 < a3 && a4 < a3 && a3 > a1 && a3 > a2) {

            System.out.println("4: " + a3);
        }
        if (
                          a1 < a4 && a2 < a4 && a3 < a4 && a4 > a5 && a4 > a6
                        ||a5 < a4 && a2 < a4 && a3 < a4 && a4 > a1 && a4 > a6
                        ||a1 < a4 && a5 < a4 && a3 < a4 && a4 > a2 && a4 > a6
                        ||a1 < a4 && a2 < a4 && a5 < a4 && a4 > a3 && a4 > a6

                        ||a6 < a4 && a2 < a4 && a3 < a4 && a4 > a1 && a4 > a5
                        ||a1 < a4 && a6 < a4 && a3 < a4 && a4 > a2 && a4 > a5
                        ||a6 < a4 && a2 < a4 && a1 < a4 && a4 > a3 && a4 > a5

                        ||a5 < a4 && a2 < a4 && a6 < a4 && a4 > a1 && a4 > a3
                        ||a1 < a4 && a5 < a4 && a6 < a4 && a4 > a2 && a4 > a3

                        ||a5 < a4 && a2 < a4 && a3 < a4 && a4 > a1 && a4 > a2) {

            System.out.println("4: " + a4);
        }
        if (
                          a1 < a5 && a2 < a5 && a3 < a5 && a5 > a4 && a5 > a6
                        ||a4 < a5 && a2 < a5 && a3 < a5 && a5 > a1 && a5 > a6
                        ||a1 < a5 && a4 < a5 && a3 < a5 && a5 > a2 && a5 > a6
                        ||a1 < a5 && a2 < a5 && a4 < a5 && a5 > a3 && a5 > a6

                        ||a6 < a5 && a2 < a5 && a3 < a5 && a5 > a1 && a5 > a4
                        ||a1 < a5 && a6 < a5 && a3 < a5 && a5 > a2 && a5 > a4
                        ||a6 < a5 && a2 < a5 && a1 < a5 && a5 > a3 && a5 > a4

                        ||a4 < a5 && a2 < a5 && a6 < a5 && a5 > a1 && a5 > a3
                        ||a1 < a5 && a4 < a5 && a6 < a5 && a5 > a2 && a5 > a3

                        ||a4 < a5 && a2 < a5 && a3 < a5 && a5 > a1 && a5 > a2) {


            System.out.println("4: " + a5);
        }
        if (
                          a1 < a6 && a2 < a6 && a3 < a6 && a6 > a4 && a6 > a5
                        ||a4 < a6 && a2 < a6 && a3 < a6 && a6 > a1 && a6 > a5
                        ||a1 < a6 && a4 < a6 && a3 < a6 && a6 > a2 && a6 > a5
                        ||a1 < a6 && a2 < a6 && a4 < a6 && a6 > a3 && a6 > a5

                        ||a5 < a6 && a2 < a6 && a3 < a6 && a6 > a1 && a6 > a4
                        ||a1 < a6 && a5 < a6 && a3 < a6 && a6 > a2 && a6 > a4
                        ||a5 < a6 && a2 < a6 && a1 < a6 && a6 > a3 && a6 > a4

                        ||a4 < a6 && a2 < a6 && a5 < a6 && a6 > a1 && a6 > a3
                        ||a1 < a6 && a4 < a6 && a5 < a6 && a6 > a2 && a6 > a3

                        ||a4 < a6 && a2 < a6 && a3 < a6 && a6 > a1 && a6 > a2) {

        System.out.println("4: " + a6);
        }


        if (      a1 > a2 && a1 > a3 && a1 > a4 && a1 > a5 && a1 < a6
                ||a1 > a6 && a1 > a2 && a1 > a4 && a1 > a5 && a1 < a3
                ||a1 > a6 && a1 > a2 && a1 > a3 && a1 > a5 && a1 < a4
                ||a1 > a6 && a1 > a2 && a1 > a3 && a1 > a4 && a1 < a5
                ||a1 > a6 && a1 > a5 && a1 > a3 && a1 > a4 && a1 < a2) {
            System.out.println("5: " + a1);
        }
        if (      a2 > a1 && a2 > a3 && a2 > a4 && a2 > a5 && a2 < a6
                ||a2 > a6 && a2 > a1 && a2 > a4 && a2 > a5 && a2 < a3
                ||a2 > a6 && a2 > a1 && a2 > a3 && a2 > a5 && a2 < a4
                ||a2 > a6 && a2 > a1 && a2 > a3 && a2 > a4 && a2 < a5
                ||a2 > a6 && a2 > a5 && a2 > a3 && a2 > a4 && a2 < a1) {

                System.out.println("5: " + a2);
        }
        if (      a3 > a1 && a3 > a2 && a3 > a4 && a3 > a5 && a3 < a6
                ||a3 > a6 && a3 > a1 && a3 > a4 && a3 > a5 && a3 < a2
                ||a3 > a6 && a3 > a1 && a3 > a2 && a3 > a5 && a3 < a4
                ||a3 > a6 && a3 > a1 && a3 > a2 && a3 > a4 && a3 < a5
                ||a3 > a6 && a3 > a5 && a3 > a2 && a3 > a4 && a3 < a1) {
        System.out.println("5: " + a3);
        }
        if (      a4 > a1 && a4 > a2 && a4 > a3 && a4 > a5 && a4 < a6
                ||a4 > a6 && a4 > a1 && a4 > a3 && a4 > a5 && a4 < a2
                ||a4 > a6 && a4 > a1 && a4 > a2 && a4 > a5 && a4 < a3
                ||a4 > a6 && a4 > a1 && a4 > a2 && a4 > a3 && a4 < a5
                ||a4 > a6 && a4 > a5 && a4 > a2 && a4 > a3 && a4 < a1) {
            System.out.println("5: " + a4);
        }
        if  (     a5 > a1 && a5 > a2 && a5 > a3 && a5 > a4 && a5 < a6
                ||a5 > a6 && a5 > a1 && a5 > a3 && a5 > a4 && a5 < a2
                ||a5 > a6 && a5 > a1 && a5 > a2 && a5 > a4 && a5 < a3
                ||a5 > a6 && a5 > a1 && a5 > a2 && a5 > a3 && a5 < a4
                ||a5 > a6 && a5 > a4 && a5 > a2 && a5 > a3 && a5 < a1) {
            System.out.println("5: " + a5);
        }
        if (      a6 > a1 && a6 > a2 && a6 > a3 && a6 > a4 && a6 < a5
                ||a6 > a5 && a6 > a1 && a6 > a3 && a6 > a4 && a6 < a2
                ||a6 > a5 && a6 > a1 && a6 > a2 && a6 > a4 && a6 < a3
                ||a6 > a5 && a6 > a1 && a6 > a2 && a6 > a3 && a6 < a4
                ||a6 > a5 && a6 > a4 && a6 > a2 && a6 > a3 && a6 < a1) {
            System.out.println("5: " + a6);
        }

//
//--git config --global user.name "beagas"
//--git config --global user.email "beatrice.gaskiene@gmail.com"









    }
}