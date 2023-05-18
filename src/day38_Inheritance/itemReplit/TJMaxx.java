package day38_Inheritance.itemReplit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * represents TJMaxx store class.
 * https://tjmaxx.com/
 */
public class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        //TODO
        regularItems = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }


    /**
     * adds an item object to regularItems list
     *
     * @param item
     */
    public void addRegularItem(Item item) {
        regularItems.add(item);

    }

    /**
     * adds OnSaleItem object to onSaleItems list
     *
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);


    }

    /**
     * getter for regularItems
     *
     * @return
     */
    public List<Item> getRegularItems() {
        //TODO change from null 
        return regularItems;
    }

    /**
     * getter for onSaleItems
     *
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     *
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        int count = regularItems.size();
//        for (Item regularItem : regularItems) {
//
//            count += regularItem.getQuantity();
//        }

//I think these sentence are the reason for the confusion.  //* return count of regularItem object    //* * returns count of onSaleItems in TJ Maxx  --- is it total number of item quantities or total item types?
        return count;
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     *
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        int count = 0;
        for (OnSaleItem onSaleItem : onSaleItems) {
            count += onSaleItem.getQuantity();
        }



        return count;
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     *
     * @return
     */
    public List<String> getAllItemNames() {
        List<String> allItems = new ArrayList<>();

        for (Item regularItem : regularItems) {
            allItems.add(regularItem.getName());
        }

        for (OnSaleItem onSaleItem : onSaleItems) {
            allItems.add(onSaleItem.getName());
        }


        return allItems;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     *
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber) {
        for (OnSaleItem onSaleItem : onSaleItems) {
            if (onSaleItem.getCatalogNumber() == catalogNumber) {
                return onSaleItem.getPrice();
            }
        }
        for (Item regularItem : regularItems) {
            if (regularItem.getCatalogNumber() == catalogNumber) {
                return regularItem.getPrice();
            }
        }

        return 0.0;

    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     *
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name) {
        for (OnSaleItem onSaleItem : onSaleItems) {
            if (onSaleItem.getName().equals(name)) {
                return onSaleItem;
            }
        }

        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     *
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {

        onSaleItems.removeIf(p -> p.getCatalogNumber() == catalogNumber);
        regularItems.removeIf(p -> p.getCatalogNumber() == catalogNumber);

    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     * - decrease the count of the Item by 1
     * - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {

        for (OnSaleItem onSaleItem : onSaleItems) {

            if (onSaleItem.getCatalogNumber() == catalogNumber) {
                onSaleItem.setQuantity(onSaleItem.getQuantity() - 1);
                if (onSaleItem.getQuantity() == 0) {
                    removeItem(catalogNumber);
                    return;
                }
            }


        }

        for (Item regularItem : regularItems) {
            if (regularItem.getCatalogNumber() == catalogNumber) {
                regularItem.setQuantity(regularItem.getQuantity() - 1);
                if (regularItem.getQuantity() == 0) {
                    removeItem(catalogNumber);
                    return;
                }
            }

        }

    }

}
