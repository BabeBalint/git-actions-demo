public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    // Ez a metódus külső szolgáltatást használ (pl. adatbázis vagy API)
    public boolean isResultStored(int result) {
        // Valós alkalmazásban itt történne a külső szolgáltatás hívása
        return result >= 0;
    }
}