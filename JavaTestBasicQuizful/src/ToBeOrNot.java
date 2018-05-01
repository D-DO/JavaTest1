public class ToBeOrNot {

        public static void main(String[] args) throws Exception {
            boolean toBe = true;
            PrinceOfDenmark hamlet = new PrinceOfDenmark();
            hamlet.askYourself((toBe || !toBe));
        }
    }

    class PrinceOfDenmark {
        void askYourself(boolean mind) {
            if (mind) {
                System.out.println("I will be a good citizen!");
            }
            else {
                System.out.println("And nothing else!");
            }
        }
    }