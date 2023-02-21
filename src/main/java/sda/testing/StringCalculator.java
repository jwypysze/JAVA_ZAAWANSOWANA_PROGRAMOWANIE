package sda.testing;

/**
 * TDD - Test Driven Development
 * Pisanie wg podejścia Red -> Green -> Refactor
 * czyli:
 *  Piszemy najmniejszy możliwy niedziałający kawałek kodu
 *  Następnie:
 *   1. Piszemy test do tego kawałka kodu - test się wywala przy uruchomieniu
 *   2. Poprawiamy ten kawałek kodu tak aby test przeszedł
 *   3. Robimy refactor kodu tak aby był ładniejszy, za każdym razerm test (i wszystkie poprzednie testy) ma przechodzić
 *   4. Dostajemy nowy kawałek kodu do napisania - wracamy do pkt 1.
 */

public class StringCalculator {

    public int add(String numbers) {
        int result = 0;
        if(numbers.equals("")) {
            return 0;
        }

        String[] numbersDivided = numbers.split(",");

        for (String givenNumber : numbersDivided) {
            if (Integer.parseInt(givenNumber) >= 1000) {
                throw new IllegalArgumentException("Too Big Number");
            }
            result += Integer.parseInt(givenNumber);
        }
        return result;
    }
}
