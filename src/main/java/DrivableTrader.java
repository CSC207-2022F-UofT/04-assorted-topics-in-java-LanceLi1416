/* Done: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

class DrivableTrader extends Trader<Drivable> {
    /**
     * Construct a DrivableTrader, giving them the given inventory, wishlist, and money.
     *
     * @param inventory Objects in this DrivableTrader's inventory
     * @param wishlist  Objects in this DrivableTrader's wishlist
     * @param money     The DrivableTrader's money
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    /**
     * Construct a DrivableTrader, giving them the given money.
     *
     * @param money The DrivableTrader's money
     */
    public DrivableTrader(int money) {
        super(money);
    }

    /**
     * Returns the object's price (Object's price + Object's max speed) if it's Tradable. If not, return
     * Tradable.MISSING_PRICE.
     *
     * @param object The object whose price is to be calculated
     * @return Object's price + Object's max speed || Tradable.MISSING_PRICE
     */
    @Override
    int getSellingPrice(Drivable object) {
        if (object instanceof Tradable)
            return object.getMaxSpeed() + ((Tradable) object).getPrice();

        return Tradable.MISSING_PRICE;
    }
}