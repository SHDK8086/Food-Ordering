package Class;

public class MenuItem {

    
    private String location;
    private String name;
    private String category;
    private String foodItem;
    private String description;
    private String ratings;
    private String price;

    public
    MenuItem (String location, String name, String category, String foodItem, String description, String ratings, String price) {
        this.location = location;
        this.name = name;
        this.category = category;
        this.foodItem = foodItem;
        this.description = description;
        this.ratings = ratings;
        this.price = price;
    }

    public
    String getLocation () {
        return location;
    }

    public
    void setLocation (String location) {
        this.location = location;
    }

    public
    String getName () {
        return name;
    }

    public
    void setName (String name) {
        this.name = name;
    }

    public
    String getCategory () {
        return category;
    }

    public
    void setCategory (String category) {
        this.category = category;
    }

    public
    String getFoodItem () {
        return foodItem;
    }

    public
    void setFoodItem (String foodItem) {
        this.foodItem = foodItem;
    }

    public
    String getDescription () {
        return description;
    }

    public
    void setDescription (String description) {
        this.description = description;
    }

    public
    String getRatings () {
        return ratings;
    }

    public
    void setRatings (String ratings) {
        this.ratings = ratings;
    }

    public
    String getPrice () {
        return price;
    }

    public
    void setPrice (String price) {
        this.price = price;
    }

    

}
