public class StoreCheckClass {

        public static void main(String[] args) {
            boolean isEdekaOpen = true;  // например, магазин открыт
            boolean isReweOpen = false;  // например, магазин закрыт

            boolean canBuy = canBuy(isEdekaOpen, isReweOpen);
            System.out.println("Я могу купить еду, это " + canBuy);
        }

        public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
            return isEdekaOpen || isReweOpen;
        }
}
